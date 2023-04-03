package com.example.wechatdataservice.service;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;

public interface SecureService {
    JSON login(HttpServletRequest request);
}
