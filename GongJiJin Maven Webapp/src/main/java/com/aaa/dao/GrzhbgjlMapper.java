package com.aaa.dao;

import com.aaa.entity.Grzhbgjl;

public interface GrzhbgjlMapper {
    int deleteByPrimaryKey(Integer bgzh);

    int insert(Grzhbgjl record);

    int insertSelective(Grzhbgjl record);

    Grzhbgjl selectByPrimaryKey(Integer bgzh);

    int updateByPrimaryKeySelective(Grzhbgjl record);

    int updateByPrimaryKey(Grzhbgjl record);
}