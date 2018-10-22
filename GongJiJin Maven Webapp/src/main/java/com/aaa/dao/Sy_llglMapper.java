package com.aaa.dao;

import com.aaa.entity.SyLlgl;

public interface Sy_llglMapper {
    int deleteByPrimaryKey(Integer llzj);

    int insert(SyLlgl record);

    int insertSelective(SyLlgl record);

    SyLlgl selectByPrimaryKey(Integer llzj);

    int updateByPrimaryKeySelective(SyLlgl record);

    int updateByPrimaryKey(SyLlgl record);
}