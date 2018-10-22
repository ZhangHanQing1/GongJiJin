package com.aaa.wz.service;

import com.aaa.entity.SyLlgl;


public interface Sy_llglService {
	
	    int deleteByPrimaryKey(Integer llzj);

	    int insert(SyLlgl record);

	    int insertSelective(SyLlgl record);

	    SyLlgl selectByPrimaryKey(Integer llzj);

	    int updateByPrimaryKeySelective(SyLlgl record);

	    int updateByPrimaryKey(SyLlgl record);

}
