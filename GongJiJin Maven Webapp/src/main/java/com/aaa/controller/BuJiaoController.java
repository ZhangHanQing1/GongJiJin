package com.aaa.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aaa.service.BuJiaoService;
import com.aaa.util.ExcelUtils;

@Controller
@Scope("prototype")
@RequestMapping("/BuJiao")
public class BuJiaoController {
@Autowired
private BuJiaoService service;
    /*使用POI导入Excel并把Excel数据返回到前台*/
	@RequestMapping("/importexcel")
	@ResponseBody
	public List<Map> importexcel(MultipartFile file,@RequestParam Map mapp){
		 System.out.println(mapp.get("hbcjny"));
		
		try {
			
		
			//用工具类
			String[][] data = ExcelUtils.readexcellByInput(file.getInputStream(), file.getOriginalFilename(), 3);
			/*for (String[] strings : data) {
				String x="";
				for (String string : strings) {
					x+=string;
				}
				System.out.println(x);
			}*/List<Map> list=new ArrayList<Map>();
			
			for (String[] strings : data) {
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("GRBH",strings[0]);
				map.put("XINGMING",strings[1]);
				map.put("GRYJCE",strings[2]);
				map.put("DWYJCE",strings[3]);
				map.put("HJ",strings[4]);
				list.add(map);
				
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		//吧data赋值给个人明细
		
	
	
		/*	map.put("success", true);
		}catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
			map.put("errmsg", e.getMessage());
		}*/
	
	}
	//保存补缴
	@RequestMapping("/add")
	@ResponseBody
	public int add(MultipartFile file,@RequestParam Map<String,Object> map){
		 System.out.println(map.get("hbcjny"));
		
		try {
			//用工具类
			String[][] data = ExcelUtils.readexcellByInput(file.getInputStream(), file.getOriginalFilename(), 3);
			/*for (String[] strings : data) {
				String x="";
				for (String string : strings) {
					x+=string;
				}
				System.out.println(x);
			}*/
			
			for (String[] strings : data) {
				map.put("GRBH",strings[0]);
				map.put("XINGMING",strings[1]);
				map.put("GRYJCE",strings[2]);
				map.put("DWYJCE",strings[3]);
				map.put("HJ",strings[4]);	
				System.out.println(map.get("GRBH"));
			   
			}
			int i=service.add(data, map);
		    return i; 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	return 0;
	}
	}
		

