package com.aaa.wz.dao;

import com.aaa.entity.Grzhxx;

public interface GrzhxxMapper {
    int deleteByPrimaryKey(Integer grbh);

    int insert(Grzhxx record);

    int insertSelective(Grzhxx record);

    Grzhxx selectByPrimaryKey(Integer grbh);

    int updateByPrimaryKeySelective(Grzhxx record);

    int updateByPrimaryKey(Grzhxx record);
}