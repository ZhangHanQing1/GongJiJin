package com.aaa.dao;

import com.aaa.entity.SysUserPost;

public interface sys_user_postMapper {
    int deleteByPrimaryKey(Integer supId);

    int insert(SysUserPost record);

    int insertSelective(SysUserPost record);

    SysUserPost selectByPrimaryKey(Integer supId);

    int updateByPrimaryKeySelective(SysUserPost record);

    int updateByPrimaryKey(SysUserPost record);
}