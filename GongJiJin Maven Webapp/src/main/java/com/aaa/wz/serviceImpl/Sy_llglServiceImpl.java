package com.aaa.wz.serviceImpl;

import org.springframework.stereotype.Service;

import com.aaa.entity.Sy_llgl;
import com.aaa.wz.dao.Sy_llglMapper;
import com.aaa.wz.service.Sy_llglService;
@Service
public class Sy_llglServiceImpl implements Sy_llglService {
        
	   private Sy_llglMapper dao;
	@Override
	public int deleteByPrimaryKey(Integer llzj) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(llzj);
	}

	@Override
	public int insert(Sy_llgl record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(Sy_llgl record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public Sy_llgl selectByPrimaryKey(Integer llzj) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(llzj);
	}

	@Override
	public int updateByPrimaryKeySelective(Sy_llgl record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Sy_llgl record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}

}
