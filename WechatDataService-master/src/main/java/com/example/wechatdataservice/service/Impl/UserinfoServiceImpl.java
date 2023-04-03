package com.example.wechatdataservice.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wechatdataservice.domain.Userinfo;
import com.example.wechatdataservice.mapper.UserinfoMapper;
import com.example.wechatdataservice.service.UserinfoService;
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService{


    @Resource
    UserinfoMapper userinfoMapper;

    @Override
    public JSON getuif(String id) {
        JSONObject json = new JSONObject(true);
        Userinfo temp = userinfoMapper.getuif(id);
        try {
            if (temp == null){
                Integer a = null;
                int b = a;
            }
            json.put("uif", temp);
        } catch (Exception e) {
            json.put("msg", "E50001");
        }
        return json;
    }
}
