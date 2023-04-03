package com.example.wechatdataservice.service;

import com.alibaba.fastjson.JSON;
import com.example.wechatdataservice.domain.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserinfoService extends IService<Userinfo>{


    JSON getuif(String id);
}
