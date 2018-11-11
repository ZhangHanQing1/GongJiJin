package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


import com.aaa.entity.Sys_menu;
import com.aaa.entity.Sys_role;
import com.aaa.entity.Sys_role_menu;
import com.aaa.entity.Sys_user;
import com.aaa.entity.Sys_user_post;
import com.aaa.entity.Sys_user_role;

public interface Sys_userDao {
	public Sys_user ussel(Sys_user s);
	public List<Sys_menu> mesel(Sys_user_role sur);
	public List<Map<String, Object>> showUser(@Param("user_name") String user_name);
	//查询部门表
	public List<Map<String, Object>> showDept();
	//查询岗位表
	public List<Map<String, Object>> showPost();
	//查询岗位表
	public List<Map<String, Object>> showRole();
	//添加用户表
	public boolean addUser(Sys_user su);
	//查询登陆名是否一致
	public Sys_user selUser(Sys_user su);
	//添加用户岗位关联表
	public boolean addSup(Sys_user_post sup);
	//添加用户角色关联表
	public boolean addSur(Sys_user_role sur);
	//修改用户表
	public boolean updateUser(Sys_user su);
	//修改用户表
	public boolean updateUser1(Sys_user su);
	//修改用户表
	public boolean updateUser2(Sys_user su);
	//查询权限表
	public List<Map<String, Object>> showMenu(@Param("menu_name") String menu_name);
	//查询权限表
	public List<Map<String, Object>> showMenu2(@Param("url") String url);
	//添加权限表
	public boolean addMenu(Sys_menu me);
	//通过id查询权限表
	public Sys_menu showMenu1(Sys_menu sm);
	//修改权限表
	public boolean updateMenu(Sys_menu me);
	//修改权限表
	public boolean updateMenu5(Sys_menu me);
	//删除权限表
	public boolean deleteMenu(Sys_menu me);
	//添加角色表
	public boolean addRole(Sys_role ro);
	//停用角色
	public boolean updateRole(Sys_role ro);
	//启用角色
	public boolean updateRole1(Sys_role ro);
	//修改角色
	public boolean updateRole2(Sys_role ro);
	//删除角色
	public boolean deleteRole(Sys_role ro);
	//通过id查询角色表
	public Sys_role shoeRoleId(Sys_role ro);
	public List<Map<String, Object>> showMenuShu(int role_id);
	public List<Map<String, Object>> selectMeRo();
	public int deleteSRM(int role_id);
	public int addSRM(Sys_role_menu srm);
	public List<Map<String, Object>> showMenu22();
}
