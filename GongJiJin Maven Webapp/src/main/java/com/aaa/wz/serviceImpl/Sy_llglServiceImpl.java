package com.aaa.wz.serviceImpl;

import org.springframework.stereotype.Service;

import com.aaa.dao.Sy_llglMapper;
import com.aaa.entity.SyLlgl;
import com.aaa.wz.service.Sy_llglService;
@Service
public class Sy_llglServiceImpl implements Sy_llglService {
        
	   private Sy_llglMapper dao;
	

	@Override
	public int insert(SyLlgl record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(SyLlgl record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public SyLlgl selectByPrimaryKey(Integer llzj) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(llzj);
	}

	@Override
	public int updateByPrimaryKeySelective(SyLlgl record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SyLlgl record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer llzj) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(llzj);
	}

}
