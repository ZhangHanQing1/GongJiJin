package com.aaa.dao;

import com.aaa.entity.SyJcyh;

public interface Sy_jcyhMapper {
    int deleteByPrimaryKey(Integer jcyhzj);

    int insert(SyJcyh record);

    int insertSelective(SyJcyh record);

    SyJcyh selectByPrimaryKey(Integer jcyhzj);

    int updateByPrimaryKeySelective(SyJcyh record);

    int updateByPrimaryKey(SyJcyh record);
}