package com.example.wechatdataservice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatdataservice.domain.Userinfo;
import com.example.wechatdataservice.service.UserinfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "userinfo")
public class UserInfoController {

    @Resource
    UserinfoService userinfoService;

    @RequestMapping(value = "getuif")
    public JSON getuif(String id){ //获取用户信息

        return userinfoService.getuif(id);

    }

}
