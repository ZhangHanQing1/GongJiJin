package com.aaa.dao;

import com.aaa.entity.SyDkBzxx;

public interface Sy_dk_bzxxMapper {
    int deleteByPrimaryKey(Integer bzxxzj);

    int insert(SyDkBzxx record);

    int insertSelective(SyDkBzxx record);

    SyDkBzxx selectByPrimaryKey(Integer bzxxzj);

    int updateByPrimaryKeySelective(SyDkBzxx record);

    int updateByPrimaryKey(SyDkBzxx record);
}