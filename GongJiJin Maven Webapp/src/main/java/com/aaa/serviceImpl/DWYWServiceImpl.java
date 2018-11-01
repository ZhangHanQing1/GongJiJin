package com.aaa.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.DwzhMapper;
import com.aaa.entity.Dwzh;
import com.aaa.service.DWYWService;
@Service
public class DWYWServiceImpl implements DWYWService {
@Autowired
private DwzhMapper dao;
	@Override
	public List<Map> select(String dwmc2) {
		// TODO Auto-generated method stub
		return dao.selectId(dwmc2);
	}

}
