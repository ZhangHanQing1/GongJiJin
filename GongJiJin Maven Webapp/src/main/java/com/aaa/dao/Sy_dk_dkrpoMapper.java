package com.aaa.dao;

import com.aaa.entity.Sy_dk_dkrpo;

public interface Sy_dk_dkrpoMapper {
    int deleteByPrimaryKey(Integer pobh);

    int insert(Sy_dk_dkrpo record);

    int insertSelective(Sy_dk_dkrpo record);

    Sy_dk_dkrpo selectByPrimaryKey(Integer pobh);

    int updateByPrimaryKeySelective(Sy_dk_dkrpo record);

    int updateByPrimaryKey(Sy_dk_dkrpo record);
}