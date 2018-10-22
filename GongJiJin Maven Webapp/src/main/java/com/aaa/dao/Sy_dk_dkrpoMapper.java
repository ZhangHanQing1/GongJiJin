package com.aaa.dao;

import com.aaa.entity.SyDkDkrpo;

public interface Sy_dk_dkrpoMapper {
    int deleteByPrimaryKey(Integer pobh);

    int insert(SyDkDkrpo record);

    int insertSelective(SyDkDkrpo record);

    SyDkDkrpo selectByPrimaryKey(Integer pobh);

    int updateByPrimaryKeySelective(SyDkDkrpo record);

    int updateByPrimaryKey(SyDkDkrpo record);
}