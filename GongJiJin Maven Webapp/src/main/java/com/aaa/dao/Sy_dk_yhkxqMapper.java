package com.aaa.dao;

import com.aaa.entity.SyDkYhkxq;

public interface Sy_dk_yhkxqMapper {
    int deleteByPrimaryKey(Long wdbh);

    int insert(SyDkYhkxq record);

    int insertSelective(SyDkYhkxq record);

    SyDkYhkxq selectByPrimaryKey(Long wdbh);

    int updateByPrimaryKeySelective(SyDkYhkxq record);

    int updateByPrimaryKey(SyDkYhkxq record);
}