package com.example.wechatdataservice.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Data
@Slf4j
public class NotBookQueue {

    @TableField(value = "quid")
    private String quid;

    @TableField(value = "HttpServletRequest")
    private javax.servlet.http.HttpServletRequest HttpServletRequest;
}
