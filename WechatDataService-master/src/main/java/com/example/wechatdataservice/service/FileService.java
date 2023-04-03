package com.example.wechatdataservice.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wechatdataservice.domain.Notbook;
import com.example.wechatdataservice.domain.ReturnValue;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.wechatdataservice.domain.File;

public interface FileService extends IService<ReturnValue>{

    ReturnValue uploadFileTest(MultipartFile zipFile, String fid, String sfid, String originalname);

    JSON downloadFile(Notbook notbook);

    JSON deleteFile(Notbook notbook);
}
