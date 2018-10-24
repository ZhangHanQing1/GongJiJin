package com.aaa.dao;

import com.aaa.entity.Sy_styh;

public interface Sy_styhMapper {
    int deleteByPrimaryKey(Integer styhzj);

    int insert(Sy_styh record);

    int insertSelective(Sy_styh record);

    Sy_styh selectByPrimaryKey(Integer styhzj);

    int updateByPrimaryKeySelective(Sy_styh record);

    int updateByPrimaryKey(Sy_styh record);
}