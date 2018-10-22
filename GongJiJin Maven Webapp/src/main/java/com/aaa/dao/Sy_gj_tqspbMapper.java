package com.aaa.dao;

import com.aaa.entity.SyGjTqspb;

public interface Sy_gj_tqspbMapper {
    int deleteByPrimaryKey(Integer tqbh);

    int insert(SyGjTqspb record);

    int insertSelective(SyGjTqspb record);

    SyGjTqspb selectByPrimaryKey(Integer tqbh);

    int updateByPrimaryKeySelective(SyGjTqspb record);

    int updateByPrimaryKey(SyGjTqspb record);
}