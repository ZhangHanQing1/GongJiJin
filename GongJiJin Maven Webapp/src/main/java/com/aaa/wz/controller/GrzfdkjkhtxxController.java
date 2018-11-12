package com.aaa.wz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.entity.Dbxx;
import com.aaa.entity.Grzfdkjkhtxx;
import com.aaa.entity.Gtjkrxx;
import com.aaa.entity.Sy_dk_dkrpo;
import com.aaa.entity.Sy_dk_dyxx;
import com.aaa.entity.Sy_dk_ydtqsp;
import com.aaa.wz.service.GrzfdkjkhtxxService;
import com.aaa.wz.service.GtjkrxxService;
import com.aaa.wz.service.Sy_dk_dkrpoService;
import com.aaa.wz.service.Sy_dk_dyxxService;
import com.aaa.wz.service.Sy_dk_ydtqspService;
import com.aaa.wz.service.dbxxService;

@Controller
@RequestMapping("/htxx")
public class GrzfdkjkhtxxController {
	  
	    @Autowired
	    private GrzfdkjkhtxxService  grzfdkjkhtxxService;
	    @Autowired
	    private Sy_dk_ydtqspService  ydtqspService;
	    @Autowired
	    private GtjkrxxService gtjkrxxService;
	    @Autowired
	    private Sy_dk_dyxxService dk_dyxxService;
	    @Autowired
	    private dbxxService dbxxService;
	    @Autowired
	    private Sy_dk_dkrpoService dk_dkrpoService;
	    private Integer bid;
	    
	    
	   
	          @RequestMapping("/add")
	     public void add(@RequestBody Grzfdkjkhtxx htxx,HttpServletResponse response){
	    	    Date date=new Date();
	    	    response.setCharacterEncoding("utf-8");	    	    
	    	    try {	    	    	
	    	    	int result=grzfdkjkhtxxService.add(htxx);	    	    	
	    	    	Integer id=htxx.getHtzj();	    	    	
	    	    	bid=id;	    	    	
	    	    	Sy_dk_ydtqsp ydtqsp=new Sy_dk_ydtqsp();
	    	    	ydtqsp.setHtzj(id);
	    	    	ydtqsp.setGrbh(htxx.getGrbh());;
	    	    	ydtqsp.setDkzh(htxx.getDkzh());
	    	    	ydtqsp.setSqr(htxx.getJkrxm());
	    	    	ydtqsp.setYdtqrq(htxx.getYdhkr());
	    	    	ydtqsp.setDkqs(htxx.getDkqs());
	    	      //ydtqsp.setDkffe(htxx.getHtdkje());
	    	    	ydtqsp.setSpzt2("´ýÉóÅú");
	    	    	ydtqsp.setSqsj(date);
	    	    	System.out.println(ydtqsp.toString());
	    	    	ydtqspService.add(ydtqsp);
	    	    	//Integer id5=ydtqsp.getYdtqspzj();	    	    	
	    	    	//System.out.println(id);	 	    	    	
					PrintWriter  out=response.getWriter();
					out.print(result); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	    	    
	    	    
	     }
	          @RequestMapping("/adda")
		       public void adda(@RequestBody Sy_dk_dkrpo dkrpo,HttpServletResponse response){
		    	   
		    	     response.setCharacterEncoding("utf-8");		    	     
		    	     try {
		    	    	 int result=dk_dkrpoService.add(dkrpo);		    	    	 
		    	    	 Integer id=dkrpo.getPobh();
		    	    	 Grzfdkjkhtxx grzfdkjkhtxx=new Grzfdkjkhtxx();		    	    	 
		    	    	 grzfdkjkhtxx.setHtzj(bid);
		    	    	 grzfdkjkhtxx.setPobh(id);
		    	    	
		    	    	 grzfdkjkhtxxService.update(grzfdkjkhtxx);
		    	    	
						PrintWriter out=response.getWriter();
						 out.print(result);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	   
		       }
	          
	          @RequestMapping("/gtjkradd")
	 	     public void gtjkradd(@RequestBody Gtjkrxx gtjkr,HttpServletResponse response){
	 	    	 
	 	        	  response.setCharacterEncoding("utf-8");	  
	 	        	  try {
	 	        		  int result=gtjkrxxService.add(gtjkr);
	 	        		  Integer id2=gtjkr.getGtjkrzj();
	 	        		  Grzfdkjkhtxx grzfdkjkhtxx=new Grzfdkjkhtxx();	
	 	        		  grzfdkjkhtxx.setHtzj(bid);
	 	        		  grzfdkjkhtxx.setGtjkrzj(id2);
	 	        		//  System.out.println(grzfdkjkhtxx);
	 	        		  grzfdkjkhtxxService.update(grzfdkjkhtxx);
	 	        		
	 					PrintWriter out=response.getWriter();
	 					out.print(result);
	 				} catch (IOException e) {
	 					// TODO Auto-generated catch block
	 					e.printStackTrace();
	 				}
	 	    	 
	 	     }
	          @RequestMapping("/dyxxadd")
		      public void dyxxadd (@RequestBody Sy_dk_dyxx dyxx,HttpServletResponse response){
		        	 Date date=new Date();
		        	  response.setCharacterEncoding("utf-8");
		        	  try {
		        		  int result=dk_dyxxService.add(dyxx);
		        		  Integer id=dyxx.getDyxxzj();    	    	
			    	    	  	    	
			    	    	Dbxx dbxx=new Dbxx();
			    	    	dbxx.setDyxxzj(id);
			    	    	dbxx.setDywqzh(dyxx.getDywsyqzh());
			    	    	dbxx.setDywfwzl(dyxx.getDywdz());
			    	    	dbxx.setDyqjlrq(date);	
			    	    	dbxx.setDywpgjz(dyxx.getDyje());
			    	    	System.out.println(dbxx.toString());
			    	    	dbxxService.dbxxadd(dbxx);	 
			    	    Integer id3=dbxx.getDbxxzj();
			    	    Grzfdkjkhtxx grzfdkjkhtxx=new Grzfdkjkhtxx();	
			    	    grzfdkjkhtxx.setHtzj(bid);	
			    	    grzfdkjkhtxx.setDbhtxxzj(id3);	
			    	 //   System.out.println(grzfdkjkhtxx);
	 	        		  grzfdkjkhtxxService.update(grzfdkjkhtxx);
	 	        		  bid=null;
						PrintWriter out=response.getWriter();
						out.print(result);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		  }
	          @RequestMapping("/update5")
			   public void update5(Grzfdkjkhtxx htxx,HttpServletResponse response){
				   
				   response.setCharacterEncoding("utf-8");  
			   		   Integer idid=htxx.getHtzj();			   		 
			   		   Grzfdkjkhtxx sytqsp=new Grzfdkjkhtxx();
			   		   sytqsp.setHtzj(idid);
			   		sytqsp.setJkrysr(htxx.getJkrysr());
			   		sytqsp.setJkryhck(htxx.getJkryhck());
			   		sytqsp.setSwtyhmc(htxx.getSwtyhmc());
			   		sytqsp.setHtdkje(htxx.getHtdkje());
			   		sytqsp.setDkqs(htxx.getDkqs());
			   		sytqsp.setDklx(htxx.getDklx());
			   		sytqsp.setYdhkr(htxx.getYdhkr());
			   		sytqsp.setDkhkfs(htxx.getDkhkfs());
			   		sytqsp.setJkrxm(htxx.getJkrxm());
			   		sytqsp.setCxzhkhyhmc2(htxx.getCxzhkhyhmc2());
			   		sytqsp.setHkcxzh(htxx.getHkcxzh());
			   		sytqsp.setHkzhmc(htxx.getHkzhmc());
			   		sytqsp.setGfrxm(htxx.getGfrxm());
			   		sytqsp.setFwlx(htxx.getFwlx());
			   		sytqsp.setFwzl(htxx.getFwzl());
			   		sytqsp.setFwtnmj(htxx.getFwtnmj());
			   		sytqsp.setGfrsfzh(htxx.getGfrsfzh());
			   		sytqsp.setDkzh(htxx.getDkzh());
			   		sytqsp.setFwzj(htxx.getFwzj());
			   		sytqsp.setGfsfk(htxx.getGfsfk());
			   		sytqsp.setFwtnmjdj(htxx.getFwtnmjdj());
			   		grzfdkjkhtxxService.update(sytqsp);
				   
			   }
}
