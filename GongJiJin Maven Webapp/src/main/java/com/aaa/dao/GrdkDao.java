package com.aaa.dao;

import org.apache.ibatis.annotations.Param;

public interface GrdkDao {
	public double showGedk(@Param("date1") String date1,@Param("date2") String date2);
	public int showGedk1(@Param("date1") String date1,@Param("date2") String date2);
}
