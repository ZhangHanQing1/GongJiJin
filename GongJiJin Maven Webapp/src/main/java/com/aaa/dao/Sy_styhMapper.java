package com.aaa.dao;

import com.aaa.entity.SyStyh;

public interface Sy_styhMapper {
    int deleteByPrimaryKey(Integer styhzj);

    int insert(SyStyh record);

    int insertSelective(SyStyh record);

    SyStyh selectByPrimaryKey(Integer styhzj);

    int updateByPrimaryKeySelective(SyStyh record);

    int updateByPrimaryKey(SyStyh record);
}