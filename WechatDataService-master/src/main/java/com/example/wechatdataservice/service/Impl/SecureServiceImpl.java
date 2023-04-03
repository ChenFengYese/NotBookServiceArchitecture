package com.example.wechatdataservice.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatdataservice.service.SecureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Service
public class SecureServiceImpl implements SecureService {
    @Override
    public JSON login(HttpServletRequest request){
        JSONObject json = new JSONObject();
        String id = request.getAttribute("id").toString();
        json.put("id",id);
        return json;
    }
}
