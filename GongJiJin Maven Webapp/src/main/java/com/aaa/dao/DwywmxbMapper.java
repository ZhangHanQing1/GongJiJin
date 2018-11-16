package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Dwywmxb;

public interface DwywmxbMapper {
    int deleteByPrimaryKey(Integer dwywlsh);

    int insert(Dwywmxb record);
    //汇缴保存
    int insertSelective(Map map);

    Dwywmxb selectByPrimaryKey(Integer dwywlsh);

    int updateByPrimaryKeySelective(Dwywmxb record);

    int updateByPrimaryKey(Dwywmxb record);
    
  //根据单位编号查询个人信息
  	public List<Map> selectGR(Integer dwbh);
    
  //根据单位编号查询个人信息
  	public List<Map> selectG(Map map);
  //汇缴保存单位业务
  	public int add(Map map);
  	//修改个人账户额
  	public void uptateGR(Map map);
  	//修改单位账户余额和缴交至日期
  	public void updateDW(Map map);
  //获取上次汇缴金额人数，查询最近一次的汇缴记录
  	public Map selectSC(Integer dwbh);
  //单位汇缴明细查询
  	public List<Map> selectHui(String dwmc2);

	//个人明细查询
	public List<Map> selectGRM(Integer DWYWLSH); 	
  	
}