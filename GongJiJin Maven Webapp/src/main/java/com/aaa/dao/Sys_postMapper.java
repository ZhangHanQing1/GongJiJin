package com.aaa.dao;

import com.aaa.entity.SysPost;

public interface Sys_postMapper {
    int deleteByPrimaryKey(Integer postId);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    SysPost selectByPrimaryKey(Integer postId);

    int updateByPrimaryKeySelective(SysPost record);

    int updateByPrimaryKey(SysPost record);
}