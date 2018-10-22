package com.aaa.dao;

import com.aaa.entity.SyDkYdtqsp;

public interface Sy_dk_ydtqspMapper {
    int deleteByPrimaryKey(Integer ydtqspzj);

    int insert(SyDkYdtqsp record);

    int insertSelective(SyDkYdtqsp record);

    SyDkYdtqsp selectByPrimaryKey(Integer ydtqspzj);

    int updateByPrimaryKeySelective(SyDkYdtqsp record);

    int updateByPrimaryKey(SyDkYdtqsp record);
}