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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("select")
    public PageInfo<Map> select(@RequestParam int grzh,@RequestParam(required = false, defaultValue = "1") Integer startPage,
            @RequestParam(required = false, defaultValue = "2") Integer PageSize){
    	PageHelper.startPage(startPage,PageSize);
    	List<Map> list=service.select();
    	PageInfo<Map> pi=new PageInfo<Map>(list);
    	return pi;
    }
}
