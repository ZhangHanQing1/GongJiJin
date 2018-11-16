package com.aaa.wz.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.aaa.entity.Gjjzxzh;



public interface GjjzxzhService {

	public  List<Map<String, Object>> gjjzxAll();
	
	@Transactional
	  public void update(Gjjzxzh gjjzxzh);

}
