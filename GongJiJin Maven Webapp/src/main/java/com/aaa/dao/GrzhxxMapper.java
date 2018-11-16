package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Grzhxx;

public interface GrzhxxMapper {
    int deleteByPrimaryKey(Integer grbh);

    int insert(Grzhxx record);
    /*个人开户*/
    int insertSelective(Map<String,Object> map);

    Grzhxx selectByPrimaryKey(Integer grbh);

    int updateByPrimaryKeySelective(Grzhxx record);

    int updateByPrimaryKey(Grzhxx record);
    /*查询个人缴费信息(缴费用)*/
    Map<String, Object> selectById(Integer grbh);
    /*条件/模糊查询(根据姓名、单位名称/个人账号)*/
    List<Map<String, Object>> findByConditions(Map<String, Object> map);
    /*查询个人账户信息(账户合并用)*/
    Map<String, Object> findById(Integer grbh);
    /*根据身份证号查询出个人其他账户信息*/
    List<Map<String, Object>> findBySbzh(Map<String,Object> map);
    /*个人账户的封存*/
    int fengcun(Integer grbh);
    /*个人账户余额的变更*/
    int changeGrzhye(Map<String, Object> map);
    /*查询个人账户信息(公积金提取用)*/
    Map<String, Object> selectByGrbh(Integer grbh);
}