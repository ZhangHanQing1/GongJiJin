package com.aaa.dao;

import com.aaa.entity.Sys_user;

public interface Sys_userMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Sys_user record);

    int insertSelective(Sys_user record);

    Sys_user selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Sys_user record);

    int updateByPrimaryKey(Sys_user record);
}