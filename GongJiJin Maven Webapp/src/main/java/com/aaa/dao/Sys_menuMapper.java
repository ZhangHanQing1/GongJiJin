package com.aaa.dao;

import com.aaa.entity.Sys_menu;

public interface Sys_menuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(Sys_menu record);

    int insertSelective(Sys_menu record);

    Sys_menu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(Sys_menu record);

    int updateByPrimaryKey(Sys_menu record);
}