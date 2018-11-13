package com.aaa.wz.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.Sy_dk_ydtqspMapper;

import com.aaa.entity.Sy_dk_ydtqsp;
import com.aaa.wz.service.Sy_dk_ydtqspService;

@Service
public class Sy_dk_ydtqspServiceImpl implements Sy_dk_ydtqspService {
         
	    @Autowired
	    private Sy_dk_ydtqspMapper dao;
	    
	    
	@Override
	public int add(Sy_dk_ydtqsp tqsp) {
		// TODO Auto-generated method stub
		return dao.insertSelective(tqsp);
	}


	@Override
	public List<Map<String, Object>> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}


	@Override
	public  Map queryId(int ydtqspzj){
		// TODO Auto-generated method stub
		return dao.queryId(ydtqspzj);
	}


	@Transactional
	public void update(Sy_dk_ydtqsp ydtqsp) {
		// TODO Auto-generated method stub
		 
		dao.updateByPrimaryKeySelective(ydtqsp);
		
	}


	@Override
	public Sy_dk_ydtqsp findId(int ydspzj) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(ydspzj);
	}


	
}
