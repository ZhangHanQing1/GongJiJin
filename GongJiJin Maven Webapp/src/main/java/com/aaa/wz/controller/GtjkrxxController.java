package com.aaa.wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.aaa.entity.Gtjkrxx;
import com.aaa.wz.service.GtjkrxxService;

@Controller
@RequestMapping("/Gtjkr")
public class GtjkrxxController {

	@Autowired
	private GtjkrxxService gtjkrxxService;
	
	@ResponseBody
	@RequestMapping("/queryId")
	public Gtjkrxx queryId(@RequestParam("gtjkr") Integer gtjkr){
    	
		Gtjkrxx g=gtjkrxxService.queryId(gtjkr);
				
		return g;
	
	
}
}