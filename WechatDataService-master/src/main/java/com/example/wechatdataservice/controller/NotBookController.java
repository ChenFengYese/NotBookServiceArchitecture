package com.example.wechatdataservice.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatdataservice.domain.Notbook;
import com.example.wechatdataservice.service.NotbookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "textif")
@Component
public class NotBookController {

    @Resource
    NotbookService notbookService;

    @RequestMapping(value = "getif")
    public JSON gif(Notbook notbook, HttpServletRequest request){
        return notbookService.gif(notbook,request);
    }

    @RequestMapping(value = "sortBySuid")
    public JSON sortBySuid(Notbook notbook,HttpServletRequest request){
        return notbookService.sortBySuid(notbook,request);
    }

    @RequestMapping(value = "sortByCollect")
    public List<Notbook> sortByCollect(Notbook notbook){
        return notbookService.sortByCollect(notbook);
    }

    @RequestMapping(value = "getif_s")
    public JSON gif_s(Notbook notbook, Integer GetValueWay, Integer publicOrPrivate){
        return notbookService.gif_s(notbook,GetValueWay,publicOrPrivate);
    }

    @RequestMapping(value = "addif")
    public JSON addif(Notbook notbook){
        return notbookService.addif(notbook);
    }

    @RequestMapping(value = "getsuidlist")
    public List<Integer> SUID_AUTO_INCREMENT(Notbook notbook){
        return notbookService.GetSuidList(notbook);
    }
    @RequestMapping(value = "getSuidListNotDeleted")
    public List<Integer> SuidList_NotDeleted(Notbook notbook){
        return notbookService.getSuidListNotDeleted(notbook);
    }
    @RequestMapping(value = "getSuidAndNameList")
    public JSON SUID_WITH_NAME(Notbook notbook){
        return notbookService.GetTitleBySuid(notbook);
    }

    @RequestMapping(value = "gettitlelist")
    public String GET_TITLE_LIST(Notbook notbook){
        return notbookService.GetTitleList(notbook);
    }

    @RequestMapping(value = "deleteif")
    public JSON deleteif(Notbook notbook){
        return notbookService.deleteif(notbook);
    }

    @RequestMapping(value = "alterif")
    public JSON aif(Notbook notbook){
        return notbookService.aif(notbook);
    }

    @RequestMapping(value = "collectBySuid")
    public JSON collectBySuid(Notbook notbook){
       return notbookService.collectBySuid(notbook);
    }

    @RequestMapping(value = "searchByArgs")
    public JSON searchByArgs(String uid,String args){
            return notbookService.searchByArgs(uid,args);

    }


//    @RequestMapping(value = "getif")
//    public void Test(String s, HttpServletRequest request){
//        NotBookQueue temp = new NotBookQueue();
//        temp.setQuid(s);
//        temp.setHttpServletRequest(request);
//        rabbitTemplate.convertAndSend("boot_topic_exchange","message", temp);
//    }



//    @RabbitListener(queues = "boot_queue")
//    public void listenMessage(NotBookQueue notbookQuene)
//    {
//        System.out.println("接收消息："+ notbookQuene);
//        Notbook ntb2 = new Notbook();
//        ntb2.setUid(notbookQuene.getQuid());
//        gif(ntb2, notbookQuene.getHttpServletRequest());
//    }


}
