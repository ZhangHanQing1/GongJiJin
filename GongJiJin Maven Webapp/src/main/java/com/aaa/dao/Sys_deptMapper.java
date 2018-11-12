package com.aaa.dao;

import com.aaa.entity.Sys_dept;

public interface Sys_deptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Sys_dept record);

    int insertSelective(Sys_dept record);

    Sys_dept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(Sys_dept record);

    int updateByPrimaryKey(Sys_dept record);
}