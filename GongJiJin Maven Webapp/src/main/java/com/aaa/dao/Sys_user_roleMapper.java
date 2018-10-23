package com.aaa.dao;

import com.aaa.entity.Sys_user_role;

public interface Sys_user_roleMapper {
    int deleteByPrimaryKey(Integer surId);

    int insert(Sys_user_role record);

    int insertSelective(Sys_user_role record);

    Sys_user_role selectByPrimaryKey(Integer surId);

    int updateByPrimaryKeySelective(Sys_user_role record);

    int updateByPrimaryKey(Sys_user_role record);
}