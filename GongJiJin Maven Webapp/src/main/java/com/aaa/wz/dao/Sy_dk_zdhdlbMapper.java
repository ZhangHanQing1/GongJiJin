package com.aaa.wz.dao;

import com.aaa.entity.Sy_dk_zdhdlb;

public interface Sy_dk_zdhdlbMapper {
    int deleteByPrimaryKey(Integer zdhkzj);

    int insert(Sy_dk_zdhdlb record);

    int insertSelective(Sy_dk_zdhdlb record);

    Sy_dk_zdhdlb selectByPrimaryKey(Integer zdhkzj);

    int updateByPrimaryKeySelective(Sy_dk_zdhdlb record);

    int updateByPrimaryKey(Sy_dk_zdhdlb record);
}