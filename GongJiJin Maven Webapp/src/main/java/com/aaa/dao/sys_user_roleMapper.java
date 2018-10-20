package com.aaa.dao;

import com.aaa.entity.sys_user_role;

public interface sys_user_roleMapper {
    int deleteByPrimaryKey(Integer surId);

    int insert(sys_user_role record);

    int insertSelective(sys_user_role record);

    sys_user_role selectByPrimaryKey(Integer surId);

    int updateByPrimaryKeySelective(sys_user_role record);

    int updateByPrimaryKey(sys_user_role record);
}