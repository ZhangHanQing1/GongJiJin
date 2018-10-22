package com.aaa.wz.dao;

import com.aaa.entity.Sy_dk_qtfz;

public interface Sy_dk_qtfzMapper {
    int deleteByPrimaryKey(Integer fzbh);

    int insert(Sy_dk_qtfz record);

    int insertSelective(Sy_dk_qtfz record);

    Sy_dk_qtfz selectByPrimaryKey(Integer fzbh);

    int updateByPrimaryKeySelective(Sy_dk_qtfz record);

    int updateByPrimaryKey(Sy_dk_qtfz record);
}