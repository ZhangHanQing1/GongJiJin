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
  //汇缴保存
  	public void add(Map map);
  	//修改个人账户额
  	public void uptateGR(Map map);
  	//修改单位账户余额和缴交至日期
  	public void updateDW(Map map);
  	
}