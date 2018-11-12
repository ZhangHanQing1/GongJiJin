package com.aaa.wz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.Sy_dk_dyxxMapper;
import com.aaa.entity.Sy_dk_dyxx;
import com.aaa.wz.service.Sy_dk_dyxxService;

@Service
public class Sy_dk_dyxxServiceImpl implements Sy_dk_dyxxService {
	  
	  @Autowired
	  private Sy_dk_dyxxMapper dao;

	@Override
	public int add(Sy_dk_dyxx dyxx) {
		return dao.insertSelective(dyxx);
	}
	
	
	 

}
