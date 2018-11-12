package com.aaa.fhx.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.Sys_userMapper;
import com.aaa.entity.Message;
import com.aaa.entity.Sys_menu;
import com.aaa.entity.Sys_role;
import com.aaa.entity.Sys_role_menu;
import com.aaa.entity.Sys_user;
import com.aaa.entity.Sys_user_post;
import com.aaa.entity.Sys_user_role;


@Service
public class Sys_menuServiceImpl implements Sys_menuService {
	@Autowired
	private Sys_userMapper dao;
	@Override
	public List<Sys_menu> smrsel(Sys_user s, Sys_user_role sur) {
		// TODO Auto-generated method stub
		Sys_user su=dao.ussel(s);
		System.out.println(su);
		System.out.println(su.getSys_user_role().getRoleId());
		if(su!=null){
			sur.setRoleId(su.getSys_user_role().getRoleId());
			System.out.println(su.getSys_user_role().getRoleId());
			if(s.getPasswords().equals(su.getPasswords()) && su.getDelFlag().equals("0") && su.getStatus()==0){
				List<Sys_menu> list=dao.mesel(sur);
				System.out.println(list);
				return list;
			}else{
				return null;
			}
		}
		return null;
	}
	@Override
	public List<Map<String, Object>> showUser() {
		// TODO Auto-generated method stub
		return dao.showUser();
	}
	//查询部门表
	@Override
	public List<Map<String, Object>> showDept() {
		// TODO Auto-generated method stub
		return dao.showDept();
	}
	//查询岗位表
	@Override
	public List<Map<String, Object>> showPost() {
		// TODO Auto-generated method stub
		return dao.showPost();
	}
	//查询角色表
	@Override
	public List<Map<String, Object>> showRole() {
		// TODO Auto-generated method stub
		return dao.showRole();
	}
	@Transactional
	@Override
	public boolean addZong(Sys_user su, Sys_user_role sur, Sys_user_post sup) {
		// TODO Auto-generated method stub
		Sys_user u=dao.selUser(su);
		if(u==null){
			if(su!=null&&sur!=null&&sup!=null){
				dao.addUser(su);
				dao.addSup(sup);
				dao.addSur(sur);
				return true;
			}
		}else {
			return false;
		}
		return false;
	}
	@Transactional
	@Override
	public boolean updateUser(Sys_user su) {
		// TODO Auto-generated method stub
		System.out.println(su.getUserId());
		if(su.getStatus()==0){
		boolean num=dao.updateUser(su);
		return num;
		}
		if(su.getStatus()==1){
			boolean num1=dao.updateUser1(su);
			return num1;
		}
		
		return false;
	}
	@Override
	public boolean updateUser2(Sys_user su) {
		// TODO Auto-generated method stub
		return dao.updateUser2(su);
	}
	//查询权限表
	@Override
	public List<Map<String, Object>> showMenu(String menu_name,String url) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list=dao.showMenu(menu_name);
		if(list.size()==0){
			List<Map<String, Object>> list1=dao.showMenu2(url);
			return list1;
		}else {
			return list;
		}
		
	}
	//添加权限表
	@Override
	public boolean addMenu(Sys_menu me) {
		// TODO Auto-generated method stub
		boolean num=dao.addMenu(me);
		return num;
	}
	//通过id查询权限表
	@Override
	public Sys_menu showMenu1(Sys_menu sm) {
		// TODO Auto-generated method stub
		return dao.showMenu1(sm);
	}
	//修改权限表
	@Override
	public boolean updateMenu(Sys_menu me) {
		// TODO Auto-generated method stub
		return dao.updateMenu(me);
	}
	//删除权限表
	@Override
	public boolean deleteMenu(Sys_menu me) {
		// TODO Auto-generated method stub
		return dao.deleteMenu(me);
	}
	@Override
	public boolean addRole(Sys_role ro) {
		// TODO Auto-generated method stub
		return dao.addRole(ro);
	}
	//启用和停用角色
	@Override
	public boolean updateRole(Sys_role ro) {
		// TODO Auto-generated method stub
		if(ro.getStatus()==0){
			return dao.updateRole(ro);
		}
		if(ro.getStatus()==1){
			return dao.updateRole1(ro);
		}
		/*if(ro.getRole_name()!=null){
			return dao.updateRole2(ro);
		}*/
		/*if(ro.getRole_name().equals(null) && ro.getStatus()==null){
			System.out.println("aa");
			return dao.deleteRole(ro);
		}*/
		return false;
	}
	//修改角色表
	@Override
	public boolean updateRole2(Sys_role ro) {
		// TODO Auto-generated method stub
		return dao.updateRole2(ro);
	}
	//删除角色表
	@Override
	public boolean deleteRole(Sys_role ro) {
		// TODO Auto-generated method stub
		return dao.deleteRole(ro);
	}
	//通过id查询角色表
	@Override
	public Sys_role shoeRoleId(Sys_role ro) {
		// TODO Auto-generated method stub
		return dao.shoeRoleId(ro);
	}
	@Override
	public List<Map<String, Object>> showMenuShu(int role_id) {
		// TODO Auto-generated method stub
		return dao.showMenuShu(role_id);
	}
	@Override
	public List<Map<String, Object>> selectMeRo() {
		// TODO Auto-generated method stub
		return dao.selectMeRo();
	}
	@Transactional
	@Override
	public void deleteSRM(int role_id,Message srm) {
		// TODO Auto-generated method stub
		 dao.deleteSRM(role_id);
		for (int i = 0; i < srm.getList().size(); i++) {
			Sys_role_menu a1=new Sys_role_menu();
			a1.setMenuId(srm.getList().get(i).getMenuId());
			a1.setRoleId(role_id);
			dao.addSRM(a1);
		}
	}

}
