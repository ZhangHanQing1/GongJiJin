package com.aaa.wz.service;

import org.springframework.transaction.annotation.Transactional;

import com.aaa.entity.Grzfdkjkhtxx;
import com.aaa.entity.Gtjkrxx;
import com.aaa.entity.Sy_dk_dkrpo;
import com.aaa.entity.Sy_dk_dyxx;

public interface GrzfdkjkhtxxService {

	
	  public int add(Grzfdkjkhtxx  htxx);
	  
	  
	  @Transactional
	  public void update(Grzfdkjkhtxx grzfdkjkhtxx);
	  
	  public Grzfdkjkhtxx queayid(int htzj );
} 
