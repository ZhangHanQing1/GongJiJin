package com.aaa.dao;

import com.aaa.entity.SyDkDbgs;

public interface Sy_dk_dbgsMapper {
    int deleteByPrimaryKey(Integer dbgszj);

    int insert(SyDkDbgs record);

    int insertSelective(SyDkDbgs record);

    SyDkDbgs selectByPrimaryKey(Integer dbgszj);

    int updateByPrimaryKeySelective(SyDkDbgs record);

    int updateByPrimaryKey(SyDkDbgs record);
}