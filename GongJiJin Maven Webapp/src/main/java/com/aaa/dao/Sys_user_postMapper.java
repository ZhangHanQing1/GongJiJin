package com.aaa.dao;

import com.aaa.entity.Sys_user_post;

public interface Sys_user_postMapper {
    int deleteByPrimaryKey(Integer supId);

    int insert(Sys_user_post record);

    int insertSelective(Sys_user_post record);

    Sys_user_post selectByPrimaryKey(Integer supId);

    int updateByPrimaryKeySelective(Sys_user_post record);

    int updateByPrimaryKey(Sys_user_post record);
}