package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Dwzh;

public interface DWYWService {
  //查询单位账户信息
	public List<Map> select(String dwmc2);
	//根据单位编号查询个人信息
	public List<Map> selectGR(Integer dwbh);
	//汇缴保存
	public void add(Map map);
}
