package com.aaa.dao;

import com.aaa.entity.Grzfdkjkhtxx;

public interface GrzfdkjkhtxxMapper {
    int deleteByPrimaryKey(Integer htzj);

    int insert(Grzfdkjkhtxx record);

    int insertSelective(Grzfdkjkhtxx record);

    Grzfdkjkhtxx selectByPrimaryKey(Integer htzj);

    int updateByPrimaryKeySelective(Grzfdkjkhtxx record);

    int updateByPrimaryKey(Grzfdkjkhtxx record);
}