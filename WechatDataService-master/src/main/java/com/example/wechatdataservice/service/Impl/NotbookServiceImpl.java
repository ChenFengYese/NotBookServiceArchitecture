package com.example.wechatdataservice.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wechatdataservice.domain.Notbook;
import com.example.wechatdataservice.mapper.NotbookMapper;
import com.example.wechatdataservice.service.NotbookService;

@Slf4j
@Service
public class NotbookServiceImpl extends ServiceImpl<NotbookMapper, Notbook> implements NotbookService{

    @Resource
    NotbookMapper notbookMapper; // 备忘录数据库操作

    @Resource
    private StringRedisTemplate stringRedisTemplate; // redis操作

    @Resource
    private RabbitTemplate rabbitTemplate; // rabbitmq操作

    @Override
    public JSON aif(Notbook notbook) { // 修改备忘录
        if(notbook.getUid()==null||notbook.getUid().equals("")||notbook.getSuid()==null||notbook.getSuid()==0){ // uid和suid不能为空
            JSONObject json = new JSONObject();
            json.put("msg","fail");
            json.put("details" , "uid和suid不能为空");
            return json;
        }
        log.info(String.valueOf(notbook));
        SubTextAddInfo(notbook);
        notbookMapper.aif(notbook); // 修改备忘录
        JSONObject json = new JSONObject();
        json.put("msg","success");
        return json;
    }

//    @Override
//    public List<Notbook> gif(Notbook notbook) {
//        return notbookMapper.gif(notbook);
//    }

    @Override
    public JSON gif_s(Notbook notbook, Integer GetValueWay, Integer publicOrPrivate) { // 获取单个备忘录
        JSONObject json = new JSONObject();
        // 获取公开的备忘录,不需要验证token,默认是不公开,走null
        Notbook getinfo_s = publicOrPrivate==null?notbookMapper.gif_s(notbook):notbookMapper.gif_s_public(notbook);
        if(getinfo_s == null){
            json.put("msg","fail");
            json.put("details" , "没有找到该备忘录");
            return json;
        }
        if(textJudgeForElements(getinfo_s,GetValueWay)){
            json.put("msg","success");
            json.put("details" , getinfo_s);}
        else {
            json.put("msg","fail");
            json.put("details" , getinfo_s);
        }
        return json;
    }

    @Override
    public JSON addif(Notbook notbook) { // 添加备忘录
        if (notbook.getSuid() == null || notbook.getSuid().toString().isEmpty()){
            List<Integer> suidList = GetSuidList(notbook);
            int rd = 1;
            while (true){
                if (!suidList.contains(rd)){
                    notbook.setSuid(rd);// 添加新备忘录时生成一个不重复的suid(备忘录id)
                    break;
                }
                rd++;
            }
        }
        SubTextAddInfo(notbook);
        notbookMapper.addif(notbook);
        JSONObject json = new JSONObject();
        json.put("msg","success");
        return json;
    }

    private void SubTextAddInfo(Notbook notbook) {
        String nn = notbook.getText();
        textJudgeForElements(notbook,1);
        if(notbook.getText().length()>100) {
            notbook.setSubtext(notbook.getText().substring(0, 100)); // 截取前100个字符作为摘要
        }else {
            notbook.setSubtext(notbook.getText());
        }
        notbook.setText(nn);
    }

    @Override
    public JSON deleteif(Notbook notbook) { // 删除备忘录
        notbookMapper.deleteif(notbook);
        JSONObject json = new JSONObject();
        json.put("msg","success");
        return json;
    }

    @Override
    public List<Integer> GetSuidList(Notbook notbook) {
        return notbookMapper.GetSuidList(notbook);
    } // 获取suid列表

    @Override
    public String GetTitleList(Notbook notbook) {
        return notbookMapper.GetTitleList(notbook);
    } // 获取title列表

    @Override
    public List<Notbook> sortByCollect(Notbook notbook) {
        return notbookMapper.sortByCollect(notbook);
    } // 获取收藏列表
//
//    @Override
//    public List<Notbook> sortByTime(Notbook notbook) {
//        return notbookMapper.sortByTime(notbook);
//    }
//
//    @Override
//    public Notbook TOKEN_INVALID(Notbook notbook) {
//        return notbookMapper.TOKEN_INVALID(notbook);
//    }

//    @Override
//    public List<Notbook> sortBySuid(Notbook notbook) {
//        return notbookMapper.sortBySuid(notbook);
//    }

    @Override
    public JSON collectBySuid(Notbook notbook) { // 收藏备忘录
        notbookMapper.collectBySuid(notbook);
        JSONObject json = new JSONObject();
        json.put("msg","success");
        return json;
    }

    @Override
    public JSON searchByArgs(String uid, String args) { // 搜索备忘录
        JSONObject json = new JSONObject(true);
        if(args==null||args.length()==0){ json.put("msg","null");return json;}
        else{
            args = "%" + args + "%"; // 模糊查询
            List<Notbook> searchList = notbookMapper.searchByArgs(uid,args);
            for (Notbook n : searchList){
                json.put(n.getSuid().toString()+" " , n);
            }
            return json;
        }
    }

    @Override
    public JSON GetTitleBySuid(Notbook notbook) { // 获取备忘录标题
        log.info(String.valueOf(notbook));
        JSONObject json = new JSONObject(true);
        if(Objects.equals(notbook.getUid(), "null") ||notbook.getSuid()==0){
            json.put("msg","error");
        }else {
            json.put("details", notbookMapper.gif_s_title(notbook));
        }
        return json;
    }

    @Override
    public List<Integer> getSuidListNotDeleted(Notbook notbook) {
        return notbookMapper.getSuidListNotDeleted(notbook);
    }
    // 获取未删除的suid列表
    public boolean verify(String token,String uid) { //token验证
        final String SECRET = "!##**trumpet@LB360365851**##!"; //密钥
        try {
            if (Objects.equals(stringRedisTemplate.opsForValue().get(uid), token)){ //验证token是否与id匹配，redis中存有id:token键值对
                Algorithm algorithm = Algorithm.HMAC256(SECRET); // 加密算法
                JWTVerifier verifier = JWT.require(algorithm).build(); // 验证器
                DecodedJWT jwt = verifier.verify(token); // 验证token
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public JSON gif(Notbook notbook, HttpServletRequest request){ //获取备忘录
//        根据是否收藏以及时间排序，收藏优先级 > 时间
        JSONObject json = new JSONObject(true);
        if (verify(request.getHeader("Authorization"),notbook.getUid())){ //token合法验证
//        if (true){
            List<Notbook> collectList = notbookMapper.sortByCollect(notbook);
            List<Notbook> timeList = notbookMapper.sortByTime(notbook);
            for (Notbook n : collectList){
                json.put(n.getSuid().toString()+" " , n);
            }
            for (Notbook n : timeList){
                json.put(n.getSuid().toString()+" " , n);
            }
        } else {
            json.put("msg","E30001");
        }
        return json;
//        List<Notbook> lst = notbookMapper.gif(notbook);
//        for(Notbook n : lst){
//            textJudgeForElements(n,1);
//            if(n.getText().length()>100)
//                n.setSubtext(n.getText().substring(0,100)); // 截取前100个字符作为摘要
//            else
//                n.setSubtext(n.getText());
//            notbookMapper.aif_subtext(n);
//        }
//        JSONObject json = new JSONObject();
//        json.put("msg","success");
//        return json;
    }
    @Override
    public JSON sortBySuid(Notbook notbook,HttpServletRequest request){
        JSONObject json = new JSONObject(true);
        List<Notbook> collectList = notbookMapper.sortByCollect(notbook);
        List<Notbook> suidList = notbookMapper.sortBySuid(notbook);
        for (Notbook n : collectList){
            json.put(n.getSuid().toString()+" " , n);
        }
        for (Notbook n : suidList){
            json.put(n.getSuid().toString()+" " , n);
        }
        return json;
    }

    public Boolean textJudgeForElements(Notbook n,Integer GetValueWay){
        //GetValueWay=1时，提取文本格式内容，为微信端服务
        //GetValueWay=2时，提取html格式内容，为网页端服务
        //n为Notbook对象，text为n的text属性

        try{
            String text = n.getText();
            if ((text.contains("<div")||text.contains("<br>"))&&GetValueWay==1){
                text=text.replace("<br>","\r\n");
                Document doc = Jsoup.parse(text);
                String digest = doc.text();//提取文本格式内容
                n.setText(digest);
            }
            else if(GetValueWay==2)
                {
                    BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8));
                    String line;
                    StringBuilder strbuf=new StringBuilder();
                    while ( (line = br.readLine()) != null ) {
                        if(!line.trim().equals("")){
                            line="<br>"+line;//每行可以做加工
                            strbuf.append(line);
                        }
                    }
                    n.setText(strbuf.toString());
                }
            return true;
        }catch (IOException e){
            return false;
        }
    }
}
