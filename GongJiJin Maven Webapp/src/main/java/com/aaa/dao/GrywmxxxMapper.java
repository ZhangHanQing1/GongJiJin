package com.aaa.dao;

import com.aaa.entity.Grywmxxx;

public interface GrywmxxxMapper {
    int deleteByPrimaryKey(Integer grywmxbh);

    int insert(Grywmxxx record);

    int insertSelective(Grywmxxx record);

    Grywmxxx selectByPrimaryKey(Integer grywmxbh);

    int updateByPrimaryKeySelective(Grywmxxx record);

    int updateByPrimaryKey(Grywmxxx record);
}