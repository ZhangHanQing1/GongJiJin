package com.aaa.wz.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Grzhxx;
import com.aaa.wz.service.GrzhxService;

@Controller
@RequestMapping("/zhxx")
public class GrzhxController {
	
	   @Autowired
	   private  GrzhxService  grzhxxService;
	   
	    @ResponseBody
		@RequestMapping("/queryId")
		public Grzhxx queryId(@RequestParam("grbh") Integer grbh){
	    	System.out.println(grbh);
			Grzhxx g=grzhxxService.queryId(grbh);
					
			return g;

}
}
