package com.example.wechatdataservice.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatdataservice.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wechatdataservice.domain.User;
import com.example.wechatdataservice.mapper.User01Mapper;
import com.example.wechatdataservice.service.User01Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Slf4j
@Service
public class User01ServiceImpl extends ServiceImpl<User01Mapper, User> implements User01Service{


    @Resource
    User01Mapper user01Mapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public JSON login(User user) {
        JSONObject json = new JSONObject();
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        User YNlo = user01Mapper.YNlo(user);
        if (YNlo != null){
            json.put("token", JwtUtil.createToken(user));
            stringRedisTemplate.opsForValue().set(user.getId(),json.get("token").toString());//将id和对应的token放入redis
            return json;
        }
        json.put("msg","E10001");
        return json;
    }

    @Override
    public JSON register(User user, HttpServletRequest httpServletRequest) {
        JSONObject json = new JSONObject();
        Integer YNre = null;
        if (Objects.equals(httpServletRequest.getHeader("verifyCode"), "wwssadadbaba")) {
            user.setPassword(DigestUtils.md5Hex(user.getPassword()));
            YNre = user01Mapper.YNre(user);
        } else {
            json.put("msg","verifyCodeIllegal");
            return json;
        }
        if (YNre != null) {
            json.put("msg","success");
            return json;
        }
        json.put("msg","E20001");
        return json;
    }
}
