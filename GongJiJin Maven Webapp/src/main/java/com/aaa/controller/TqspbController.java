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
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.service.TqspbService;

@Controller
@RequestMapping("/tqspb")
public class TqspbController {
	@Autowired
	private TqspbService service;
	/*新增一条公积金提取申请*/
    @RequestMapping("/insertTqspb")
    public void insertTqsp(@RequestBody Map<String,Object> map,HttpServletResponse response) throws IOException{
    	PrintWriter out=response.getWriter();
    	int i=service.insertSelective(map);
    	out.print(i);
    }
    /*修改公积金提取申请状态为已通过*/
    @RequestMapping("passTqspb")
    public void passTqspb(Integer tqbh,HttpServletResponse response) throws IOException{
    	PrintWriter out=response.getWriter();
    	int i=service.updateByPrimaryKeySelective(tqbh);
    	out.print(i);
    }
    /*查询所有的公积金提取申请*/
    @ResponseBody
    @RequestMapping("selectTqspb")
    public List<Map<String, Object>> selectTqspb(){
    	List<Map<String, Object>> list=service.selectTqspb();
		return list;
    }
}
