package com.aaa.dao;

import com.aaa.entity.Sy_sydkyh;

public interface Sy_sydkyhMapper {
    int deleteByPrimaryKey(Integer syyhzj);

    int insert(Sy_sydkyh record);

    int insertSelective(Sy_sydkyh record);

    Sy_sydkyh selectByPrimaryKey(Integer syyhzj);

    int updateByPrimaryKeySelective(Sy_sydkyh record);

    int updateByPrimaryKey(Sy_sydkyh record);
}