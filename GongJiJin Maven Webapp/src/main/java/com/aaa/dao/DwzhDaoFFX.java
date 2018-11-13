package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DwzhDaoFFX {
	public List<Map<String, Object>> showJiaoCun(@Param("date1") String date1,@Param("date2") String date2,@Param("dwmc2") String dwmc2);
	public double showJiaoCun1(@Param("date1") String date1,@Param("date2") String date2,@Param("dwmc2") String dwmc2);
	public int showJiaoCun11(@Param("date1") String date1,@Param("date2") String date2,@Param("dwmc2") String dwmc2);
	public double showDwzh(@Param("date1") String date1,@Param("date2") String date2);
	public int showDwzh1(@Param("date1") String date1,@Param("date2") String date2);
	public List<Map<String, Object>> showGeTq(@Param("date1") String date1,@Param("date2") String date2,@Param("tqlx") String tqlx,@Param("spzt2") String spzt2);
	public double showGedk11(@Param("date1") String date1,@Param("date2") String date2,@Param("tqlx") String tqlx,@Param("spzt2") String spzt2);
	public int showGedk111(@Param("date1") String date1,@Param("date2") String date2,@Param("tqlx") String tqlx,@Param("spzt2") String spzt2);
	public double showGedk(@Param("date1") String date1,@Param("date2") String date2);
	public int showGedk1(@Param("date1") String date1,@Param("date2") String date2);
}
