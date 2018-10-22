package com.aaa.wz.dao;

import com.aaa.entity.Zjlxb;

public interface ZjlxbMapper {
    int deleteByPrimaryKey(Integer zjlxbh);

    int insert(Zjlxb record);

    int insertSelective(Zjlxb record);

    Zjlxb selectByPrimaryKey(Integer zjlxbh);

    int updateByPrimaryKeySelective(Zjlxb record);

    int updateByPrimaryKey(Zjlxb record);
}