package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.CeShiList;
import com.aaa.entity.Dwzh;
import com.aaa.entity.TongYong;

public interface KaiHuService {
	//��ӵ�λ��Ϣ
	public void add(Dwzh dwzh);
//��ѯ��λ��Ϣ
  List<Map> select();
  //����ID��ѯ��λ��Ϣ
  List<Map> selectId(String dwmc2);
//��λ�����޸�
  public void BiLiUp(CeShiList Ceshi);
//���˻����޸�ǰ��ѯ  selectGR
  public List<Map>selectGR(String dwmc2);
//���˻����޸Ĳ����� 
  public void JiShuUp(CeShiList Ceshi);
  //���˻��������¼
  public List<Map> selectJiShu();
}
