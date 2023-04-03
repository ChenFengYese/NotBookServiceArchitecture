package com.example.wechatdataservice.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.List;

@Data
@TableName(value = "notbook")
@Document(indexName = "essay")
public class Notbook implements Serializable {
    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField(value = "suid")
    private Integer suid;

    @TableField(value = "title")
    private String title;

    @TableField(value = "time")
    private String time;

    @TableField(value = "text")
    private String text;

    @TableField(value = "texthtml")
    private String texthtml;
    @TableField(value = "subtext")
    private String subtext;

    @TableField(value = "collect")
    private String collect;

    @TableField(value = "deleted")
    private String deleted;
}