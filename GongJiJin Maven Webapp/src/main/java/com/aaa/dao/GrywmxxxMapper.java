package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Grywmxxx;

public interface GrywmxxxMapper {
    int deleteByPrimaryKey(Integer grywmxbh);

    int insert(Grywmxxx record);
    /*个人缴费*/
    int insertByMap(Map<String, Object> map);
    
    void insertSelective(Grywmxxx record);

    Grywmxxx selectByPrimaryKey(Integer grywmxbh);

    int updateByPrimaryKeySelective(Grywmxxx record);

    int updateByPrimaryKey(Grywmxxx record);
    /* 查询个人缴费历史记录*/
    List<Grywmxxx> selectById(int grbh);
}