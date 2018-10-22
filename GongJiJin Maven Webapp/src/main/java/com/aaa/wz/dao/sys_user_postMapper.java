package com.aaa.wz.dao;

import com.aaa.entity.sys_user_post;

public interface sys_user_postMapper {
    int deleteByPrimaryKey(Integer supId);

    int insert(sys_user_post record);

    int insertSelective(sys_user_post record);

    sys_user_post selectByPrimaryKey(Integer supId);

    int updateByPrimaryKeySelective(sys_user_post record);

    int updateByPrimaryKey(sys_user_post record);
}