package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Gjjzxzh;

public interface GjjzxzhMapper {
    int deleteByPrimaryKey(Integer zhid);

    int insert(Gjjzxzh record);

    int insertSelective(Gjjzxzh record);

    Gjjzxzh selectByPrimaryKey(Integer zhid);

    int updateByPrimaryKeySelective(Gjjzxzh record);

    int updateByPrimaryKey(Gjjzxzh record);
    
  //≤È—Ø
	  public  List<Map<String, Object>> gjjzxAll();
}