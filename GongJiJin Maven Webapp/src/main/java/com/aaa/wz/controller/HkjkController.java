package com.aaa.wz.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Sy_dk_hkjh;
import com.aaa.wz.service.Sy_dk_hkjhService;

@Controller
@RequestMapping("/hkjh")
public class HkjkController {
      
	
	   @Autowired
	   private Sy_dk_hkjhService sy_dk_hkjhService;
	   
	    @ResponseBody
		@RequestMapping("/hkjhIdd")
		public Map hkjhIdd(@RequestParam("ydtqspzj") int ydtqspzj){
	    	
			
	    	Map map=sy_dk_hkjhService.hkjhIdd(ydtqspzj);
	    	//System.out.println(map);
			return map;
	}
}
