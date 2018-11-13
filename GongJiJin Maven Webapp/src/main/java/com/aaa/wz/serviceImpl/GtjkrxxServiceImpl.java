package com.aaa.wz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.GtjkrxxMapper;
import com.aaa.entity.Gtjkrxx;
import com.aaa.wz.service.GtjkrxxService;

@Service 
public class GtjkrxxServiceImpl implements GtjkrxxService {
	
	   @Autowired
	   private GtjkrxxMapper dao;

	@Override
	public int add(Gtjkrxx gtjkr) {
		// TODO Auto-generated method stub
		
		 return dao.insertSelective(gtjkr);
		
	}

	@Override
	public Gtjkrxx queryId(int gtjkr) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(gtjkr);
	}
  
}
