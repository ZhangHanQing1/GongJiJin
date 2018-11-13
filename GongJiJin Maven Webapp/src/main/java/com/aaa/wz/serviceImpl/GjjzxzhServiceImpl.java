package com.aaa.wz.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.GjjzxzhMapper;
import com.aaa.entity.Gjjzxzh;
import com.aaa.wz.service.GjjzxzhService;

@Service
public class GjjzxzhServiceImpl implements GjjzxzhService{
            
	
	        @Autowired
	        private  GjjzxzhMapper dao;

			@Override
			public List<Map<String, Object>> gjjzxAll() {
				// TODO Auto-generated method stub
				return dao.gjjzxAll();
			}
	  
	

}
