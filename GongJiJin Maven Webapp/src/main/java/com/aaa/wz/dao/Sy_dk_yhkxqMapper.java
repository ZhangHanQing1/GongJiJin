package com.aaa.wz.dao;

import com.aaa.entity.Sy_dk_yhkxq;

public interface Sy_dk_yhkxqMapper {
    int deleteByPrimaryKey(Long wdbh);

    int insert(Sy_dk_yhkxq record);

    int insertSelective(Sy_dk_yhkxq record);

    Sy_dk_yhkxq selectByPrimaryKey(Long wdbh);

    int updateByPrimaryKeySelective(Sy_dk_yhkxq record);

    int updateByPrimaryKey(Sy_dk_yhkxq record);
}