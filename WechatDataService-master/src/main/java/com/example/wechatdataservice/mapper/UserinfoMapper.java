package com.example.wechatdataservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wechatdataservice.domain.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserinfoMapper extends BaseMapper<Userinfo> {

    @Select("select uid,ugender,uemail,uage,uphone,uname from db1.userinfo " +
            "left join db1.user01 " +
            "on userinfo.uid = user01.id " +
            "where id = #{id}")
    Userinfo getuif(String id);
}