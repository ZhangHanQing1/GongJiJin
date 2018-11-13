package com.aaa.controller;

import java.awt.Menu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Message;

import com.aaa.entity.Sys_menu;
import com.aaa.entity.Sys_role;
import com.aaa.entity.Sys_role_menu;
import com.aaa.entity.Sys_user;
import com.aaa.entity.Sys_user_post;
import com.aaa.entity.Sys_user_role;
import com.aaa.service.Sys_menuService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class Sys_menuController {
	@Autowired
	private Sys_menuService sms;
	@RequestMapping("/login")
	public String menusel(Sys_user s, Sys_user_role sur,HttpServletResponse response,HttpSession session,HttpServletRequest request,Map map) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		List<Sys_menu> list=sms.smrsel(s, sur);
		
		if(list!=null){
			System.out.println(s.getUser_name());
		session.setAttribute("user_name", s.getUser_name());
		session.setAttribute("list", list);
		return "forward:index.jsp";
		}
		if(list==null) {
			session.setAttribute("list", "1");
			//map.put("list", "1");
			/*try {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			return "forward:deng.jsp";
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/showUser")
	public PageInfo<Map<String, Object>> showUser(String user_name,Integer startPage){
		PageHelper.startPage(startPage, 3);
		List<Map<String, Object>> list=sms.showUser(user_name);
		PageInfo<Map<String, Object>> p1=new PageInfo<Map<String,Object>>(list);
		return p1;
	}
	//查询部门表
	@ResponseBody
	@RequestMapping("/showDept")
	public List<Map<String, Object>> showDept(){
		List<Map<String, Object>> list=sms.showDept();
		return list;
	}
	//查询岗位表
	@ResponseBody
	@RequestMapping("/showPost")
	public List<Map<String, Object>> showPost(){
		List<Map<String, Object>> list=sms.showPost();
		return list;
	}
	//查询角色表
	@ResponseBody
	@RequestMapping("/showRole")
	public List<Map<String, Object>> showRole(){
		List<Map<String, Object>> list=sms.showRole();
		return list;
	}
	//添加用户和用户岗位关联表和用户角色关联表
	@ResponseBody
	@RequestMapping("/addUser")
	public int add(Sys_user su,Sys_user_role sur,Sys_user_post sup,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		System.out.println(su.getUser_id());
		System.out.println(sur.getRole_id());
		System.out.println(sup.getPost_id());
		boolean num=sms.addZong(su, sur, sup);
		int num1=1;
		int num2=2;
		if(num==false){
			return num1;
		}else {
			return num2;
		}
		
	}
	@RequestMapping("/updateUser")
	public void updateUser(Sys_user su,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		System.out.println(su.getUser_id());
		sms.updateUser(su);
	}
	@RequestMapping("/Flag")
	public void updateUser2(Sys_user su,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		System.out.println(su.getUser_id());
		sms.updateUser2(su);
	}
	
	//查询权限表
	@ResponseBody
	@RequestMapping("/showMenu")
	public PageInfo<Map<String, Object>> showMenu(String menu_name,String url,Integer startPage,HttpServletResponse response){
		PageHelper.startPage(startPage, 3);
		System.out.println(startPage);
		List<Map<String, Object>> list=sms.showMenu(menu_name, url);
		PageInfo<Map<String, Object>> p1=new PageInfo<Map<String,Object>>(list);
		return p1;
	}
	@RequestMapping("/addMenu")
	public void addMenu(Sys_menu sm,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		System.out.println(sm.getOrder_num());
		sms.addMenu(sm);
	}
	//通过id查询权限表
	@ResponseBody
	@RequestMapping("/showMenu1")
	public Sys_menu showMenu1(Sys_menu sm){
		System.out.println(sm.getMenu_id());
		Sys_menu list=sms.showMenu1(sm);
		System.out.println(list);
		return list;
	}
	//修改权限表
	@RequestMapping("/updateMenu")
	public void updateMenu(Sys_menu sm,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		sms.updateMenu(sm);
	}
	//修改权限表
		@RequestMapping("/deleteMenu")
		public void deleteMenu(Sys_menu sm,HttpServletResponse response) throws IOException{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out= response.getWriter();
			sms.deleteMenu(sm);
		}
		//添加角色表
		@RequestMapping("/addRole")
		public void addRole(Sys_role ro,HttpServletResponse response) throws IOException{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out= response.getWriter();
			sms.addRole(ro);
		}
		//启用和停用角色
		@RequestMapping("/updateRole")
		public void updateRole(Sys_role ro,HttpServletResponse response) throws IOException{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out= response.getWriter();
			System.out.println(ro.getRole_id());
			sms.updateRole(ro);
		}
		//通过id查询角色表
		@ResponseBody
		@RequestMapping("/shoeRoleId")
		public Sys_role shoeRoleId(Sys_role ro){
			System.out.println("aa");
			System.out.println(ro.getRole_id());
			Sys_role list=sms.shoeRoleId(ro);
			return list;
		}
		//修改角色表
		@RequestMapping("/updeteRole2")
		public void updateRole2(Sys_role ro,HttpServletResponse response) throws IOException{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out= response.getWriter();
			System.out.println();
			sms.updateRole2(ro);
		}		
		//删除角色表
		@RequestMapping("/deleteRole")
		public void deleteRole(Sys_role ro,HttpServletResponse response) throws IOException{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out= response.getWriter();
			sms.deleteRole(ro);
		}	
		@ResponseBody
		@RequestMapping("/showMenuShu")
		public List<Map<String, Object>> showMenuShu(int role_id){
			List<Map<String, Object>> list=sms.showMenuShu(role_id);
			System.out.println(role_id);
			System.out.println(list);
			return list;
		}
		@ResponseBody
		@RequestMapping("/selectMeRo")
		public List<Map<String, Object>> selectMeRo(){
			List<Map<String, Object>>  list=sms.selectMeRo();
			System.out.println(list);
			return list;
		}
		@RequestMapping("/SRMsss")
		public void deleteSRMsss(int role_id,Message srm,HttpServletResponse response) throws IOException{
			response.setContentType("text/html;charset=utf-8");
			System.out.println("aa");
			System.out.println(role_id);
			sms.deleteSRM(role_id, srm);
		}
		@ResponseBody
		@RequestMapping("/showMenu222")
		public List<Map<String, Object>> showMenu222(){
			List<Map<String, Object>> list=sms.showMenu22();
			return list;
		}
}
