package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.TongYong;
import com.aaa.entity.Zhxxbgjlb;

public interface ZhxxbgjlbMapper {
    int deleteByPrimaryKey(Integer bgjlbh);

    int insert(Zhxxbgjlb record);

    int insertSelective(Zhxxbgjlb record);

    Zhxxbgjlb selectByPrimaryKey(Integer bgjlbh);

    int updateByPrimaryKeySelective(Zhxxbgjlb record);

    int updateByPrimaryKey(Zhxxbgjlb record);
//   添加比例信息
    void BiLiAdd(TongYong tongYong);
//    查询比例记录
    List<Map> select();
}