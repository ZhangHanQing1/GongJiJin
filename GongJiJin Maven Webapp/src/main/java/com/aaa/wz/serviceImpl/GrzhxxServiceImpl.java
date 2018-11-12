package com.aaa.wz.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.GrzhxxMapper;
import com.aaa.entity.Grzhxx;
import com.aaa.wz.service.GrzhxxService;


@Service
public class GrzhxxServiceImpl implements  GrzhxxService {
	   
	   @Autowired
	   private GrzhxxMapper  dao;

	@Override
	public Grzhxx queryId(int grbh) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(grbh);
	}

}
