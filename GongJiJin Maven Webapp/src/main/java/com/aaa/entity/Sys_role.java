package com.aaa.entity;

public class Sys_role {
	private Integer role_id;
	private String role_name;
	private String role_key;
	private String role_sort;
	private Integer status;
	private String remark;
	private Sys_role_menu sys_role_menu;
	private Sys_user_role sys_user_role;
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_key() {
		return role_key;
	}
	public void setRole_key(String role_key) {
		this.role_key = role_key;
	}
	public String getRole_sort() {
		return role_sort;
	}
	public void setRole_sort(String role_sort) {
		this.role_sort = role_sort;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Sys_role_menu getSys_role_menu() {
		return sys_role_menu;
	}
	public void setSys_role_menu(Sys_role_menu sys_role_menu) {
		this.sys_role_menu = sys_role_menu;
	}
	public Sys_user_role getSys_user_role() {
		return sys_user_role;
	}
	public void setSys_user_role(Sys_user_role sys_user_role) {
		this.sys_user_role = sys_user_role;
	}
	public Sys_role(Integer role_id, String role_name, String role_key, String role_sort, Integer status, String remark,
			Sys_role_menu sys_role_menu, Sys_user_role sys_user_role) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.role_key = role_key;
		this.role_sort = role_sort;
		this.status = status;
		this.remark = remark;
		this.sys_role_menu = sys_role_menu;
		this.sys_user_role = sys_user_role;
	}
	public Sys_role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
