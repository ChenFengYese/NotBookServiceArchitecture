package com.example.wechatdataservice.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user01")
public class User {
    @TableField(value = "id")
    private String id;

    @TableField(value = "password")
    private String password;

    @TableField(value = "salt")
    private String salt;
}