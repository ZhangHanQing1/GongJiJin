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
	//��ȡ�ϴλ�ɽ����������ѯ���һ�εĻ�ɼ�¼
	public Map selectSC(Integer dwbh);
	//��λ�����ϸ��ѯ
	public List<Map> selectHui(String dwmc2);
	//������ϸ��ѯ
	public List<Map> selectGRM(Integer DWYWLSH);
	
}
