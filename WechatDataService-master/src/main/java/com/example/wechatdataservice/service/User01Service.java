package com.example.wechatdataservice.service;

import com.alibaba.fastjson.JSON;
import com.example.wechatdataservice.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

public interface User01Service extends IService<User>{


    JSON login(User user);

    JSON register(User user, HttpServletRequest httpServletRequest);
}
