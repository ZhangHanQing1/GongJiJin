package com.aaa.dao;

import com.aaa.entity.jjlx;

public interface jjlxMapper {
    int deleteByPrimaryKey(Integer jjlxbh);

    int insert(jjlx record);

    int insertSelective(jjlx record);

    jjlx selectByPrimaryKey(Integer jjlxbh);

    int updateByPrimaryKeySelective(jjlx record);

    int updateByPrimaryKey(jjlx record);
}