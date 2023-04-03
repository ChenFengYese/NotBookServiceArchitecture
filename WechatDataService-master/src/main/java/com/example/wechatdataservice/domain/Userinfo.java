package com.example.wechatdataservice.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "userinfo")
public class Userinfo {
    @TableField(value = "uid")
    private String uid;

    @TableField(value = "ugender")
    private String ugender;

    @TableField(value = "uemail")
    private String uemail;

    @TableField(value = "uage")
    private String uage;

    @TableField(value = "uphone")
    private String uphone;

    @TableField(value = "uname")
    private String uname;
}