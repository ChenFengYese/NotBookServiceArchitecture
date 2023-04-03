package com.example.wechatdataservice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatdataservice.service.SecureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 需要登录后携带JWT才能访问
 */
@Slf4j
@RestController
public class SecureController {

    @Resource
    SecureService secureService;

    /**
     * 查询 用户信息，登录后携带JWT才能访问
     */
    @RequestMapping("/secure/getUserInfo")
    public JSON login(HttpServletRequest request) {
        return secureService.login(request);
    }
}