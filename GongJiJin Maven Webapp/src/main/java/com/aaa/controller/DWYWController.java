package com.aaa.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aaa.entity.Dwzh;
import com.aaa.service.DWYWService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

@Controller
@Scope("prototype")
@RequestMapping("/DWYW")
public class DWYWController {
 @Autowired
 private DWYWService service;
	
 //查询单位账户信息
 
	@RequestMapping("/select")
	@ResponseBody
    public PageInfo<Map> select(@RequestParam("dwmc2") String dwmc2,@RequestParam(required = false, defaultValue = "1") Integer startPage,
            @RequestParam(required = false, defaultValue = "6") Integer PageSize){
    	PageHelper.startPage(startPage,PageSize);
    	List<Map> list=service.select(dwmc2);
    	PageInfo<Map> pi=new PageInfo<Map>(list);
    	System.out.println(list.size());
    	System.out.println(dwmc2);
    	return pi;
    }
	
//根据单位编号查询个人账户的信息	
	@RequestMapping("/selectGR")
	@ResponseBody
	 public List<Map> selectGR(@RequestParam("dwbh") Integer dwbh){
		List<Map> list=service.selectGR(dwbh);
		System.out.println(list.size()+"asdasdas"+dwbh);
		return list;
		}
	//保存汇缴 先保存到单位业务表
	@RequestMapping("/add")
	@ResponseBody
	  public void add(@RequestBody Map map){
		   service.add(map);
		System.out.println(map.get("dwbh"));
	}
}
