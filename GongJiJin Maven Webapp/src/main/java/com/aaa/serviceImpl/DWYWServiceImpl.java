package com.aaa.serviceImpl;

import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public void add(Map map) {
		//修改单位账户金额和缴交日期
		daoo.updateDW(map);
		//添加单位业务表返回主键
		daoo.add(map);
		System.out.println(map.get("dwywlsh")+"asdasdasdasdasda");
		//修改个人账户的金额
		daoo.uptateGR(map);
		//查询出来个人的信息，把单位个人保存到个人明细
		List<Map> list=daoo.selectG(map);
		  for (Map map2 : list) {
		  	  BigDecimal DWYJCE=(BigDecimal) map2.get("DWYJCE");
		  	  BigDecimal GRYJCE=(BigDecimal) map2.get("GRYJCE");
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
	@Override
	public Map selectSC(Integer dwbh) {
		// TODO Auto-generated method stub
		return daoo.selectSC(dwbh);
	}
	@Override
	public List<Map> selectHui(String dwmc2) {
		// TODO Auto-generated method stub
		return daoo.selectHui(dwmc2);
	}
	@Override
	public List<Map> selectGRM(Integer DWYWLSH) {
		// TODO Auto-generated method stub
		return daoo.selectGRM(DWYWLSH);
	}

}
