package com.aaa.entity;

public class Sys_user_role {
	private Integer sur_id;
	private Integer user_id;
	private Integer role_id;
	public Integer getSur_id() {
		return sur_id;
	}
	public void setSur_id(Integer sur_id) {
		this.sur_id = sur_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public Sys_user_role(Integer sur_id, Integer user_id, Integer role_id) {
		super();
		this.sur_id = sur_id;
		this.user_id = user_id;
		this.role_id = role_id;
	}
	public Sys_user_role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
