package com.aaa.dao;

import com.aaa.entity.Dwzhzt;

public interface DwzhztMapper {
    int deleteByPrimaryKey(Integer dwzhztbh);

    int insert(Dwzhzt record);

    int insertSelective(Dwzhzt record);

    Dwzhzt selectByPrimaryKey(Integer dwzhztbh);

    int updateByPrimaryKeySelective(Dwzhzt record);

    int updateByPrimaryKey(Dwzhzt record);
}