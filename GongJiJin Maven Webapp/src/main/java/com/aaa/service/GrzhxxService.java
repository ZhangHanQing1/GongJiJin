package com.aaa.service;

import java.util.List;
import java.util.Map;

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
}
