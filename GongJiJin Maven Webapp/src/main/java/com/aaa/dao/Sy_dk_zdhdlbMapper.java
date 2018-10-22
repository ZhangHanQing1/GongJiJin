package com.aaa.dao;

import com.aaa.entity.SyDkZdhdlb;

public interface Sy_dk_zdhdlbMapper {
    int deleteByPrimaryKey(Integer zdhkzj);

    int insert(SyDkZdhdlb record);

    int insertSelective(SyDkZdhdlb record);

    SyDkZdhdlb selectByPrimaryKey(Integer zdhkzj);

    int updateByPrimaryKeySelective(SyDkZdhdlb record);

    int updateByPrimaryKey(SyDkZdhdlb record);
}