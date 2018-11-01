package com.aaa.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ZhxxbgjlbMapper;
import com.aaa.service.BiLiService;
@Service
public class BiLiServiceImpl implements BiLiService {
@Autowired
private ZhxxbgjlbMapper dao;
	@Override
	public List<Map> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
