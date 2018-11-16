package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Grzhxx;

public interface GrzhxxService {
	/*个人开户*/
	public int insertGrzhxx(Map<String,Object> map);
	/*个人开户(多条)*/
	public int insertMany(String[][] data);
	/*根据ID查询个人缴费信息*/
	public Map<String, Object> selectById(Integer grbh);
    /*条件/模糊查询(根据姓名、单位名称/个人账号)*/
    List<Map<String, Object>> findByConditions(Map<String, Object> map);
    /*根据个人账号查询出个人信息并查询出该员工的其他公积金账户*/
    public List<Map<String, Object>> findById(Integer grbh);
	/*根据ID查询个人账户信息(公积金提取用)*/
	public Map<String, Object> selectByGrbh(Integer grbh);
	/*查询单位账户信息供个人开户时选择*/
	public List<Map<String, Object>> findAllDwzh();
    /*查询个人信息(查看个人详细信息用)*/
    public Grzhxx selectByPrimaryKey(Integer grbh);
    /*修改个人信息*/
    public int updateByPrimaryKeySelective(Grzhxx record);
    /*个人账户封存*/
    public int fengcun(Integer grbh);
    /*个人账户启封*/
    public int qifeng(Integer grbh);
    /*检查员工是否在该公司已经开过户*/
    public int checkSbzh(Integer dwzh,String sbzh);
}
