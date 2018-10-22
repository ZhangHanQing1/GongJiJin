package com.aaa.dao;

import com.aaa.entity.SyDkDhgl;

public interface Sy_dk_dhglMapper {
    int deleteByPrimaryKey(Integer dhglzj);

    int insert(SyDkDhgl record);

    int insertSelective(SyDkDhgl record);

    SyDkDhgl selectByPrimaryKey(Integer dhglzj);

    int updateByPrimaryKeySelective(SyDkDhgl record);

    int updateByPrimaryKey(SyDkDhgl record);
}