package com.aaa.service;

import java.util.List;
import java.util.Map;

public interface TqspbService {
    /*增加一条提取申请*/
    public int insertSelective(Map<String, Object> map);
    /*修改提取记录(审批)*/
    int updateByPrimaryKeySelective(Integer tqbh);
    /*查询所有的公积金提取申请*/
    public List<Map<String, Object>> selectTqspb();
}
