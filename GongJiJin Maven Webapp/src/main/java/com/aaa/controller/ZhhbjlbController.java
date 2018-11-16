package com.aaa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.service.ZhhbjlbService;

@Controller
@RequestMapping("/zhhbjlb")
public class ZhhbjlbController {
    @Autowired
    private ZhhbjlbService service;
	/*提交账户合并申请*/
    @ResponseBody
    @RequestMapping("/insertZhhbjlb")
    public int insertGrzhxx(@RequestParam Integer blgrzh,@RequestParam Integer xhgrzh){
    	Map<String,Object> map=new HashMap<String, Object>();
    	map.put("blgrzh", blgrzh);
    	map.put("xhgrzh", xhgrzh);
    	int i=service.insertZhhbjlb(map);
    	return i;
    };
    /*查询所有账户合并申请*/
    @ResponseBody
    @RequestMapping("/findByConditions")
    public List<Map<String,Object>> findByConditions(@RequestBody(required=false) Map<String,Object> map){
    	List<Map<String,Object>> list=service.findByConditions(map);
		return list;
    }
    /*通过账户合并审批*/
    @ResponseBody
    @RequestMapping("/confirmZhhbjlb")
    public int confirmZhhbjlb(Integer jlbh){
    	return service.confirmZhhbjlb(jlbh);
    }
}
