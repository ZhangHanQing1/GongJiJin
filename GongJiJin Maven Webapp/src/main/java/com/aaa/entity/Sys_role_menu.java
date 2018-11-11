package com.aaa.entity;

public class Sys_role_menu {
	private Integer srm_id;
	private Integer role_id;
	private Integer menu_id;
	public Integer getSrm_id() {
		return srm_id;
	}
	public void setSrm_id(Integer srm_id) {
		this.srm_id = srm_id;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public Sys_role_menu(Integer srm_id, Integer role_id, Integer menu_id) {
		super();
		this.srm_id = srm_id;
		this.role_id = role_id;
		this.menu_id = menu_id;
	}
	public Sys_role_menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
