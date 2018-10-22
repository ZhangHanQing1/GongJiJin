package com.aaa.dao;

import com.aaa.entity.Jjlx;

public interface jjlxMapper {
    int deleteByPrimaryKey(Integer jjlxbh);

    int insert(Jjlx record);

    int insertSelective(Jjlx record);

    Jjlx selectByPrimaryKey(Integer jjlxbh);

    int updateByPrimaryKeySelective(Jjlx record);

    int updateByPrimaryKey(Jjlx record);
}