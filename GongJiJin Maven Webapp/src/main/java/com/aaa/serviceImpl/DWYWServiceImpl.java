package com.aaa.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.DwywmxbMapper;
import com.aaa.dao.DwzhMapper;
import com.aaa.entity.Dwzh;
import com.aaa.service.DWYWService;
@Service
public class DWYWServiceImpl implements DWYWService {
@Autowired
private DwzhMapper dao;
@Autowired
private DwywmxbMapper daoo;
	@Override
	public List<Map> select(String dwmc2) {
		// TODO Auto-generated method stub
		return dao.selectId(dwmc2);
	}
	@Override
	public List<Map> selectGR(Integer dwbh) {
		// TODO Auto-generated method stub
		return daoo.selectGR(dwbh);
	}

}
