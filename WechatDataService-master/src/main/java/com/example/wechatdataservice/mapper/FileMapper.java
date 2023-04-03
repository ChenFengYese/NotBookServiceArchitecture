package com.example.wechatdataservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wechatdataservice.domain.Notbook;
import com.example.wechatdataservice.domain.ReturnValue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.wechatdataservice.domain.File;

import java.util.List;

@Mapper
public interface FileMapper extends BaseMapper<ReturnValue> {

    @Insert("insert into db1.file " +
            "(fid, name, suffix, path, sfid, originalname) " +
            "values (#{fid}, #{fileName}, #{fileSuffix}, '/webpage/wechatfile/', #{sfid}, #{originalname})")
    void writeFileInfo(String fileName, String fid, String sfid, String fileSuffix, String originalname);

    @Select("select * from db1.file where fid = #{fid} and sfid = #{sfid}")
    List<File> downloadFile(File file);

    @Delete("delete from db1.file where fid = #{fid} and sfid = #{sfid}")
    void deleteFile(File file);
}