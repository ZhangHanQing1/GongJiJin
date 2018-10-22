package com.aaa.dao;

import com.aaa.entity.SyDkZyxx;

public interface Sy_dk_dyxxMapper {
    int deleteByPrimaryKey(Integer dyxxzj);

    int insert(SyDkZyxx record);

    int insertSelective(SyDkZyxx record);

    SyDkZyxx selectByPrimaryKey(Integer dyxxzj);

    int updateByPrimaryKeySelective(SyDkZyxx record);

    int updateByPrimaryKey(SyDkZyxx record);
}