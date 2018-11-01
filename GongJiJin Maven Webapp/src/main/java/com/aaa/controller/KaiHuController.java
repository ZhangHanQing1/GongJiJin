package com.aaa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.CeShiList;
import com.aaa.entity.Dwzh;
import com.aaa.entity.TongYong;
import com.aaa.service.KaiHuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@Scope("prototype")
@RequestMapping("/KaiHu")
public class KaiHuController {
	@Resource
	private KaiHuService service;
	
	//单位账户信息添加
   @RequestMapping("/add")
	public void add(@RequestBody Dwzh dwzh,HttpServletResponse response){
	   response.setCharacterEncoding("utf-8");
	   try {
		   service.add(dwzh);
		PrintWriter  out=response.getWriter();
		out.print("开户成功");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
  
  //单位账户信息查询
   @RequestMapping("/select")
   @ResponseBody
   public Map select(Integer page,Integer limit){
		   PageHelper.startPage(page,limit);
		   List<Map> list=service.select();
		   System.out.println(list.size());
	 PageInfo<Map> info=new PageInfo<Map>(list);
	 Map map=new HashMap();
	 map.put("code", 0);
  map.put("msg", "");
  map.put("count",info.getTotal());
  map.put("data", info.getList());
	return map;
   }
   
   //单位比例修改前查询
   @RequestMapping("/selectId")
   @ResponseBody
   public List<Map> selectId(@RequestParam ("dwmc2") String dwmc2){
	   System.out.println(dwmc2);
	  List<Map> list=service.selectId(dwmc2);
	  System.out.println(list);
	return list;
	   
   }
   //单位比例修改并保存到记录表
   @RequestMapping("/BiLiUp")
   public void BiLiUp(CeShiList Ceshi ){
             service.BiLiUp(Ceshi);
   }
//   个人基数修改前查询
   @RequestMapping("/selectGR")
   @ResponseBody
   public List<Map>selectGR(@RequestParam("dwmc2") String dwmc2){
	   List<Map> list=service.selectGR(dwmc2);
	   System.out.println(list.size());
	   return list;
   }
//   个人基数修改并保存到记录表
   @RequestMapping("/JiShuUp")
   public void JiShuUp(CeShiList Ceshi ){
	   service.JiShuUp(Ceshi);
             System.out.println(Ceshi.getList().get(0).getGrbh());
   }
   
   //个人基数记录查询
   @RequestMapping("/selectJiShu")
   @ResponseBody
   public Map selectJiShu(Integer page,Integer limit){
	   PageHelper.startPage(page,limit);
	   List<Map> list=service.selectJiShu();
	   System.out.println(list.size());
		 PageInfo<Map> info=new PageInfo<Map>(list);
		 Map map=new HashMap();
		 map.put("code", 0);
		map.put("msg", "");
		map.put("count",info.getTotal());
		map.put("data", info.getList());
		return map;
}
}
