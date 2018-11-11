package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Message;
import com.aaa.entity.Sys_menu;
import com.aaa.entity.Sys_role;
import com.aaa.entity.Sys_role_menu;
import com.aaa.entity.Sys_user;
import com.aaa.entity.Sys_user_post;
import com.aaa.entity.Sys_user_role;

public interface Sys_menuService {
	public List<Sys_menu> smrsel(Sys_user s,Sys_user_role sur);
	
	public List<Map<String, Object>> showUser(String user_name);
	//查询部门表
	public List<Map<String, Object>> showDept();
	//查询岗位表
	public List<Map<String, Object>> showPost();
	//查询角色表
	public List<Map<String, Object>> showRole();
	//
	public boolean addZong(Sys_user su,Sys_user_role sur,Sys_user_post sup);
	//修改用户表
	public boolean updateUser(Sys_user su);
	//修改用户表
	public boolean updateUser2(Sys_user su);
	//查询权限表
	public List<Map<String, Object>> showMenu(String menu_name,String url);
	//添加权限表
	public boolean addMenu(Sys_menu me);
	//通过id查询权限表
	public Sys_menu showMenu1(Sys_menu sm);
	//修改权限表
	public boolean updateMenu(Sys_menu me);
	//删除权限表
	public boolean deleteMenu(Sys_menu me);
	//添加角色表
	public boolean addRole(Sys_role ro);
	//启用和停用角色
	public boolean updateRole(Sys_role ro);
	//修改角色
	public boolean updateRole2(Sys_role ro);
	//删除角色
	public boolean deleteRole(Sys_role ro);
	//通过id查询角色表
	public Sys_role shoeRoleId(Sys_role ro);
	public List<Map<String, Object>> showMenuShu(int role_id);
	public List<Map<String, Object>> selectMeRo();
	public void deleteSRM(int role_id,Message srm);
	public List<Map<String, Object>> showMenu22();
}
