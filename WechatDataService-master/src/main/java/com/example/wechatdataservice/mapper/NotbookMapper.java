package com.example.wechatdataservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wechatdataservice.domain.Notbook;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NotbookMapper extends BaseMapper<Notbook> {

    //修改信息
//    @Update("UPDATE db1.notbook " +
//
//            "SET title = #{title},text = #{text},time = #{time}, collect = #{collect}, texthtml = #{texthtml} " +
//            "where uid = #{uid} and suid = #{suid} and deleted = 0")
//    void aif(Notbook notbook);
    @Update({
            "<script> ",
            "update db1.notbook",
            "<set>",
            "<if test = \"title != null and  title != ''\">",
            "title=#{title}, ",
            "</if> ",
            "<if test = \"text != null and  text != ''\">",
            "text=#{text}, ",
            "</if> ",
            "<if test = \"time != null and  time != ''\">",
            "time=#{time}, ",
            "</if> ",
            "<if test = \"collect != null and  collect != ''\">",
            "collect=#{collect}, ",
            "</if> ",
            "<if test = \"texthtml != null and  texthtml != ''\">",
            "texthtml=#{texthtml}, ",
            "</if> ",
            "<if test = \"subtext != null and  subtext != ''\">",
            "subtext=#{subtext}, ",
            "</if> ",
            "</set>",
            "where uid = #{uid} and suid = #{suid} and deleted = 0",
            "</script>"
    })
    void aif(Notbook notbook);

    @Update("update db1.notbook set subtext=#{subtext} where uid = #{uid} and suid = #{suid} and deleted = 0")
    void aif_subtext(Notbook notbook);

    //获取备忘录列表
    @Select("select suid,uid,title,time,collect,subtext from db1.notbook where uid = #{uid} and deleted = 0")
    List<Notbook> gif(Notbook notbook);

    //获取备忘录详细内容
    @Select("select suid,uid,title,time,text,texthtml,collect from db1.notbook where uid = #{uid} and suid = #{suid} and deleted = 0")
    Notbook gif_s(Notbook notbook);
    @Select("select suid,title from db1.notbook where uid = #{uid} and suid = #{suid} and deleted = 0")
    Notbook gif_s_title(Notbook notbook);
    @Select("select suid,uid,title,time,text,texthtml from db1.notbook where uid = #{uid} and suid = #{suid} and texthtml = 1 and deleted = 0")
    Notbook gif_s_public(Notbook notbook);

    //新增备忘录
    @Insert("insert into\n" +
            "    db1.notbook (uid, suid, text, title, time, collect, deleted, subtext)\n" +
            "values (#{uid},#{suid},#{text},#{title},#{time},#{collect},0,#{subtext})")
    void addif(Notbook notbook);

    //删除备忘录，修改deleted属性为1，不能真的删数据库数据
    @Update("update db1.notbook set deleted = 1 where uid = #{uid} and suid = #{suid}")
    void deleteif(Notbook notbook);

    //获取备忘录id列表
    @Select("select suid from db1.notbook where uid = #{uid} order by suid asc")
    List<Integer> GetSuidList(Notbook notbook);

    //获取某用户备忘录题目列表
    @Select("select title from db1.notbook where uid = #{uid} and suid = #{suid} and deleted = 0")
    String GetTitleList(Notbook notbook);

    //根据收藏排序
    @Select("select suid,uid,title,time,collect,subtext from db1.notbook where uid = #{uid} and deleted = 0 and collect = 1 order by time desc;")
    List<Notbook> sortByCollect(Notbook notbook);

    //根据时间排序
    @Select("select suid,uid,title,time,collect,subtext from db1.notbook " +
            "where uid = #{uid} and deleted = 0 and collect = 0 or collect IS NULL order by time desc;")
    List<Notbook> sortByTime(Notbook notbook);

    //没用
    @Select("select uid from error_code")
    Notbook TOKEN_INVALID(Notbook notbook);

    //根据备忘录id排序
    @Select("select suid,uid,title,time,collect,subtext from db1.notbook " +
            "where uid = #{uid} and deleted = 0 and collect = 0 or collect IS NULL order by suid;")
    List<Notbook>  sortBySuid(Notbook notbook);

    //根据备忘录id收藏
    @Update("UPDATE db1.notbook " +
            "SET collect = #{collect} " +
            "where uid = #{uid} and suid = #{suid} and deleted = 0")
    void collectBySuid(Notbook notbook);

    //模糊查询
    @Select("select suid,uid,title,time,collect,subtext from db1.notbook " +
            "where uid = #{uid} and deleted = 0 and (title like #{args}"
            +" or time like #{args} or text like #{args}) order by time desc;")
    List<Notbook> searchByArgs(String uid, String args);

    @Select("select suid from db1.notbook where uid = #{uid} and deleted = 0 order by suid asc")
    List<Integer> getSuidListNotDeleted(Notbook notbook);
}
