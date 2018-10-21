package com.aaa.dao;

import com.aaa.entity.Sys_role;

public interface Sys_roleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Sys_role record);

    int insertSelective(Sys_role record);

    Sys_role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Sys_role record);

    int updateByPrimaryKey(Sys_role record);
}