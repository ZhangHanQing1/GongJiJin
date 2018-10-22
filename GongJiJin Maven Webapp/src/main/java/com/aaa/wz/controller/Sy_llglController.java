package com.aaa.wz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.entity.SyLlgl;
import com.aaa.wz.service.Sy_llglService;

@Controller
@RequestMapping("/sy_llgl")
public class Sy_llglController {
	
       @Autowired
	   private Sy_llglService sy_llglService;  
       
       
          @RequestMapping("/insert")
         public String insert(SyLlgl record,Map map){
        	 
        	 sy_llglService.insert(record);
        	 map.put("record", map);
			 return "list";
        	 	 
         }
       
} 
