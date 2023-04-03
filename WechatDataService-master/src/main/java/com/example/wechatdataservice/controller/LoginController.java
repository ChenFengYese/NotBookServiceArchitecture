package com.example.wechatdataservice.controller;

import com.alibaba.fastjson.JSON;
import com.example.wechatdataservice.domain.User;
import com.example.wechatdataservice.service.User01Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
@RequestMapping(value = "wxse")
public class LoginController {

    @Resource
    User01Service user01Service;

    @RequestMapping("login")
    public JSON login(User user) {
        return user01Service.login(user);
    }

    @RequestMapping(value = "register")
    public JSON register(User user, HttpServletRequest httpServletRequest) {
        return user01Service.register(user,httpServletRequest);
    }
}