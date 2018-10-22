package com.aaa.wz.dao;

import com.aaa.entity.Dwywmxb;

public interface DwywmxbMapper {
    int deleteByPrimaryKey(Integer dwywlsh);

    int insert(Dwywmxb record);

    int insertSelective(Dwywmxb record);

    Dwywmxb selectByPrimaryKey(Integer dwywlsh);

    int updateByPrimaryKeySelective(Dwywmxb record);

    int updateByPrimaryKey(Dwywmxb record);
}