package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Sy_gj_tqspb;
import com.aaa.service.DwzhService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class DwzhController {
	@Autowired
	private DwzhService ds;
	@ResponseBody
	@RequestMapping("/Dwzh1")
	public double Dwzh1(String date1,String date2,String date3){
		date1=""+date3+"-01-01";
		date2=""+date3+"-01-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh2")
	public double Dwzh2(String date1,String date2,String date3){
		date1=""+date3+"-02-01";
		date2=""+date3+"-02-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh3")
	public double Dwzh3(String date1,String date2,String date3){
		date1=""+date3+"-03-01";
		date2=""+date3+"-03-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh4")
	public double Dwzh4(String date1,String date2,String date3){
		date1=""+date3+"-04-01";
		date2=""+date3+"-04-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh5")
	public double Dwzh5(String date1,String date2,String date3){
		date1=""+date3+"-05-01";
		date2=""+date3+"-05-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh6")
	public double Dwzh6(String date1,String date2,String date3){
		date1=""+date3+"-06-01";
		date2=""+date3+"-06-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh7")
	public double Dwzh7(String date1,String date2,String date3){
		date1=""+date3+"-07-01";
		date2=""+date3+"-07-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh8")
	public double Dwzh8(String date1,String date2,String date3){
		date1=""+date3+"-08-01";
		date2=""+date3+"-08-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh9")
	public double Dwzh9(String date1,String date2,String date3){
		date1=""+date3+"-09-01";
		date2=""+date3+"-09-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh10")
	public double Dwzh10(String date1,String date2,String date3){
		date1=""+date3+"-10-01";
		date2=""+date3+"-10-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh11")
	public double Dwzh11(String date1,String date2,String date3){
		date1=""+date3+"-11-01";
		date2=""+date3+"-11-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzh12")
	public double Dwzh12(String date1,String date2,String date3){
		date1=""+date3+"-12-01";
		date2=""+date3+"-12-31";
		double num=ds.showDwzh(date1, date2);
		System.out.println(num);
		return num;	
	}
	
	@ResponseBody
	@RequestMapping("/Dwzhs1")
	public int Dwzhs1(String date1,String date2,String date3){
		date1=""+date3+"-01-01";
		date2=""+date3+"-01-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs2")
	public int Dwzhs2(String date1,String date2,String date3){
		date1=""+date3+"-02-01";
		date2=""+date3+"-02-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs3")
	public int Dwzhs3(String date1,String date2,String date3){
		date1=""+date3+"-3-01";
		date2=""+date3+"-03-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs4")
	public int Dwzhs4(String date1,String date2,String date3){
		date1=""+date3+"-04-01";
		date2=""+date3+"-04-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs5")
	public int Dwzhs5(String date1,String date2,String date3){
		date1=""+date3+"-05-01";
		date2=""+date3+"-05-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs6")
	public int Dwzhs6(String date1,String date2,String date3){
		date1=""+date3+"-06-01";
		date2=""+date3+"-06-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs7")
	public int Dwzhs7(String date1,String date2,String date3){
		date1=""+date3+"-07-01";
		date2=""+date3+"-07-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs8")
	public int Dwzhs8(String date1,String date2,String date3){
		date1=""+date3+"-08-01";
		date2=""+date3+"-08-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs9")
	public int Dwzhs9(String date1,String date2,String date3){
		date1=""+date3+"-09-01";
		date2=""+date3+"-09-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs10")
	public int Dwzhs10(String date1,String date2,String date3){
		date1=""+date3+"-10-01";
		date2=""+date3+"-10-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs11")
	public int Dwzhs11(String date1,String date2,String date3){
		date1=""+date3+"-11-01";
		date2=""+date3+"-11-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/Dwzhs12")
	public int Dwzhs12(String date1,String date2,String date3){
		date1=""+date3+"-12-01";
		date2=""+date3+"-12-31";
		int num=ds.showDwzh1(date1, date2);
		System.out.println(num);
		return num;	
	}
	//------------------------------------------------------------------------------------------------------------------------
	@ResponseBody
	@RequestMapping("/grtq1")
	public double gedk1(String date1,String date2,String date3){
		date1=""+date3+"-01-01";
		date2=""+date3+"-01-31";
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq2")
	public double gedk2(String date1,String date2,String date3){
		date1=""+date3+"-02-01";
		date2=""+date3+"-02-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq3")
	public double gedk3(String date1,String date2,String date3){
		date1=""+date3+"-03-01";
		date2=""+date3+"-03-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq4")
	public double gedk4(String date1,String date2,String date3){
		date1=""+date3+"-04-01";
		date2=""+date3+"-04-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq5")
	public double gedk5(String date1,String date2,String date3){
		date1=""+date3+"-05-01";
		date2=""+date3+"-05-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq6")
	public double gedk6(String date1,String date2,String date3){
		date1=""+date3+"-06-01";
		date2=""+date3+"-06-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq7")
	public double gedk7(String date1,String date2,String date3){
		date1=""+date3+"-07-01";
		date2=""+date3+"-07-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq8")
	public double gedk8(String date1,String date2,String date3){
		date1=""+date3+"-08-01";
		date2=""+date3+"-08-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq9")
	public double gedk9(String date1,String date2,String date3){
		date1=""+date3+"-09-01";
		date2=""+date3+"-09-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq10")
	public double gedk10(String date1,String date2,String date3){
		date1=""+date3+"-10-01";
		date2=""+date3+"-10-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq11")
	public double gedk11(String date1,String date2,String date3){
		date1=""+date3+"-11-01";
		date2=""+date3+"-11-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtq12")
	public double gedk12(String date1,String date2,String date3){
		date1=""+date3+"-12-01";
		date2=""+date3+"-12-31";
		System.out.println(date1);
		double num=ds.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs1")
	public int gedks1(String date1,String date2,String date3){
		date1=""+date3+"-01-01";
		date2=""+date3+"-01-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs2")
	public int gedks2(String date1,String date2,String date3){
		date1=""+date3+"-02-01";
		date2=""+date3+"-02-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs3")
	public int gedks3(String date1,String date2,String date3){
		date1=""+date3+"-03-01";
		date2=""+date3+"-03-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs4")
	public int gedks4(String date1,String date2,String date3){
		date1=""+date3+"-04-01";
		date2=""+date3+"-04-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs5")
	public int gedks5(String date1,String date2,String date3){
		date1=""+date3+"-05-01";
		date2=""+date3+"-05-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs6")
	public int gedks6(String date1,String date2,String date3){
		date1=""+date3+"-06-01";
		date2=""+date3+"-06-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs7")
	public int gedks7(String date1,String date2,String date3){
		date1=""+date3+"-07-01";
		date2=""+date3+"-07-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs8")
	public int gedks8(String date1,String date2,String date3){
		date1=""+date3+"-08-01";
		date2=""+date3+"-08-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs9")
	public int gedks9(String date1,String date2,String date3){
		date1=""+date3+"-09-01";
		date2=""+date3+"-09-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs10")
	public int gedks10(String date1,String date2,String date3){
		date1=""+date3+"-10-01";
		date2=""+date3+"-10-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs11")
	public int gedks11(String date1,String date2,String date3){
		date1=""+date3+"-11-01";
		date2=""+date3+"-11-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs12")
	public int gedks12(String date1,String date2,String date3){
		date1=""+date3+"-12-01";
		date2=""+date3+"-12-31";
		int num=ds.showGedk1(date1, date2);
		return num;	
	}
	//---------------------------------------------------------------------------------------------
	@ResponseBody
	@RequestMapping("/DwzhJiaoCun1")
	public double DwzhJiaoCun1(String date1,String date2,String dwmc2){
		double num=ds.showJiaoCun1(date1, date2,dwmc2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/DwzhJiaoCun2")
	public int DwzhJiaoCun2(String date1,String date2,String dwmc2){
		int num=ds.showJiaoCun11(date1, date2,dwmc2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/DwzhJiaoCun")
	public PageInfo<Map<String, Object>> DwzhJiaoCun(String date1,String date2,String dwmc2,Integer startPage){
		PageHelper.startPage(startPage, 3);
		List<Map<String, Object>> list=ds.showJiaoCun(date1, date2,dwmc2);
		PageInfo<Map<String, Object>> p1=new PageInfo<Map<String,Object>>(list);
		return p1;	
	}
	//------------------------------------------------------------------------------------------------------------------------
	@ResponseBody
	@RequestMapping("/grtq111")
	public double gedk111(String date1,String date2,String tqlx,String spzt2){
		double num=ds.showGedk11(date1, date2,tqlx,spzt2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grtqs111")
	public int gedks111(String date1,String date2,String tqlx,String spzt2){
		int num=ds.showGedk111(date1, date2,tqlx,spzt2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/showGeTq")
	public PageInfo<Map<String, Object>> showGeTq(String date1,String date2,String tqlx,String spzt2,Integer startPage){
		PageHelper.startPage(startPage, 3);
		List<Map<String, Object>> list=ds.showGeTq(date1, date2,tqlx,spzt2);
		PageInfo<Map<String, Object>> p1=new PageInfo<Map<String,Object>>(list);
		return p1;	
	}
}
