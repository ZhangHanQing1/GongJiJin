package com.aaa.dao;

import java.util.List;
import java.util.Map;


import com.aaa.entity.Sy_dk_ydtqsp;

public interface Sy_dk_ydtqspMapper {
    int deleteByPrimaryKey(Integer ydtqspzj);

    int insert(Sy_dk_ydtqsp record);

    int insertSelective(Sy_dk_ydtqsp record);

    Sy_dk_ydtqsp selectByPrimaryKey(Integer ydtqspzj);

    int updateByPrimaryKeySelective(Sy_dk_ydtqsp record);

    int updateByPrimaryKey(Sy_dk_ydtqsp record);
    
    //查询
	  public  List<Map<String, Object>> queryAll();
	  
	//根据 ID查询
	  public  Map queryId(int ydtqspzj);
}