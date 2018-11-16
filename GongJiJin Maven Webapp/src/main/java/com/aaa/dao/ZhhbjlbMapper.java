package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Zhhbjlb;

public interface ZhhbjlbMapper {
    int deleteByPrimaryKey(Integer jlbh);

    int insert(Zhhbjlb record);

    int insertSelective(Zhhbjlb record);

    Zhhbjlb selectByPrimaryKey(Integer jlbh);

    int updateByPrimaryKeySelective(Zhhbjlb record);

    int updateByPrimaryKey(Zhhbjlb record);
    /*添加一条账户合并申请*/
    public void insertzhhbjlb(Map<String,Object> map);
    /*查询所有账户合并申请*/
    public List<Map<String,Object>> findByConditions(Map<String, Object> map);
}