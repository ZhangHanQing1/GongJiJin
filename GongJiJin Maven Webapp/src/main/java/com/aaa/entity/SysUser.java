package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SysUser entity. @author MyEclipse Persistence Tools
 */

public class SysUser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private SysDept sysDept;
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
	private Set dwzhs = new HashSet(0);
	private Set sysUserRoles = new HashSet(0);
	private Set sysUserPosts = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysUser() {
	}

	/** full constructor */
	public SysUser(SysDept sysDept, String loginName, String userName, String userType, String email, String phonenum,
			String sex, String passwords, Integer status, String delFlag, Date loginDate, String remark, Set dwzhs,
			Set sysUserRoles, Set sysUserPosts) {
		this.sysDept = sysDept;
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
		this.dwzhs = dwzhs;
		this.sysUserRoles = sysUserRoles;
		this.sysUserPosts = sysUserPosts;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public SysDept getSysDept() {
		return this.sysDept;
	}

	public void setSysDept(SysDept sysDept) {
		this.sysDept = sysDept;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenum() {
		return this.phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPasswords() {
		return this.passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public Date getLoginDate() {
		return this.loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getDwzhs() {
		return this.dwzhs;
	}

	public void setDwzhs(Set dwzhs) {
		this.dwzhs = dwzhs;
	}

	public Set getSysUserRoles() {
		return this.sysUserRoles;
	}

	public void setSysUserRoles(Set sysUserRoles) {
		this.sysUserRoles = sysUserRoles;
	}

	public Set getSysUserPosts() {
		return this.sysUserPosts;
	}

	public void setSysUserPosts(Set sysUserPosts) {
		this.sysUserPosts = sysUserPosts;
	}

}