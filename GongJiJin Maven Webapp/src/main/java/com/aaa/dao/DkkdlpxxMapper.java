package com.aaa.dao;

import com.aaa.entity.Dkkdlpxx;

public interface DkkdlpxxMapper {
    int deleteByPrimaryKey(Integer lpzj);

    int insert(Dkkdlpxx record);

    int insertSelective(Dkkdlpxx record);

    Dkkdlpxx selectByPrimaryKey(Integer lpzj);

    int updateByPrimaryKeySelective(Dkkdlpxx record);

    int updateByPrimaryKey(Dkkdlpxx record);
}