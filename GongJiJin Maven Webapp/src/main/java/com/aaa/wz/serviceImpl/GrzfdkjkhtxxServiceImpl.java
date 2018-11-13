package com.aaa.wz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.GrzfdkjkhtxxMapper;
import com.aaa.dao.GtjkrxxMapper;
import com.aaa.dao.Sy_dk_dkrpoMapper;
import com.aaa.dao.Sy_dk_dyxxMapper;
import com.aaa.entity.Grzfdkjkhtxx;
import com.aaa.entity.Gtjkrxx;
import com.aaa.entity.Sy_dk_dkrpo;
import com.aaa.entity.Sy_dk_dyxx;
import com.aaa.wz.service.GrzfdkjkhtxxService;

@Service
public class GrzfdkjkhtxxServiceImpl implements GrzfdkjkhtxxService {
           
	      @Autowired
	      private GrzfdkjkhtxxMapper  dao; 
	      
	
	
	@Override
	public int add(Grzfdkjkhtxx htxx) {
		// TODO Auto-generated method stub
		
		return dao.insertSelective(htxx);
	}



	@Transactional
	public void update(Grzfdkjkhtxx grzfdkjkhtxx) {
		// TODO Auto-generated method stub
		
		dao.updateByPrimaryKeySelective(grzfdkjkhtxx);
		
	}



	@Override
	public Grzfdkjkhtxx queayid(int htzj) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(htzj);
	}


	

}
