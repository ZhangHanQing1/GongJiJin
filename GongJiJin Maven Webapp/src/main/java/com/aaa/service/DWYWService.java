package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Dwzh;

public interface DWYWService {
  //��ѯ��λ�˻���Ϣ
	public List<Map> select(String dwmc2);
	//���ݵ�λ��Ų�ѯ������Ϣ
	public List<Map> selectGR(Integer dwbh);
	//��ɱ���
	public void add(Map map);
}
