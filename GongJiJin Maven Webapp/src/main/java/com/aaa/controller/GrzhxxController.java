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
import org.springframework.web.multipart.MultipartFile;

import com.aaa.service.GrzhxxService;
import com.aaa.util.ExcelUtils;

@Controller
@RequestMapping("/grzhxx")
public class GrzhxxController {
	@Autowired
	private GrzhxxService grzhxxService;
	/*个人开户(添加一条数据)*/
    @RequestMapping("/insertSelective")
    public void insertGrzhxx(@RequestBody Map<String,Object> map,HttpServletResponse response) throws IOException{
    	response.setContentType("text/html;charset=utf-8"); 
    	PrintWriter out=response.getWriter();
    	int i=grzhxxService.insertGrzhxx(map);
    	out.print(i==1?1:0);
    };
    /*使用POI导入Excel进行批量开户*/
    @RequestMapping("/insertByExcel")
	@ResponseBody
	public int importexcel(MultipartFile file){
	    String[][] data;
		try {
			data = ExcelUtils.readexcellByInput(file.getInputStream(), file.getOriginalFilename(), 1);
			int i=grzhxxService.insertMany(data);
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
    /*查询个人缴费信息(缴费用)*/
    @RequestMapping("/selectById")
    @ResponseBody
    public Map<String, Object> selectById(@RequestParam Integer grbh) throws IOException{
    	Map<String, Object> map=grzhxxService.selectById(grbh);
		return map;
    };
    /*条件/模糊查询(根据姓名、单位名称/个人账号)*/
    @ResponseBody
    @RequestMapping("/findByConditions")
    public List<Map<String, Object>> findByConditions(@RequestBody Map<String, Object> map){
    	List<Map<String, Object>> list=grzhxxService.findByConditions(map);
		return list;
    };
    /*查询个人账户基本信息及使用该员工身份证办理的其他公积金账户*/
    @ResponseBody
    @RequestMapping("/findById")
    public List<Map<String, Object>> findById(@RequestParam Integer grbh){
    	List<Map<String, Object>> list=grzhxxService.findById(grbh);
        return list;
    }
    /*查询个人缴费信息(该缴多少)*/
    @RequestMapping("/selectByGrbh")
    @ResponseBody
    public Map<String, Object> selectByGrbh(@RequestParam Integer grbh) throws IOException{
    	Map<String, Object> map=grzhxxService.selectByGrbh(grbh);
		return map;
    };
}