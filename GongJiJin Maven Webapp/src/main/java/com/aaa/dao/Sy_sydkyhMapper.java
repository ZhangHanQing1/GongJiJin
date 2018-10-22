package com.aaa.dao;

import com.aaa.entity.SySydkyh;

public interface Sy_sydkyhMapper {
    int deleteByPrimaryKey(Integer syyhzj);

    int insert(SySydkyh record);

    int insertSelective(SySydkyh record);

    SySydkyh selectByPrimaryKey(Integer syyhzj);

    int updateByPrimaryKeySelective(SySydkyh record);

    int updateByPrimaryKey(SySydkyh record);
}