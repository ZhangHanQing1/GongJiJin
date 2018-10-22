package com.aaa.dao;

import com.aaa.entity.SysRoleMenu;

public interface sys_role_menuMapper {
    int deleteByPrimaryKey(Integer srmId);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Integer srmId);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
}