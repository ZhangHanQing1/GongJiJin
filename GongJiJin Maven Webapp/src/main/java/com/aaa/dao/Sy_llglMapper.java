package com.aaa.dao;

import com.aaa.entity.Sy_llgl;

public interface Sy_llglMapper {
    int deleteByPrimaryKey(Integer llzj);

    int insert(Sy_llgl record);

    int insertSelective(Sy_llgl record);

    Sy_llgl selectByPrimaryKey(Integer llzj);

    int updateByPrimaryKeySelective(Sy_llgl record);

    int updateByPrimaryKey(Sy_llgl record);
}