package com.aaa.dao;

import com.aaa.entity.Sy_dk_zyxx;

public interface Sy_dk_zyxxMapper {
    int deleteByPrimaryKey(Integer zyxxzj);

    int insert(Sy_dk_zyxx record);

    int insertSelective(Sy_dk_zyxx record);

    Sy_dk_zyxx selectByPrimaryKey(Integer zyxxzj);

    int updateByPrimaryKeySelective(Sy_dk_zyxx record);

    int updateByPrimaryKey(Sy_dk_zyxx record);
}