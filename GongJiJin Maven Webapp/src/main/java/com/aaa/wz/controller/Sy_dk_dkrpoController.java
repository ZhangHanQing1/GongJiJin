package com.aaa.wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Sy_dk_dkrpo;
import com.aaa.wz.service.Sy_dk_dkrpoService;



@Controller
@RequestMapping("/dkrpo")
public class Sy_dk_dkrpoController {

	@Autowired
	private Sy_dk_dkrpoService  dk_dkrpoService;
	
	@ResponseBody
	@RequestMapping("/queryId")
	public Sy_dk_dkrpo queryId(@RequestParam("dkrpo") Integer dkrpo){
    	
		Sy_dk_dkrpo d=dk_dkrpoService.queryId(dkrpo);
				
		return d;
	
	
}
}