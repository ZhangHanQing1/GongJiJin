package com.aaa.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.DwzhMapper;
import com.aaa.dao.ZhxxbgjlbMapper;
import com.aaa.entity.CeShiList;
import com.aaa.entity.Dwzh;
import com.aaa.entity.TongYong;
import com.aaa.entity.Zhxxbgjlb;
import com.aaa.service.KaiHuService;
@Service
public class KaiHuServiceImpl implements KaiHuService {
@Autowired
private DwzhMapper dao;
@Autowired
private ZhxxbgjlbMapper daoo;
	public void add(Dwzh dwzh) {
		dao.insertSelective(dwzh);
	}
	@Override
	public List<Map> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}
	@Override
	public List<Map> selectId(String dwmc2) {
		// TODO Auto-generated method stub
		return dao.selectId(dwmc2);
	}
	
	/*@Transactional*/
	@Override
	public void BiLiUp(CeShiList Ceshi ) {
		 for (int i = 0; i < Ceshi.getList().size(); i++) {
			 TongYong tongYong=Ceshi.getList().get(i);
			 
			 dao.BiLiUp(tongYong);
			 daoo.BiLiAdd(tongYong);
		       }
	}
	@Override
	public List<Map> selectGR(String dwmc2) {
		// TODO Auto-generated method stub
		return dao.selectGR(dwmc2);
	}
	@Override
	public void JiShuUp(CeShiList Ceshi) {
		 for (int i = 0; i < Ceshi.getList().size(); i++) {
			 TongYong tongYong=Ceshi.getList().get(i);
			 dao.JiShuUp(tongYong);
			 dao.JiShuAdd(tongYong);
		       }
		
	}
	@Override
	public List<Map> selectJiShu() {
		// TODO Auto-generated method stub
		return dao.selectJiShu();
	}
}
