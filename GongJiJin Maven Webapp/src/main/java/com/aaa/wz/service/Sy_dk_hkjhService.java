package com.aaa.wz.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Sy_dk_hkjh;


public interface Sy_dk_hkjhService {

	
	  public int add(Sy_dk_hkjh hkjh);
	  
	  public  List<Map<String, Object>> hkjkAll();
	  
	  public Sy_dk_hkjh hkjhId(int hkjhzj);
	  
	  public void update(Sy_dk_hkjh hkjh);
	  
	  public  Map hkjhIdd(int ydtqspzj);
}
