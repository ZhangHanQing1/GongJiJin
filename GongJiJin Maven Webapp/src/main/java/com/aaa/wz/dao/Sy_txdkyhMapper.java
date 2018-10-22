package com.aaa.wz.dao;

import com.aaa.entity.Sy_txdkyh;

public interface Sy_txdkyhMapper {
    int deleteByPrimaryKey(Integer txyhzj);

    int insert(Sy_txdkyh record);

    int insertSelective(Sy_txdkyh record);

    Sy_txdkyh selectByPrimaryKey(Integer txyhzj);

    int updateByPrimaryKeySelective(Sy_txdkyh record);

    int updateByPrimaryKey(Sy_txdkyh record);
}