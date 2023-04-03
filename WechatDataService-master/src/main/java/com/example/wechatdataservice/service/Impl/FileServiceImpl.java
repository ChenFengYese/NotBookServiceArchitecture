package com.example.wechatdataservice.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wechatdataservice.domain.Notbook;
import com.example.wechatdataservice.domain.ReturnCodeAndMsgEnum;
import com.example.wechatdataservice.domain.ReturnValue;
import com.example.wechatdataservice.mapper.FileMapper;
import com.example.wechatdataservice.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, ReturnValue> implements FileService{

    @Resource
    FileMapper fileMapper; // 文件信息数据库操作

    private String getFileSuffix(MultipartFile file) { // 获取文件后缀
        if (file == null) {
            return null;
        }
        String fileName = file.getOriginalFilename();
        int suffixIndex = fileName.lastIndexOf(".");
        if (suffixIndex == -1) {    // 无后缀
            return null;
        } else {                    // 存在后缀
            return fileName.substring(suffixIndex, fileName.length());
        }
    }

    @Override
    public ReturnValue uploadFileTest(MultipartFile zipFile, String fid, String sfid, String originalname) { // 上传文件
        if (zipFile == null) {
            return new ReturnValue<>(-1, null);
        } // 上传文件为空
        if (fid == null || sfid == null) {
            return new ReturnValue<>(-1, null);
        } // 上传文件的fid或sfid为空

//        String targetFilePath = "D:\\test\\uploadTest"; //windows地址

        String targetFilePath = "/webpage/wechatfile/";   //linux地址
        String fileName = UUID.randomUUID().toString().replace("-", "");
//        File targetFile = new File(targetFilePath + File.separator + fileName);


        String fileSuffix = getFileSuffix(zipFile); // 获取文件后缀
        if (fileSuffix != null) {   // 拼接后缀
            fileName += fileSuffix;
        }
        File targetFile = new File(targetFilePath + File.separator + fileName); // 拼接文件名
        assert fileSuffix != null; // 断言文件后缀不为空
        try {
            originalname = URLDecoder.decode(originalname, "utf-8");
            log.info(originalname);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        fileMapper.writeFileInfo(fileName, fid, sfid, fileSuffix.split("\\.")[1], originalname);//写入文件信息到数据库

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(targetFile);
            IOUtils.copy(zipFile.getInputStream(), fileOutputStream);
            log.info("------>>>>>>uploaded a file successfully!<<<<<<------");
        } catch (IOException e) {
            return new ReturnValue<>(-1, null);
        } finally {
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                log.error("", e);
            }
        }
        return new ReturnValue<>(ReturnCodeAndMsgEnum.Success, null);
    }


    @Override
    public JSON downloadFile(Notbook notbook) {
//        String targetFilePath = "D:\\test\\uploadTest\\"; //windows地址
        String targetFilePath = "https://www.lbservice.top/"; //服务器地址


        JSONObject json = new JSONObject();
        com.example.wechatdataservice.domain.File file = new com.example.wechatdataservice.domain.File();
        file.setFid(notbook.getUid()); //这里的uid是文件的fid
        file.setSfid(String.valueOf(notbook.getSuid())); //这里的suid是文件的sfid
        List<com.example.wechatdataservice.domain.File> file_get = fileMapper.downloadFile(file);
        if(file_get == null){
            json.put("msg","fail");
            json.put("details" , "这里没有文件");
            return json;
        }
        //不可改
        for(int i=0;i<file_get.size();i++){
            log.info(String.valueOf(file_get.get(i)));
            file_get.get(i).setName(targetFilePath + file_get.get(i).getName());
            json.put(String.valueOf(i),file_get.get(i));
        }
        return json;
    }

    @Override
    public JSON deleteFile(Notbook notbook) { // 删除文件
        JSONObject json = new JSONObject();
//        String targetFilePath = "D:\\test\\uploadTest\\"; //windows地址
        //String targetFilePath = "https://www.lbservice.top/"; //服务器地址
        String targetFilePath = "/webpage/wechatfile/"; // linux地址
        com.example.wechatdataservice.domain.File file = new com.example.wechatdataservice.domain.File();
        file.setSfid(String.valueOf(notbook.getSuid())); //这里的suid是文件的sfid
        file.setFid(notbook.getUid()); //这里的uid是文件的fid
        List<com.example.wechatdataservice.domain.File> file_get = fileMapper.downloadFile(file); //获取文件信息
        log.info(file_get.toString());
        if(file_get.size()!=0){
            fileMapper.deleteFile(file);
            for (com.example.wechatdataservice.domain.File value : file_get) { //删除文件
               if(!deleteFile(targetFilePath + value.getName())){
                   log.info("删除失败");
                   json.put("msg","failed");
                   return json;
               }
            }
        }
        json.put("msg","success");
        return json;
    }
    public boolean deleteFile(String sPath) { // 删除文件
        boolean flag;
        flag = false;
        File file = new File(sPath);
        if (file.isFile() && file.exists()) { // 路径为文件且不为空则进行删除
            file.delete();
            flag = true;
        }
        return flag;
    }
}
