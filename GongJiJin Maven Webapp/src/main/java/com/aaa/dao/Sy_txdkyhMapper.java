package com.aaa.dao;

import com.aaa.entity.SyTxdkyh;

public interface Sy_txdkyhMapper {
    int deleteByPrimaryKey(Integer txyhzj);

    int insert(SyTxdkyh record);

    int insertSelective(SyTxdkyh record);

    SyTxdkyh selectByPrimaryKey(Integer txyhzj);

    int updateByPrimaryKeySelective(SyTxdkyh record);

    int updateByPrimaryKey(SyTxdkyh record);
}