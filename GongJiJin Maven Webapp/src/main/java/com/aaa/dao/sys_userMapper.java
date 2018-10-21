package com.aaa.dao;

import com.aaa.entity.sys_user;

public interface sys_userMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(sys_user record);

    int insertSelective(sys_user record);

    sys_user selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(sys_user record);

    int updateByPrimaryKey(sys_user record);
}