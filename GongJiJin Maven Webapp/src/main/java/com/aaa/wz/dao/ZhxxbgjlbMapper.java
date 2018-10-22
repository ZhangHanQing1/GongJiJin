package com.aaa.wz.dao;

import com.aaa.entity.Zhxxbgjlb;

public interface ZhxxbgjlbMapper {
    int deleteByPrimaryKey(Integer bgjlbh);

    int insert(Zhxxbgjlb record);

    int insertSelective(Zhxxbgjlb record);

    Zhxxbgjlb selectByPrimaryKey(Integer bgjlbh);

    int updateByPrimaryKeySelective(Zhxxbgjlb record);

    int updateByPrimaryKey(Zhxxbgjlb record);
}