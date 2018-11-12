package com.aaa.wz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.DbxxMapper;
import com.aaa.entity.Dbxx;
import com.aaa.wz.service.dbxxService;

@Service
public class DbxxServiceImpl implements dbxxService {
       
	   @Autowired
	   private DbxxMapper dao;
	   
	@Override
	public int dbxxadd(Dbxx xx) {
		// TODO Auto-generated method stub
		return dao.insertSelective(xx);
	}

}
