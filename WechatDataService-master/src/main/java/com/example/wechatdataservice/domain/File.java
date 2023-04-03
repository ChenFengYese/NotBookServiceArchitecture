package com.example.wechatdataservice.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 文件表
    */
@Data
@TableName(value = "`file`")
public class File {
    /**
     * 文件ID
     */
    @TableField(value = "fid")
    private String fid;

    /**
     * 文件名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 文件类型
     */
    @TableField(value = "suffix")
    private String suffix;

    /**
     * 文件相对路径
     */
    @TableField(value = "path")
    private String path;

    @TableField(value = "sfid")
    private String sfid;

    @TableField(value = "originalname")
    private String originalname;

    public static final String COL_FID = "fid";

    public static final String COL_NAME = "name";

    public static final String COL_SUFFIX = "suffix";

    public static final String COL_PATH = "path";

    public static final String COL_SFID = "sfid";
    public static final String COL_ORIGINALNAME = "originalname";

}