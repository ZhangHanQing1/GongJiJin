package com.aaa.dao;

import com.aaa.entity.SyDkKksj;

public interface Sy_dk_kksjMapper {
    int deleteByPrimaryKey(Integer kksjzj);

    int insert(SyDkKksj record);

    int insertSelective(SyDkKksj record);

    SyDkKksj selectByPrimaryKey(Integer kksjzj);

    int updateByPrimaryKeySelective(SyDkKksj record);

    int updateByPrimaryKey(SyDkKksj record);
}