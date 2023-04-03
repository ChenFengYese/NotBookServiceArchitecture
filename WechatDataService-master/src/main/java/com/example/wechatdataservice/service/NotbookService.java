package com.example.wechatdataservice.service;

import com.alibaba.fastjson.JSON;
import com.example.wechatdataservice.domain.Notbook;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface NotbookService extends IService<Notbook>{


    JSON aif(Notbook notbook);

    JSON gif(Notbook notbook, HttpServletRequest request);

    JSON gif_s(Notbook notbook,Integer GetValueWay,Integer publicOrPrivate);

    JSON addif(Notbook notbook);

    JSON deleteif(Notbook notbook);

    List<Integer> GetSuidList(Notbook notbook);

    String GetTitleList(Notbook notbook);

    List<Notbook> sortByCollect(Notbook notbook);
//
//    List<Notbook> sortByTime(Notbook notbook);
//
//    Notbook TOKEN_INVALID(Notbook notbook);

    JSON sortBySuid(Notbook notbook,HttpServletRequest request);

    JSON collectBySuid(Notbook notbook);

    JSON searchByArgs(String uid, String args);

    JSON GetTitleBySuid(Notbook notbook);

    List<Integer> getSuidListNotDeleted(Notbook notbook);
}
