package com.aaa.wz.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.aaa.entity.Sy_dk_ydtqsp;

public interface Sy_dk_ydtqspService {

	
	  public int add(Sy_dk_ydtqsp tqsp);
	  
	  public  List<Map<String, Object>> queryAll();
	  
	  //���� ID��ѯ
	  public  Map queryId(int ydtqspzj);
	  
	  public Sy_dk_ydtqsp findId(int ydspzj);
	  //�޸�����״̬
	  @Transactional
	  public void update(Sy_dk_ydtqsp ydtqsp);
	  
	
}
