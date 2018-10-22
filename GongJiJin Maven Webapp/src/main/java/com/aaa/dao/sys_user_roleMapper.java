package com.aaa.dao;

import com.aaa.entity.SysUserRole;

public interface sys_user_roleMapper {
    int deleteByPrimaryKey(Integer surId);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer surId);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}