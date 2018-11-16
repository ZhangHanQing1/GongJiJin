package com.aaa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Grywmxxx;
import com.aaa.service.GrywmxxxService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/Gryw")
public class GrywController {
    @Autowired
    private GrywmxxxService service;
    /*个人缴费*/
    @RequestMapping("insertGryw")
    public void insertGryw(@RequestBody Map<String, Object> map,HttpServletResponse response) throws IOException{
    	response.setContentType("text/html;charset=utf-8"); 
    	PrintWriter out=response.getWriter();
    	int i=service.insertSelective(map);
    	out.print(i==1?1:0);
    }
    /*查询个人缴费历史记录*/
    @ResponseBody
    @RequestMapping("selectById")
    public PageInfo<Grywmxxx> selectById(@RequestParam int grzh,@RequestParam(required = false, defaultValue = "1") Integer startPage,
            @RequestParam(required = false, defaultValue = "2") Integer PageSize){
    	PageHelper.startPage(startPage,PageSize);
    	List<Grywmxxx> list=service.selectById(grzh);
    	PageInfo<Grywmxxx> pi=new PageInfo<Grywmxxx>(list);
    	return pi;
    }
}
