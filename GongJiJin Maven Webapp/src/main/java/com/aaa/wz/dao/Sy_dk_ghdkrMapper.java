package com.aaa.wz.dao;

import com.aaa.entity.Sy_dk_ghdkr;

public interface Sy_dk_ghdkrMapper {
    int deleteByPrimaryKey(Integer ghdkrzj);

    int insert(Sy_dk_ghdkr record);

    int insertSelective(Sy_dk_ghdkr record);

    Sy_dk_ghdkr selectByPrimaryKey(Integer ghdkrzj);

    int updateByPrimaryKeySelective(Sy_dk_ghdkr record);

    int updateByPrimaryKey(Sy_dk_ghdkr record);
}