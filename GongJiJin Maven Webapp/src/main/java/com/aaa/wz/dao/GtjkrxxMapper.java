package com.aaa.wz.dao;

import com.aaa.entity.Gtjkrxx;

public interface GtjkrxxMapper {
    int deleteByPrimaryKey(Integer gtjkrzj);

    int insert(Gtjkrxx record);

    int insertSelective(Gtjkrxx record);

    Gtjkrxx selectByPrimaryKey(Integer gtjkrzj);

    int updateByPrimaryKeySelective(Gtjkrxx record);

    int updateByPrimaryKey(Gtjkrxx record);
}