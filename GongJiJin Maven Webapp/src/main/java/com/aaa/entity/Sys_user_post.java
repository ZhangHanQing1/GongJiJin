package com.aaa.entity;

public class Sys_user_post {
	private Integer sup_id;
	private Integer user_id;
	private Integer post_id;
	public Integer getSup_id() {
		return sup_id;
	}
	public void setSup_id(Integer sup_id) {
		this.sup_id = sup_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getPost_id() {
		return post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public Sys_user_post(Integer sup_id, Integer user_id, Integer post_id) {
		super();
		this.sup_id = sup_id;
		this.user_id = user_id;
		this.post_id = post_id;
	}
	public Sys_user_post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
