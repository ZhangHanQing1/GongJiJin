package com.aaa.dao;

import com.aaa.entity.Dwlxb;

public interface DwlxbMapper {
    int deleteByPrimaryKey(Integer dwlxbh);

    int insert(Dwlxb record);

    int insertSelective(Dwlxb record);

    Dwlxb selectByPrimaryKey(Integer dwlxbh);

    int updateByPrimaryKeySelective(Dwlxb record);

    int updateByPrimaryKey(Dwlxb record);
}