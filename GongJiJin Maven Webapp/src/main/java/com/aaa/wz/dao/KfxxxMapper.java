package com.aaa.wz.dao;

import com.aaa.entity.Kfxxx;

public interface KfxxxMapper {
    int deleteByPrimaryKey(Integer kfszj);

    int insert(Kfxxx record);

    int insertSelective(Kfxxx record);

    Kfxxx selectByPrimaryKey(Integer kfszj);

    int updateByPrimaryKeySelective(Kfxxx record);

    int updateByPrimaryKey(Kfxxx record);
}