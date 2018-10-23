package com.aaa.dao;

import com.aaa.entity.Sy_dk_kksj;

public interface Sy_dk_kksjMapper {
    int deleteByPrimaryKey(Integer kksjzj);

    int insert(Sy_dk_kksj record);

    int insertSelective(Sy_dk_kksj record);

    Sy_dk_kksj selectByPrimaryKey(Integer kksjzj);

    int updateByPrimaryKeySelective(Sy_dk_kksj record);

    int updateByPrimaryKey(Sy_dk_kksj record);
}