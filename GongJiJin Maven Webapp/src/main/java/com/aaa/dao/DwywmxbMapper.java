package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Dwywmxb;

public interface DwywmxbMapper {
    int deleteByPrimaryKey(Integer dwywlsh);

    int insert(Dwywmxb record);
    //��ɱ���
    int insertSelective(Map map);

    Dwywmxb selectByPrimaryKey(Integer dwywlsh);

    int updateByPrimaryKeySelective(Dwywmxb record);

    int updateByPrimaryKey(Dwywmxb record);
    
  //���ݵ�λ��Ų�ѯ������Ϣ
  	public List<Map> selectGR(Integer dwbh);
    
  //���ݵ�λ��Ų�ѯ������Ϣ
  	public List<Map> selectG(Map map);
  //��ɱ���
  	public void add(Map map);
  	//�޸ĸ����˻���
  	public void uptateGR(Map map);
  	//�޸ĵ�λ�˻����ͽɽ�������
  	public void updateDW(Map map);
  	
}