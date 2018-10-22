package com.aaa.wz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.wz.entity.Jsxmdkjkhtxx;
import com.aaa.wz.dao.JsxmdkjkhtxxMapper;
import com.aaa.wz.service.JsxmdkjkhtxxService;
@Service
public class JsxmdkjkhtxxServiceImpl implements JsxmdkjkhtxxService {
	
	@Autowired
	private JsxmdkjkhtxxMapper dao;

	@Override
	public int deleteByPrimaryKey(Integer zj) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(zj);
	}
 
	@Override
	public int insert(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public Jsxmdkjkhtxx selectByPrimaryKey(Integer zj) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(zj);
	}

	@Override
	public int updateByPrimaryKeySelective(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}

}
