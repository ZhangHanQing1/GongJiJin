package com.aaa.dao;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Grzfdkjkhtxx;

public interface GrzfdkjkhtxxMapper {
    int deleteByPrimaryKey(Integer htzj);

    int insert(Grzfdkjkhtxx record);

    int insertSelective(Grzfdkjkhtxx record);

    Grzfdkjkhtxx selectByPrimaryKey(Integer htzj);

    int updateByPrimaryKeySelective(Grzfdkjkhtxx record);

    int updateByPrimaryKey(Grzfdkjkhtxx record);
    
    public double showGedk(@Param("date1") String date1,@Param("date2") String date2);
	public int showGedk1(@Param("date1") String date1,@Param("date2") String date2);
}