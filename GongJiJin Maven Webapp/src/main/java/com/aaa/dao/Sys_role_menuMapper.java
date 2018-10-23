package com.aaa.dao;

import com.aaa.entity.Sys_role_menu;

public interface Sys_role_menuMapper {
    int deleteByPrimaryKey(Integer srmId);

    int insert(Sys_role_menu record);

    int insertSelective(Sys_role_menu record);

    Sys_role_menu selectByPrimaryKey(Integer srmId);

    int updateByPrimaryKeySelective(Sys_role_menu record);

    int updateByPrimaryKey(Sys_role_menu record);
}