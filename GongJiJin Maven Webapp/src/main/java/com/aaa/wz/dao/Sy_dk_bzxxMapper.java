package com.aaa.wz.dao;

import com.aaa.entity.Sy_dk_bzxx;

public interface Sy_dk_bzxxMapper {
    int deleteByPrimaryKey(Integer bzxxzj);

    int insert(Sy_dk_bzxx record);

    int insertSelective(Sy_dk_bzxx record);

    Sy_dk_bzxx selectByPrimaryKey(Integer bzxxzj);

    int updateByPrimaryKeySelective(Sy_dk_bzxx record);

    int updateByPrimaryKey(Sy_dk_bzxx record);
}