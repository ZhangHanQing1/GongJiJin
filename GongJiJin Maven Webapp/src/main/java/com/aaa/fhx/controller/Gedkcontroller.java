package com.aaa.fhx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.fhx.service.GedkService;

@Controller
public class Gedkcontroller {
	@Autowired
	private GedkService gs;
	@ResponseBody
	@RequestMapping("/grdk1")
	public double gedk1(String date1,String date2,String date3){
		date1=""+date3+"-01-01";
		date2=""+date3+"-01-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk2")
	public double gedk2(String date1,String date2,String date3){
		date1=""+date3+"-02-01";
		date2=""+date3+"-02-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk3")
	public double gedk3(String date1,String date2,String date3){
		date1=""+date3+"-03-01";
		date2=""+date3+"-03-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk4")
	public double gedk4(String date1,String date2,String date3){
		date1=""+date3+"-04-01";
		date2=""+date3+"-04-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk5")
	public double gedk5(String date1,String date2,String date3){
		date1=""+date3+"-05-01";
		date2=""+date3+"-05-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk6")
	public double gedk6(String date1,String date2,String date3){
		date1=""+date3+"-06-01";
		date2=""+date3+"-06-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk7")
	public double gedk7(String date1,String date2,String date3){
		date1=""+date3+"-07-01";
		date2=""+date3+"-07-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk8")
	public double gedk8(String date1,String date2,String date3){
		date1=""+date3+"-08-01";
		date2=""+date3+"-08-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk9")
	public double gedk9(String date1,String date2,String date3){
		date1=""+date3+"-09-01";
		date2=""+date3+"-09-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk10")
	public double gedk10(String date1,String date2,String date3){
		date1=""+date3+"-10-01";
		date2=""+date3+"-10-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk11")
	public double gedk11(String date1,String date2,String date3){
		date1=""+date3+"-11-01";
		date2=""+date3+"-11-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdk12")
	public double gedk12(String date1,String date2,String date3){
		date1=""+date3+"-12-01";
		date2=""+date3+"-12-31";
		System.out.println(date1);
		double num=gs.showGedk(date1, date2);
		System.out.println(num);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks1")
	public int gedks1(String date1,String date2,String date3){
		date1=""+date3+"-01-01";
		date2=""+date3+"-01-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks2")
	public int gedks2(String date1,String date2,String date3){
		date1=""+date3+"-02-01";
		date2=""+date3+"-02-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks3")
	public int gedks3(String date1,String date2,String date3){
		date1=""+date3+"-03-01";
		date2=""+date3+"-03-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks4")
	public int gedks4(String date1,String date2,String date3){
		date1=""+date3+"-04-01";
		date2=""+date3+"-04-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks5")
	public int gedks5(String date1,String date2,String date3){
		date1=""+date3+"-05-01";
		date2=""+date3+"-05-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks6")
	public int gedks6(String date1,String date2,String date3){
		date1=""+date3+"-06-01";
		date2=""+date3+"-06-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks7")
	public int gedks7(String date1,String date2,String date3){
		date1=""+date3+"-07-01";
		date2=""+date3+"-07-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks8")
	public int gedks8(String date1,String date2,String date3){
		date1=""+date3+"-08-01";
		date2=""+date3+"-08-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks9")
	public int gedks9(String date1,String date2,String date3){
		date1=""+date3+"-09-01";
		date2=""+date3+"-09-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks10")
	public int gedks10(String date1,String date2,String date3){
		date1=""+date3+"-10-01";
		date2=""+date3+"-10-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks11")
	public int gedks11(String date1,String date2,String date3){
		date1=""+date3+"-11-01";
		date2=""+date3+"-11-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
	@ResponseBody
	@RequestMapping("/grdks12")
	public int gedks12(String date1,String date2,String date3){
		date1=""+date3+"-12-01";
		date2=""+date3+"-12-31";
		int num=gs.showGedk1(date1, date2);
		return num;	
	}
}
