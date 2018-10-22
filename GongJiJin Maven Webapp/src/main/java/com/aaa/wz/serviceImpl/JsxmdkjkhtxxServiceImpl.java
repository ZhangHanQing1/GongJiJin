package com.aaa.wz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.JsxmdkjkhtxxMapper;
import com.aaa.entity.Jsxmdkjkhtxx;
import com.aaa.wz.service.JsxmdkjkhtxxService;
@Service
public class JsxmdkjkhtxxServiceImpl implements JsxmdkjkhtxxService {
	
	@Autowired
	private JsxmdkjkhtxxMapper dao;

	@Override
	public int deleteByPrimaryKey(Integer zj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Jsxmdkjkhtxx selectByPrimaryKey(Integer zj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Jsxmdkjkhtxx record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
