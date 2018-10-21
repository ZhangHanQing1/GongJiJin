package com.aaa.dao;

import com.aaa.entity.Sy_gj_ydhkrxx;

public interface Sy_gj_ydhkrxxMapper {
    int deleteByPrimaryKey(Integer hkrzj);

    int insert(Sy_gj_ydhkrxx record);

    int insertSelective(Sy_gj_ydhkrxx record);

    Sy_gj_ydhkrxx selectByPrimaryKey(Integer hkrzj);

    int updateByPrimaryKeySelective(Sy_gj_ydhkrxx record);

    int updateByPrimaryKey(Sy_gj_ydhkrxx record);
}