package com.aaa.entity;

import java.util.Date;

public class Sys_user {
    private Integer userId;

    private Integer deptId;

    private String loginName;

    private String userName;

    private String userType;

    private String email;

    private String phonenum;

    private String sex;

    private String passwords;

    private Integer status;

    private String delFlag;

    private Date loginDate;

    private String remark;
    
    private Sys_user_post sys_user_post;
    
    private Sys_user_role sys_user_role;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
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

	public Sys_user(Integer userId, Integer deptId, String loginName, String userName, String userType, String email,
			String phonenum, String sex, String passwords, Integer status, String delFlag, Date loginDate,
			String remark, Sys_user_post sys_user_post, Sys_user_role sys_user_role) {
		super();
		this.userId = userId;
		this.deptId = deptId;
		this.loginName = loginName;
		this.userName = userName;
		this.userType = userType;
		this.email = email;
		this.phonenum = phonenum;
		this.sex = sex;
		this.passwords = passwords;
		this.status = status;
		this.delFlag = delFlag;
		this.loginDate = loginDate;
		this.remark = remark;
		this.sys_user_post = sys_user_post;
		this.sys_user_role = sys_user_role;
	}

	public Sys_user() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}