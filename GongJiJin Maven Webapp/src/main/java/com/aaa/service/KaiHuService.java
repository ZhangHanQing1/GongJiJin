package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.CeShiList;
import com.aaa.entity.Dwzh;
import com.aaa.entity.TongYong;

public interface KaiHuService {
	//添加单位信息
	public void add(Dwzh dwzh);
//查询单位信息
  List<Map> select();
  //根据ID查询单位信息
  List<Map> selectId(String dwmc2);
//单位比例修改
  public void BiLiUp(CeShiList Ceshi);
//个人基数修改前查询  selectGR
  public List<Map>selectGR(String dwmc2);
//个人基数修改并保存 
  public void JiShuUp(CeShiList Ceshi);
  //个人基数变更记录
  public List<Map> selectJiShu();
}
