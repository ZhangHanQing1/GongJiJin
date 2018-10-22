package com.aaa.wz.dao;

import com.aaa.entity.Sy_dk_dyxx;

public interface Sy_dk_dyxxMapper {
    int deleteByPrimaryKey(Integer dyxxzj);

    int insert(Sy_dk_dyxx record);

    int insertSelective(Sy_dk_dyxx record);

    Sy_dk_dyxx selectByPrimaryKey(Integer dyxxzj);

    int updateByPrimaryKeySelective(Sy_dk_dyxx record);

    int updateByPrimaryKey(Sy_dk_dyxx record);
}