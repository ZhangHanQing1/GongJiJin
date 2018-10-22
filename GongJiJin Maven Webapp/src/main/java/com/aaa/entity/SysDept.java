package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysDept entity. @author MyEclipse Persistence Tools
 */

public class SysDept implements java.io.Serializable {

	// Fields

	private Integer deptId;
	private Integer parenId;
	private String deptName;
	private Integer orderNum;
	private String lerder;
	private String phone;
	private String email;
	private Integer status;
	private Set sysUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysDept() {
	}

	/** full constructor */
	public SysDept(Integer parenId, String deptName, Integer orderNum, String lerder, String phone, String email,
			Integer status, Set sysUsers) {
		this.parenId = parenId;
		this.deptName = deptName;
		this.orderNum = orderNum;
		this.lerder = lerder;
		this.phone = phone;
		this.email = email;
		this.status = status;
		this.sysUsers = sysUsers;
	}

	// Property accessors

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getParenId() {
		return this.parenId;
	}

	public void setParenId(Integer parenId) {
		this.parenId = parenId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public String getLerder() {
		return this.lerder;
	}

	public void setLerder(String lerder) {
		this.lerder = lerder;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set getSysUsers() {
		return this.sysUsers;
	}

	public void setSysUsers(Set sysUsers) {
		this.sysUsers = sysUsers;
	}

}