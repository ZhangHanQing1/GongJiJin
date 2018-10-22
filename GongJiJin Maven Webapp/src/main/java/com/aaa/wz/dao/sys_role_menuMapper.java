package com.aaa.wz.dao;

import com.aaa.entity.sys_role_menu;

public interface sys_role_menuMapper {
    int deleteByPrimaryKey(Integer srmId);

    int insert(sys_role_menu record);

    int insertSelective(sys_role_menu record);

    sys_role_menu selectByPrimaryKey(Integer srmId);

    int updateByPrimaryKeySelective(sys_role_menu record);

    int updateByPrimaryKey(sys_role_menu record);
}