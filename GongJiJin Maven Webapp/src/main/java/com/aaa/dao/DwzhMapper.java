package com.aaa.dao;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Dwzh;

public interface DwzhMapper {
    int deleteByPrimaryKey(Integer dwbh);

    int insert(Dwzh record);

    int insertSelective(Dwzh record);

    Dwzh selectByPrimaryKey(Integer dwbh);

    int updateByPrimaryKeySelective(Dwzh record);

    int updateByPrimaryKey(Dwzh record);
    
	public double showDwzh(@Param("date1") String date1,@Param("date2") String date2);
	public int showDwzh1(@Param("date1") String date1,@Param("date2") String date2);
	public double showGedk(@Param("date1") String date1,@Param("date2") String date2);
	public int showGedk1(@Param("date1") String date1,@Param("date2") String date2);
}