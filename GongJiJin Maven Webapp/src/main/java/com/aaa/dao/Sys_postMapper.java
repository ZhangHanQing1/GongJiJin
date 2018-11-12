package com.aaa.dao;

import com.aaa.entity.Sys_post;

public interface Sys_postMapper {
    int deleteByPrimaryKey(Integer postId);

    int insert(Sys_post record);

    int insertSelective(Sys_post record);

    Sys_post selectByPrimaryKey(Integer postId);

    int updateByPrimaryKeySelective(Sys_post record);

    int updateByPrimaryKey(Sys_post record);
}