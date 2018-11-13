package com.aaa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aaa.util.ExcelUtils;

@Controller
@Scope("prototype")
@RequestMapping("/BuJiao")
public class BuJiaoController {

    /*使用POI导入Excel*/
	@RequestMapping("/importexcel")
	@ResponseBody
	public Map<String,Object> importexcel(MultipartFile file,@RequestParam Map mapp){
		 System.out.println(mapp.get("hbcjny"));
		Map<String,Object> map = new HashMap<String, Object>();
		try {
			//用工具类
			String[][] data = ExcelUtils.readexcellByInput(file.getInputStream(), file.getOriginalFilename(), 3);
			for (String[] strings : data) {
				String x="";
				for (String string : strings) {
					x+=string;
				}
				System.out.println(x);
			}
			//吧data赋值给个人明细
			
			map.put("success", true);
		}catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
			map.put("errmsg", e.getMessage());
		}
		return map;
	}
}
