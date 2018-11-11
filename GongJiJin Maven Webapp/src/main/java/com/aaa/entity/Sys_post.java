package com.aaa.entity;

public class Sys_post {
	private Integer post_id;
	private String post_code;
	private String post_name;
	private Integer post_sort;
	private Integer status5;
	private String pemark;
	private Sys_user_post sys_user_post;
	public Integer getPost_id() {
		return post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public Integer getPost_sort() {
		return post_sort;
	}
	public void setPost_sort(Integer post_sort) {
		this.post_sort = post_sort;
	}
	public Integer getStatus5() {
		return status5;
	}
	public void setStatus5(Integer status5) {
		this.status5 = status5;
	}
	public String getPemark() {
		return pemark;
	}
	public void setPemark(String pemark) {
		this.pemark = pemark;
	}
	public Sys_user_post getSys_user_post() {
		return sys_user_post;
	}
	public void setSys_user_post(Sys_user_post sys_user_post) {
		this.sys_user_post = sys_user_post;
	}
	public Sys_post(Integer post_id, String post_code, String post_name, Integer post_sort, Integer status5,
			String pemark, Sys_user_post sys_user_post) {
		super();
		this.post_id = post_id;
		this.post_code = post_code;
		this.post_name = post_name;
		this.post_sort = post_sort;
		this.status5 = status5;
		this.pemark = pemark;
		this.sys_user_post = sys_user_post;
	}
	public Sys_post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
