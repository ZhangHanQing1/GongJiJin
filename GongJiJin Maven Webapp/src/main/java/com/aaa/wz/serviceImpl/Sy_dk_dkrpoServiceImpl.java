package com.aaa.wz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.Sy_dk_dkrpoMapper;
import com.aaa.entity.Sy_dk_dkrpo;
import com.aaa.wz.service.Sy_dk_dkrpoService;

@Service
public class Sy_dk_dkrpoServiceImpl  implements Sy_dk_dkrpoService{

	  @Autowired
	   private Sy_dk_dkrpoMapper dao;

	@Override
	public int add(Sy_dk_dkrpo dkrpo) {
		// TODO Auto-generated method stub
		
		return dao.insertSelective(dkrpo);
	}

	@Override
	public Sy_dk_dkrpo queryId(int dkrpo) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(dkrpo);
	}
	  
}
