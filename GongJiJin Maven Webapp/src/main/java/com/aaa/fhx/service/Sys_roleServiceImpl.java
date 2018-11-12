package com.aaa.fhx.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.Sys_roleMapper;


@Service
public class Sys_roleServiceImpl implements Sys_roleService {
	@Autowired
	private Sys_roleMapper dao;
	@Override
	public List<Map<String, Object>> showRole() {
		// TODO Auto-generated method stub
		return dao.showRole();
	}

}
