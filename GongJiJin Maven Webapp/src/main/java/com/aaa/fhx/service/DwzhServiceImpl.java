package com.aaa.fhx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.DwzhMapper;



@Service
public class DwzhServiceImpl implements DwzhService {
	@Autowired
	private DwzhMapper dao;
	@Override
	public double showDwzh(String date1, String date2) {
		// TODO Auto-generated method stub
		return dao.showDwzh(date1, date2);
	}

	@Override
	public int showDwzh1(String date1, String date2) {
		// TODO Auto-generated method stub
		return dao.showDwzh1(date1, date2);
	}

	@Override
	public double showGedk(String date1, String date2) {
		// TODO Auto-generated method stub
		return dao.showGedk(date1, date2);
	}

	@Override
	public int showGedk1(String date1, String date2) {
		// TODO Auto-generated method stub
		return dao.showGedk1(date1, date2);
	}

}
