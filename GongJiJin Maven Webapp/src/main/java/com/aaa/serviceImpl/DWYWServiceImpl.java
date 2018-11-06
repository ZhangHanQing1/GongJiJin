package com.aaa.serviceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.DwywmxbMapper;
import com.aaa.dao.DwzhMapper;
import com.aaa.dao.GrywmxxxMapper;
import com.aaa.entity.Dwzh;
import com.aaa.entity.Grywmxxx;
import com.aaa.service.DWYWService;
@Service
public class DWYWServiceImpl implements DWYWService {
@Autowired
private DwzhMapper dao;
@Autowired
private DwywmxbMapper daoo;
@Autowired
private GrywmxxxMapper daooo;
	@Override
	public List<Map> select(String dwmc2) {
		// TODO Auto-generated method stub
		return dao.selectId(dwmc2);
	}
	@Override
	public List<Map> selectGR(Integer dwbh) {
		// TODO Auto-generated method stub
		return daoo.selectGR(dwbh);
	}
	@Override
	public void add(Map map) {
		//��ӵ�λҵ���������
		daoo.add(map);
		System.out.println(map.get("dwywlsh")+"asdasdasdasdasda");
		//�޸ĸ����˻��Ľ��
		daoo.uptateGR(map);
		//��ѯ�������˵���Ϣ���ѵ�λ���˱��浽������ϸ
		List<Map> list=daoo.selectG(map);
		  for (Map map2 : list) {
		  	  BigDecimal DWYJCE=(BigDecimal) map2.get("DWYJCE");
		  	  BigDecimal GRYJCE=(BigDecimal) map2.get("DWYJCE");
		  	  BigDecimal fse=DWYJCE.add(GRYJCE);
			  Grywmxxx gr=new Grywmxxx();  
		  	  gr.setGrbh((Integer) map2.get("GRBH"));
		  	  gr.setDwywlsh((Integer)map.get("dwywlsh"));
		  	  gr.setDwje(DWYJCE);
		  	  gr.setGrje(GRYJCE);
		  	  gr.setFse3(fse);
		  	  daooo.insertSelective(gr);	  
		}
		  
		  
		System.out.println(list);
		
	}

}
