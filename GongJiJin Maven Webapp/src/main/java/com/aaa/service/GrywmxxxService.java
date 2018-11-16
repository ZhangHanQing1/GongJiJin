package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Grywmxxx;

public interface GrywmxxxService {

    /*个人缴存，保存记录*/
    public int insertSelective(Map<String, Object> map);
    /*查询个人缴存记录*/
    public List<Grywmxxx> selectById(int grbh);
}
