package com.example.wechatdataservice.controller;

import com.alibaba.fastjson.JSON;
import com.example.wechatdataservice.domain.Notbook;
import com.example.wechatdataservice.domain.ReturnValue;
import com.example.wechatdataservice.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.wechatdataservice.domain.File;

@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileService fileService;

    @RequestMapping(value = "upload")
    public ReturnValue uploadFileTest(@RequestParam("file")MultipartFile files, HttpServletRequest request) {
        return fileService.uploadFileTest(files, request.getHeader("fid"), request.getHeader("sfid"), request.getHeader("originalname"));
    }


    @GetMapping("/download")
    public JSON downloadFile(Notbook notbook) {
        return fileService.downloadFile(notbook);
    }

    @RequestMapping("/delete")
    public JSON deleteFile(Notbook notbook) {
        return fileService.deleteFile(notbook);
    }
}