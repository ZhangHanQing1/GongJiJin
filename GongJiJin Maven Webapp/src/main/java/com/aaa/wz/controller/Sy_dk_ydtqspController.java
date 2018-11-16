package com.aaa.wz.controller;


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Gjjzxzh;
import com.aaa.entity.Grzfdkjkhtxx;
import com.aaa.entity.Sy_dk_hkjh;
import com.aaa.entity.Sy_dk_ydtqsp;
import com.aaa.wz.service.GjjzxzhService;
import com.aaa.wz.service.GrzfdkjkhtxxService;
import com.aaa.wz.service.Sy_dk_hkjhService;
import com.aaa.wz.service.Sy_dk_ydtqspService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.sf.jsqlparser.expression.DoubleValue;

@Controller
@RequestMapping("/ydtqsp")
public class Sy_dk_ydtqspController {
	
	   @Autowired
	   private Sy_dk_ydtqspService ydtqspservice;
	   @Autowired
	   private Sy_dk_hkjhService hkjhservice;
	   @Autowired
	   private GrzfdkjkhtxxService grzfdkjkhtxxservice;
	   @Autowired
	   private GjjzxzhService gjjzxzhService;
	  	     	   
		@ResponseBody
		@RequestMapping("/all")
		public PageInfo<Map<String, Object>> queryAll(Integer startPage){
			PageHelper.startPage(startPage, 3);
			List<Map<String, Object>> list=ydtqspservice.queryAll();
			PageInfo<Map<String, Object>> p1=new PageInfo<Map<String,Object>>(list);
			return p1;
		}
	   
		@ResponseBody
		@RequestMapping("/queryId")
		public Map queryId(@RequestParam("ydtqspzj") int ydtqspzj){
	    	
			
	    	Map map=ydtqspservice.queryId(ydtqspzj);
	    	
			return map;
	}
		@ResponseBody
		@RequestMapping("/gjjzxid")
		public List<Map<String, Object>> gjjzxAll(){
			
			List<Map<String, Object>>  zxzh=gjjzxzhService.gjjzxAll();
			return zxzh;
	    		    	
	} 
		@RequestMapping("/update9")
	  public void update9(Gjjzxzh gjjzxzh,HttpServletResponse response){
		      
			Integer ide=gjjzxzh.getZhid();
			Gjjzxzh zx=new Gjjzxzh();
			zx.setZhid(ide);
			zx.setGjjzxye(gjjzxzh.getGjjzxye());
			gjjzxzhService.update(zx);
		   	  
	  }	 
		
		
		 @RequestMapping("/update")
	   	public void update(Sy_dk_ydtqsp ydtqsp,HttpServletResponse response) {		      
			  Date date=new Date();
	   		  response.setCharacterEncoding("utf-8");  
	   		  Integer idi=ydtqsp.getYdtqspzj();
	   		   Sy_dk_ydtqsp sy=new Sy_dk_ydtqsp();   		   
	   		      sy.setYdtqspzj(idi);   		      
	   		      sy.setSpzt2("已初审");
	   		      sy.setSpsj(date);   		     
	   		    ydtqspservice.update(sy);
	   		    
	   	}
		 @RequestMapping("/update6")
		   	public void update6(Sy_dk_ydtqsp ydtqsp,HttpServletResponse response) {		      
				  Date date=new Date();
		   		  response.setCharacterEncoding("utf-8");  
		   		  Integer idi=ydtqsp.getYdtqspzj();
		   		   Sy_dk_ydtqsp sy=new Sy_dk_ydtqsp();   		   
		   		      sy.setYdtqspzj(idi);   		      
		   		      sy.setSpzt2("待审批");
		   		      sy.setSpsj(date);   		     
		   		    ydtqspservice.update(sy);
		   		    
		   	}
		 
		 @RequestMapping("/update2")
		   	public void update2(Sy_dk_ydtqsp ydtqsp,HttpServletResponse response) {		      
				  Date date=new Date();
		   		  response.setCharacterEncoding("utf-8");  
		   		  Integer idi=ydtqsp.getYdtqspzj();
		   		   Sy_dk_ydtqsp sy=new Sy_dk_ydtqsp();   		   
		   		      sy.setYdtqspzj(idi);   		      
		   		      sy.setSpzt2("未通过");
		   		      sy.setSpsj(date);   		     
		   		    ydtqspservice.update(sy);
		 }
		 @RequestMapping("/update4")
		   	public void update4(Sy_dk_ydtqsp ydtqsp,HttpServletResponse response) {		      
				  Date date=new Date();
		   		  response.setCharacterEncoding("utf-8");  
		   		  Integer idi=ydtqsp.getYdtqspzj();
		   		   Sy_dk_ydtqsp sy=new Sy_dk_ydtqsp();   		   
		   		      sy.setYdtqspzj(idi);   		      
		   		      sy.setSpzt2("已终审");
		   		      sy.setSpsj(date);   		     
		   		    ydtqspservice.update(sy);
		   		    
		   	}
		 	
		    @RequestMapping("/update3")
		   	public void update3(Sy_dk_ydtqsp ydtqsp,HttpServletResponse response) {		 


				  Date date=new Date();
		   		  response.setCharacterEncoding("utf-8");  
		   		  Integer idi=ydtqsp.getYdtqspzj();
		   		   Sy_dk_ydtqsp sy=new Sy_dk_ydtqsp();   		   
		   		      sy.setYdtqspzj(idi);   		      
		   		      sy.setSpzt2("已发放");
		   		      sy.setSpsj(date); 
		   		      sy.setDkffe(ydtqsp.getDkffe());
		   		    ydtqspservice.update(sy);
		   		    ydtqsp=ydtqspservice.findId(ydtqsp.getYdtqspzj());   		    	   		    
		   		    Sy_dk_hkjh hkjh=new Sy_dk_hkjh();
		   		    hkjh.setYdtqspzj(idi);
		   		    hkjh.setDkzh(ydtqsp.getDkzh());
		   		    hkjh.setHkrq(ydtqsp.getYdtqrq());
		   		    hkjh.setQic(ydtqsp.getDkqs());
		   		    hkjh.setTzzd2(ydtqsp.getDkffe().toString());		   
		   		    hkjh.setZtz("待还清");  		    
		   		    hkjhservice.add(hkjh);

		   		    
		   	}
		    @RequestMapping("/update10")
		   	public void update10(Sy_dk_hkjh hkjh,HttpServletResponse response) {		      			 
		   		  response.setCharacterEncoding("utf-8");  
		   		  Integer idq=hkjh.getHkjhzj();
		   		   Sy_dk_hkjh sy=new Sy_dk_hkjh();   		   
		   		      sy.setHkjhzj(idq);		      
		   		      sy.setZtz("已还清");	   		        		     
		   		    hkjhservice.update(sy);
		   		    
		   	}
		    @ResponseBody
			@RequestMapping("/hkjhall")
			public List<Map<String, Object>> hkjhAll(){
				
				List<Map<String, Object>> list=hkjhservice.hkjkAll();						
				return list;
				} 
        
}