package com.aaa.service;

import java.util.List;
import java.util.Map;


public interface DwzhService {
	public List<Map<String, Object>> showJiaoCun(String date1,String date2,String dwmc2);
	public double showJiaoCun1(String date1,String date2,String dwmc2);
	public int showJiaoCun11(String date1,String date2,String dwmc2);
	public double showDwzh(String date1,String date2);
	public int showDwzh1(String date1,String date2);
	public List<Map<String, Object>> showGeTq(String date1,String date2,String tqlx,String spzt2);
	public double showGedk11(String date1,String date2,String tqlx,String spzt2);
	public int showGedk111(String date1,String date2,String tqlx,String spzt2);
	public double showGedk(String date1,String date2);
	public int showGedk1(String date1,String date2);
}
