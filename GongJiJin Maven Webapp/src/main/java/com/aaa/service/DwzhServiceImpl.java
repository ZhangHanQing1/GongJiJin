package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.DwzhDaoFFX;
import com.aaa.entity.Sy_gj_tqspb;

@Service
public class DwzhServiceImpl implements DwzhService {
	@Autowired
	private DwzhDaoFFX dao;
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
	public double showGedk11(String date1, String date2,String tqlx,String spzt2) {
		// TODO Auto-generated method stub
		return dao.showGedk11(date1, date2,tqlx,spzt2);
	}

	@Override
	public int showGedk111(String date1, String date2,String tqlx,String spzt2) {
		// TODO Auto-generated method stub
		return dao.showGedk111(date1, date2,tqlx,spzt2);
	}

	@Override
	public List<Map<String, Object>> showGeTq(String date1, String date2,String tqlx,String spzt2) {
		// TODO Auto-generated method stub
		return dao.showGeTq(date1, date2,tqlx,spzt2);
	}

	@Override
	public List<Map<String, Object>> showJiaoCun(String date1, String date2,String dwmc2) {
		// TODO Auto-generated method stub
		return dao.showJiaoCun(date1, date2,dwmc2);
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

	@Override
	public double showJiaoCun1(String date1, String date2,String dwmc2) {
		// TODO Auto-generated method stub
		return dao.showJiaoCun1(date1, date2,dwmc2);
	}

	@Override
	public int showJiaoCun11(String date1, String date2,String dwmc2) {
		// TODO Auto-generated method stub
		return dao.showJiaoCun11(date1, date2,dwmc2);
	}
}
