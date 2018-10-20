package com.aaa.dao;

import com.aaa.entity.Sy_dk_dbgs;

public interface Sy_dk_dbgsMapper {
    int deleteByPrimaryKey(Integer dbgszj);

    int insert(Sy_dk_dbgs record);

    int insertSelective(Sy_dk_dbgs record);

    Sy_dk_dbgs selectByPrimaryKey(Integer dbgszj);

    int updateByPrimaryKeySelective(Sy_dk_dbgs record);

    int updateByPrimaryKey(Sy_dk_dbgs record);
}