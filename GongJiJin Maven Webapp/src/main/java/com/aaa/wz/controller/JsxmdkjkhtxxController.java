package com.aaa.wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.wz.service.JsxmdkjkhtxxService;

@Controller
@RequestMapping("/jsxmdkjkhtxx")
public class JsxmdkjkhtxxController  {
         @Autowired
	     private JsxmdkjkhtxxService jsxmdkjkhtxxService;
	
	
}
