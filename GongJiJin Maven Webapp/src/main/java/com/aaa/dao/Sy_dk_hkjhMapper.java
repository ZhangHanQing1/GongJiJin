package com.aaa.dao;

import com.aaa.entity.SyDkHkjh;

public interface Sy_dk_hkjhMapper {
    int deleteByPrimaryKey(Integer hkjhzj);

    int insert(SyDkHkjh record);

    int insertSelective(SyDkHkjh record);

    SyDkHkjh selectByPrimaryKey(Integer hkjhzj);

    int updateByPrimaryKeySelective(SyDkHkjh record);

    int updateByPrimaryKey(SyDkHkjh record);
}