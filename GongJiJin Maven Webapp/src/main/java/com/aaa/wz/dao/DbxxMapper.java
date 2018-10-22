package com.aaa.wz.dao;

import com.aaa.entity.Dbxx;

public interface DbxxMapper {
    int deleteByPrimaryKey(Integer dbxxzj);

    int insert(Dbxx record);

    int insertSelective(Dbxx record);

    Dbxx selectByPrimaryKey(Integer dbxxzj);

    int updateByPrimaryKeySelective(Dbxx record);

    int updateByPrimaryKey(Dbxx record);
}