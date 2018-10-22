package com.aaa.dao;

import com.aaa.entity.SyGjYdhkrxx;

public interface Sy_gj_ydhkrxxMapper {
    int deleteByPrimaryKey(Integer hkrzj);

    int insert(SyGjYdhkrxx record);

    int insertSelective(SyGjYdhkrxx record);

    SyGjYdhkrxx selectByPrimaryKey(Integer hkrzj);

    int updateByPrimaryKeySelective(SyGjYdhkrxx record);

    int updateByPrimaryKey(SyGjYdhkrxx record);
}