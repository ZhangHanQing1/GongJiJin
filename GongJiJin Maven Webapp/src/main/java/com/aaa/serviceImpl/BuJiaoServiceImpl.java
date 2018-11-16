package com.aaa.serviceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.controller.BuJiaoController;
import com.aaa.dao.DwywmxbMapper;
import com.aaa.dao.GrywmxxxMapper;
import com.aaa.entity.Grywmxxx;
import com.aaa.service.BuJiaoService;
@Service
public class BuJiaoServiceImpl implements BuJiaoService {
	@Autowired
	private DwywmxbMapper daoo;
	@Autowired
	private GrywmxxxMapper daooo;
	@Override
	public int add(String[][] data, Map<String,Object>  map) {
		//修改单位账户金额和缴交日期
				daoo.updateDW(map);
		//添加单位业务表返回主键
		int	i=daoo.add(map);
	    System.out.println(map.get("dwywlsh")+"单位业务流水号 ");
	  //修改个人账户的金额
	  		daoo.uptateGR(map);
	  	//查询出来个人的信息，把单位个人保存到个人明细
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
	  /*		for (String[] strings : data) {
				map.put("GRBH",strings[0]);
				map.put("XINGMING",strings[1]);
				map.put("GRYJCE",strings[2]);
				map.put("DWYJCE",strings[3]);
				map.put("HJ",strings[4]);	
				System.out.println(map.get("GRBH"));
				 Grywmxxx gr=new Grywmxxx();  
			  	  gr.setGrbh((Integer) map.get("GRBH"));
			  	  System.out.println(gr.getGrbh());
			  	  gr.setDwywlsh((Integer)map.get("dwywlsh"));
			  	  System.out.println(gr.getDwywlsh());
			  	  gr.setDwje((BigDecimal)map.get("DWYJCE"));
			  	  gr.setGrje((BigDecimal)map.get("GRYJCE"));
			  	  gr.setFse3((BigDecimal)map.get("HJ"));
			  	  daooo.insertSelective(gr);	
				BigDecimal b=new BigDecimal((char[]) map.get("HJ"));
			  	System.out.println(b);
			  	BigDecimal d=new BigDecimal((char[]) map.get("DWYJCE"));
			  	System.out.println(d);
			  	BigDecimal g=new BigDecimal((char[]) map.get("GRYJCE"));
			  	System.out.println(g);
				Grywmxxx gr=new Grywmxxx();
				gr.setGrbh(Integer.valueOf((String) map.get("GRBH")));
				gr.setDwywlsh((Integer)map.get("dwywlsh"));
				gr.setDwje(d);
				gr.setGrje(g);
			  	  gr.setFse3(b);
			  	
			  	daooo.insertSelective(gr);
			}*/
  return 1;
	}

}
