package com.aaa.dao;

import com.aaa.entity.Grzfdkyqdjxx;

public interface GrzfdkyqdjxxMapper {
    int deleteByPrimaryKey(Integer djxxzj);

    int insert(Grzfdkyqdjxx record);

    int insertSelective(Grzfdkyqdjxx record);

    Grzfdkyqdjxx selectByPrimaryKey(Integer djxxzj);

    int updateByPrimaryKeySelective(Grzfdkyqdjxx record);

    int updateByPrimaryKey(Grzfdkyqdjxx record);
}