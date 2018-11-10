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
	//获取上次汇缴金额人数，查询最近一次的汇缴记录
	public Map selectSC(Integer dwbh);
	//单位汇缴明细查询
	public List<Map> selectHui(String dwmc2);
	//个人明细查询
	public List<Map> selectGRM(Integer DWYWLSH);
	
}
