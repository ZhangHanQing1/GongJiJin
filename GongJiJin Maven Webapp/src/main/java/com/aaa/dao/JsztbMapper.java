package com.aaa.dao;

import com.aaa.entity.Jsztb;

public interface JsztbMapper {
    int deleteByPrimaryKey(Integer jsztbh);

    int insert(Jsztb record);

    int insertSelective(Jsztb record);

    Jsztb selectByPrimaryKey(Integer jsztbh);

    int updateByPrimaryKeySelective(Jsztb record);

    int updateByPrimaryKey(Jsztb record);
}