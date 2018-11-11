package com.aaa.entity;

public class Sys_user {
	private Integer user_id;
	private Integer dept_id;
	private String login_name;
	private String user_name;
	private String user_type;
	private String email;
	private String phonenum;
	private String sex;
	private String passwords;
	private Integer status;
	private String del_flag;
	private String login_date;
	private String remark;
	private Sys_user_post sys_user_post;
	private Sys_user_role sys_user_role;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}
	public String getLogin_date() {
		return login_date;
	}
	public void setLogin_date(String login_date) {
		this.login_date = login_date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Sys_user_post getSys_user_post() {
		return sys_user_post;
	}
	public void setSys_user_post(Sys_user_post sys_user_post) {
		this.sys_user_post = sys_user_post;
	}
	public Sys_user_role getSys_user_role() {
		return sys_user_role;
	}
	public void setSys_user_role(Sys_user_role sys_user_role) {
		this.sys_user_role = sys_user_role;
	}
	public Sys_user(Integer user_id, Integer dept_id, String login_name, String user_name, String user_type,
			String email, String phonenum, String sex, String passwords, Integer status, String del_flag,
			String login_date, String remark, Sys_user_post sys_user_post, Sys_user_role sys_user_role) {
		super();
		this.user_id = user_id;
		this.dept_id = dept_id;
		this.login_name = login_name;
		this.user_name = user_name;
		this.user_type = user_type;
		this.email = email;
		this.phonenum = phonenum;
		this.sex = sex;
		this.passwords = passwords;
		this.status = status;
		this.del_flag = del_flag;
		this.login_date = login_date;
		this.remark = remark;
		this.sys_user_post = sys_user_post;
		this.sys_user_role = sys_user_role;
	}
	public Sys_user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sys_user [user_id=" + user_id + ", dept_id=" + dept_id + ", login_name=" + login_name + ", user_name="
				+ user_name + ", user_type=" + user_type + ", email=" + email + ", phonenum=" + phonenum + ", sex="
				+ sex + ", passwords=" + passwords + ", status=" + status + ", del_flag=" + del_flag + ", login_date="
				+ login_date + ", remark=" + remark + ", sys_user_post=" + sys_user_post + ", sys_user_role="
				+ sys_user_role + "]";
	}
	
	
}
