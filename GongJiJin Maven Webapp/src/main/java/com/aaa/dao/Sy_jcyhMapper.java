package com.aaa.dao;

import com.aaa.entity.Sy_jcyh;

public interface Sy_jcyhMapper {
    int deleteByPrimaryKey(Integer jcyhzj);

    int insert(Sy_jcyh record);

    int insertSelective(Sy_jcyh record);

    Sy_jcyh selectByPrimaryKey(Integer jcyhzj);

    int updateByPrimaryKeySelective(Sy_jcyh record);

    int updateByPrimaryKey(Sy_jcyh record);
}