package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Dwywmxb;

public interface DwywmxbMapper {
    int deleteByPrimaryKey(Integer dwywlsh);

    int insert(Dwywmxb record);

    int insertSelective(Dwywmxb record);

    Dwywmxb selectByPrimaryKey(Integer dwywlsh);

    int updateByPrimaryKeySelective(Dwywmxb record);

    int updateByPrimaryKey(Dwywmxb record);
    
  //���ݵ�λ��Ų�ѯ������Ϣ
  	public List<Map> selectGR(Integer dwbh);
}