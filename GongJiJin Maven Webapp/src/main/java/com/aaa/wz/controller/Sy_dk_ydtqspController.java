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
	public List<Map<String, Object>> queryAll(){
		
		List<Map<String, Object>> list=ydtqspservice.queryAll();
		
		
		return list;
	}
   
	@ResponseBody
	@RequestMapping("/queryId")
	public Map queryId(@RequestParam("ydtqspzj") int ydtqspzj){
    	
		
    	Map map=ydtqspservice.queryId(ydtqspzj);
    	//System.out.println(map);
		return map;
}
	@ResponseBody
	@RequestMapping("/gjjzxid")
	public List<Map<String, Object>> gjjzxAll(){
		
		List<Map<String, Object>>  zxzh=gjjzxzhService.gjjzxAll();
		return zxzh;
    		    	
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
		      //System.out.println(ydtqsp.getDkffe()+"id"+ydtqsp.getYdtqspzj());
		     Map<Integer, BigDecimal> mapp = new HashMap<Integer, BigDecimal>();
		     Map<Integer, BigDecimal> mapPrincipal = new HashMap<Integer, BigDecimal>(); 
			  Date date=new Date();
	   		  response.setCharacterEncoding("utf-8");  
	   		  Integer idi=ydtqsp.getYdtqspzj();
	   		   Sy_dk_ydtqsp sy=new Sy_dk_ydtqsp();   		   
	   		      sy.setYdtqspzj(idi);   		      
	   		      sy.setSpzt2("已发放");
	   		      sy.setSpsj(date); 
	   		      sy.setDkffe(ydtqsp.getDkffe());
	   		  //System.out.println(idi);	   		    
	   		    ydtqspservice.update(sy);
	   		    ydtqsp=ydtqspservice.findId(ydtqsp.getYdtqspzj());   		    
	   		    Grzfdkjkhtxx zfdk=grzfdkjkhtxxservice.queayid(ydtqsp.getHtzj());
	   		    Sy_dk_hkjh hkjh=new Sy_dk_hkjh();
	   		    hkjh.setYdtqspzj(idi);
	   		    hkjh.setDkzh(ydtqsp.getDkzh());
	   		    hkjh.setHkrq(ydtqsp.getYdtqrq());
	   		    hkjh.setQic(ydtqsp.getDkqs());
	   		    hkjh.setTzzd2(ydtqsp.getDkffe().toString());
	   		 /**  
			     * 等额本息计算获取还款方式为等额本息的每月偿还利息  
			     *   
			     * 公式：每月偿还利息=贷款本金×月利率×〔(1+月利率)^还款月数-(1+月利率)^(还款月序号-1)〕÷〔(1+月利率)^还款月数-1〕  
			     *           	   		                	   		     
			     */ 
	   		 /*  int totalmonth=ydtqsp.getDkqs().intValue();
	   		   double monthRate =zfdk.getDklx().doubleValue();  
	   		   double zonger=ydtqsp.getDkffe().doubleValue();
	   		   BigDecimal monthInterest;
	   		   for (int i = 1; i < totalmonth + 1; i++) {  
		            BigDecimal multiply =  new BigDecimal(zonger).multiply(new BigDecimal(monthRate));
		            BigDecimal sub  =new BigDecimal( Math.pow(1 +monthRate, totalmonth)).subtract(new BigDecimal(Math.pow(1 + monthRate, i-1)));  
		            monthInterest = multiply.multiply(sub).divide(new BigDecimal(Math.pow(1 + monthRate, totalmonth) - 1), 6, BigDecimal.ROUND_DOWN);  
		            monthInterest = monthInterest.setScale(2, BigDecimal.ROUND_DOWN);  
		            mapp.put(i, monthInterest);
		            System.out.println(mapp);
		        }  	*/
	   		   
	   		/**
	   		 *   
		     * 等额本息计算获取还款方式为等额本息的每月偿还本金  
		     *   
             */
	   		  /* double yearRate=monthRate*12;
	           BigDecimal monthIncome = ydtqsp.getDkffe()
	        		   .multiply(new BigDecimal(monthRate * Math.pow(1 + monthRate, totalmonth)))
	        		   .divide(new BigDecimal(Math.pow(1 + monthRate, totalmonth) - 1), 2, BigDecimal.ROUND_DOWN);    
	              
	              
	           Map<Integer, BigDecimal>  mapInterest =Map<Integer, BigDecimal>	     			      
	       for (Map.Entry<Integer, BigDecimal> entry : mapInterest.entrySet()) {  
	          mapPrincipal.put(entry.getKey(), monthIncome.subtract(entry.getValue()));  
	      }  */

	   		   
	   		   
	   		   
	   		/*for (int i = 1; i < totalmonth + 1; i++) {  
	            
	            mapp.get(i);
	            System.out.println(i);
	        }  	*/
	   		
	   		    BigDecimal yhje=ydtqsp.getDkffe().divide(ydtqsp.getDkqs(), 2, BigDecimal.ROUND_HALF_UP);   		   		  
				hkjh.setYhlx(yhje);	 
				BigDecimal result=yhje.multiply(zfdk.getDklx()); 
				hkjh.setYhbj(result);  	   		    	   		       	   		    	   		    				 				
	   		   // System.out.println(result);	   		   
	   		    hkjh.setZtz("待还清");  		    
	   		    hkjhservice.add(hkjh);
	   	}
	    @ResponseBody
		@RequestMapping("/hkjhall")
		public List<Map<String, Object>> hkjhAll(){
			
			List<Map<String, Object>> list=hkjhservice.hkjkAll();						
			return list;
			} 
	    
        
}