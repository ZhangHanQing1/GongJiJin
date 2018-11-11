package com.aaa.entity;

public class Sys_dept {
	private Integer dept_id;
	private Integer paren_id;
	private String dept_name;
	private Integer order_num;
	private String lerder;
	private String phone;
	private String email;
	private Integer status;
	private Sys_user sys_user;
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public Integer getParen_id() {
		return paren_id;
	}
	public void setParen_id(Integer paren_id) {
		this.paren_id = paren_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Integer getOrder_num() {
		return order_num;
	}
	public void setOrder_num(Integer order_num) {
		this.order_num = order_num;
	}
	public String getLerder() {
		return lerder;
	}
	public void setLerder(String lerder) {
		this.lerder = lerder;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Sys_user getSys_user() {
		return sys_user;
	}
	public void setSys_user(Sys_user sys_user) {
		this.sys_user = sys_user;
	}
	public Sys_dept(Integer dept_id, Integer paren_id, String dept_name, Integer order_num, String lerder, String phone,
			String email, Integer status, Sys_user sys_user) {
		super();
		this.dept_id = dept_id;
		this.paren_id = paren_id;
		this.dept_name = dept_name;
		this.order_num = order_num;
		this.lerder = lerder;
		this.phone = phone;
		this.email = email;
		this.status = status;
		this.sys_user = sys_user;
	}
	public Sys_dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
