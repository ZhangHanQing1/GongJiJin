package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Sys_role;

public interface Sys_roleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Sys_role record);

    int insertSelective(Sys_role record);

    Sys_role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Sys_role record);

    int updateByPrimaryKey(Sys_role record);
	//查询权限表
	public List<Map<String, Object>> showRole();
}