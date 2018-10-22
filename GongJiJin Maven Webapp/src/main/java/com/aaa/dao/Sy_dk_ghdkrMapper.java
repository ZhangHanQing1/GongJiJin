package com.aaa.dao;

import com.aaa.entity.SyDkGhdkr;

public interface Sy_dk_ghdkrMapper {
    int deleteByPrimaryKey(Integer ghdkrzj);

    int insert(SyDkGhdkr record);

    int insertSelective(SyDkGhdkr record);

    SyDkGhdkr selectByPrimaryKey(Integer ghdkrzj);

    int updateByPrimaryKeySelective(SyDkGhdkr record);

    int updateByPrimaryKey(SyDkGhdkr record);
}