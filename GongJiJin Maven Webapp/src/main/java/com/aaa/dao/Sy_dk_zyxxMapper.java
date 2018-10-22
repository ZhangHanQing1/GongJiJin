package com.aaa.dao;

import com.aaa.entity.SyDkZyxx;

public interface Sy_dk_zyxxMapper {
    int deleteByPrimaryKey(Integer zyxxzj);

    int insert(SyDkZyxx record);

    int insertSelective(SyDkZyxx record);

    SyDkZyxx selectByPrimaryKey(Integer zyxxzj);

    int updateByPrimaryKeySelective(SyDkZyxx record);

    int updateByPrimaryKey(SyDkZyxx record);
}