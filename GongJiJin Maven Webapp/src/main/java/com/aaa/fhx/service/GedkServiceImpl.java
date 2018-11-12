package com.aaa.fhx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.GrzfdkjkhtxxMapper;


@Service
public class GedkServiceImpl implements GedkService {
	@Autowired
	private GrzfdkjkhtxxMapper dao;
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
