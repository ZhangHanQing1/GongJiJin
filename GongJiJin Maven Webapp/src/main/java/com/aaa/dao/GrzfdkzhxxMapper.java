package com.aaa.dao;

import com.aaa.entity.Grzfdkzhxx;

public interface GrzfdkzhxxMapper {
    int deleteByPrimaryKey(Integer dkzj);

    int insert(Grzfdkzhxx record);

    int insertSelective(Grzfdkzhxx record);

    Grzfdkzhxx selectByPrimaryKey(Integer dkzj);

    int updateByPrimaryKeySelective(Grzfdkzhxx record);

    int updateByPrimaryKey(Grzfdkzhxx record);
}