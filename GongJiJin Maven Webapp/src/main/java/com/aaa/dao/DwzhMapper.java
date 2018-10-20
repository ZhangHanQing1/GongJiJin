package com.aaa.dao;

import com.aaa.entity.Dwzh;

public interface DwzhMapper {
    int deleteByPrimaryKey(Integer dwbh);

    int insert(Dwzh record);

    int insertSelective(Dwzh record);

    Dwzh selectByPrimaryKey(Integer dwbh);

    int updateByPrimaryKeySelective(Dwzh record);

    int updateByPrimaryKey(Dwzh record);
}