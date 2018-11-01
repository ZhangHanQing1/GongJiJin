package com.aaa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.service.BiLiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@Scope("prototype")
@RequestMapping("/BiLi")
public class BiLiController {
@Resource
 private BiLiService service;
	
	 //±ÈÀý¼ÇÂ¼²éÑ¯
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
}
