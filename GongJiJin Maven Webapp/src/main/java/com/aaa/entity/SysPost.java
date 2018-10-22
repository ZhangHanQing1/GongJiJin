package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysPost entity. @author MyEclipse Persistence Tools
 */

public class SysPost implements java.io.Serializable {

	// Fields

	private Integer postId;
	private String postCode;
	private String postName;
	private Integer postSort;
	private Integer status5;
	private String pemark;
	private Set sysUserPosts = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysPost() {
	}

	/** full constructor */
	public SysPost(String postCode, String postName, Integer postSort, Integer status5, String pemark,
			Set sysUserPosts) {
		this.postCode = postCode;
		this.postName = postName;
		this.postSort = postSort;
		this.status5 = status5;
		this.pemark = pemark;
		this.sysUserPosts = sysUserPosts;
	}

	// Property accessors

	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Integer getPostSort() {
		return this.postSort;
	}

	public void setPostSort(Integer postSort) {
		this.postSort = postSort;
	}

	public Integer getStatus5() {
		return this.status5;
	}

	public void setStatus5(Integer status5) {
		this.status5 = status5;
	}

	public String getPemark() {
		return this.pemark;
	}

	public void setPemark(String pemark) {
		this.pemark = pemark;
	}

	public Set getSysUserPosts() {
		return this.sysUserPosts;
	}

	public void setSysUserPosts(Set sysUserPosts) {
		this.sysUserPosts = sysUserPosts;
	}

}