package com.aaa.entitys;

/**
 * SysUserPost entity. @author MyEclipse Persistence Tools
 */

public class SysUserPost implements java.io.Serializable {

	// Fields

	private Integer supId;
	private SysUser sysUser;
	private SysPost sysPost;

	// Constructors

	/** default constructor */
	public SysUserPost() {
	}

	/** full constructor */
	public SysUserPost(SysUser sysUser, SysPost sysPost) {
		this.sysUser = sysUser;
		this.sysPost = sysPost;
	}

	// Property accessors

	public Integer getSupId() {
		return this.supId;
	}

	public void setSupId(Integer supId) {
		this.supId = supId;
	}

	public SysUser getSysUser() {
		return this.sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public SysPost getSysPost() {
		return this.sysPost;
	}

	public void setSysPost(SysPost sysPost) {
		this.sysPost = sysPost;
	}

}