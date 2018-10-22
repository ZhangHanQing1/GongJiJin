package com.aaa.dao;

import com.aaa.entity.SyDkQtfz;

public interface Sy_dk_qtfzMapper {
    int deleteByPrimaryKey(Integer fzbh);

    int insert(SyDkQtfz record);

    int insertSelective(SyDkQtfz record);

    SyDkQtfz selectByPrimaryKey(Integer fzbh);

    int updateByPrimaryKeySelective(SyDkQtfz record);

    int updateByPrimaryKey(SyDkQtfz record);
}