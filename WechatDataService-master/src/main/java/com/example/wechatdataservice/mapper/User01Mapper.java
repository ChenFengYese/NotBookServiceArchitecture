package com.example.wechatdataservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wechatdataservice.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface User01Mapper extends BaseMapper<User> {
    @Select("select id, password from db1.user01 where id = #{id} and password = #{password}")
    User YNlo(User user);

    @Insert("insert into db1.user01 (id, password) VALUES (#{id} ,#{password})")
    Integer YNre(User user);
}