package com.aaa.dao;

import com.aaa.entity.Sy_dk_hkjh;

public interface Sy_dk_hkjhMapper {
    int deleteByPrimaryKey(Integer hkjhzj);

    int insert(Sy_dk_hkjh record);

    int insertSelective(Sy_dk_hkjh record);

    Sy_dk_hkjh selectByPrimaryKey(Integer hkjhzj);

    int updateByPrimaryKeySelective(Sy_dk_hkjh record);

    int updateByPrimaryKey(Sy_dk_hkjh record);
}