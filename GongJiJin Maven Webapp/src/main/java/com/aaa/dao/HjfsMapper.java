package com.aaa.dao;

import com.aaa.entity.Hjfs;

public interface HjfsMapper {
    int deleteByPrimaryKey(Integer jjbh);

    int insert(Hjfs record);

    int insertSelective(Hjfs record);

    Hjfs selectByPrimaryKey(Integer jjbh);

    int updateByPrimaryKeySelective(Hjfs record);

    int updateByPrimaryKey(Hjfs record);
}