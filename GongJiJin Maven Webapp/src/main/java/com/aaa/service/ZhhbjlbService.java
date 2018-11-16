package com.aaa.service;

import java.util.List;
import java.util.Map;

public interface ZhhbjlbService {
	/*提交账户合并申请*/
    public int insertZhhbjlb(Map<String,Object> map);
	/*确认账户合并申请*/
    public int confirmZhhbjlb(Integer jlbh);
    /*查询所有账户合并记录申请*/
    public List<Map<String, Object>> findByConditions(Map<String, Object> map);
}