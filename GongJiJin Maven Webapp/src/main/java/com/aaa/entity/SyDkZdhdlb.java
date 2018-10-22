package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyDkZdhdlb entity. @author MyEclipse Persistence Tools
 */

public class SyDkZdhdlb implements java.io.Serializable {

	// Fields

	private Integer zdhkzj;
	private Grzfdkzhxx grzfdkzhxx;
	private Jsxmdkzhxx jsxmdkzhxx;
	private SyGjYdhkrxx syGjYdhkrxx;
	private SyDkDhgl syDkDhgl;
	private String jlbh2;
	private String dkzh;
	private String cjr3;
	private Date cjsj3;
	private Set syDkKksjs = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyDkZdhdlb() {
	}

	/** full constructor */
	public SyDkZdhdlb(Grzfdkzhxx grzfdkzhxx, Jsxmdkzhxx jsxmdkzhxx, SyGjYdhkrxx syGjYdhkrxx, SyDkDhgl syDkDhgl,
			String jlbh2, String dkzh, String cjr3, Date cjsj3, Set syDkKksjs) {
		this.grzfdkzhxx = grzfdkzhxx;
		this.jsxmdkzhxx = jsxmdkzhxx;
		this.syGjYdhkrxx = syGjYdhkrxx;
		this.syDkDhgl = syDkDhgl;
		this.jlbh2 = jlbh2;
		this.dkzh = dkzh;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.syDkKksjs = syDkKksjs;
	}

	// Property accessors

	public Integer getZdhkzj() {
		return this.zdhkzj;
	}

	public void setZdhkzj(Integer zdhkzj) {
		this.zdhkzj = zdhkzj;
	}

	public Grzfdkzhxx getGrzfdkzhxx() {
		return this.grzfdkzhxx;
	}

	public void setGrzfdkzhxx(Grzfdkzhxx grzfdkzhxx) {
		this.grzfdkzhxx = grzfdkzhxx;
	}

	public Jsxmdkzhxx getJsxmdkzhxx() {
		return this.jsxmdkzhxx;
	}

	public void setJsxmdkzhxx(Jsxmdkzhxx jsxmdkzhxx) {
		this.jsxmdkzhxx = jsxmdkzhxx;
	}

	public SyGjYdhkrxx getSyGjYdhkrxx() {
		return this.syGjYdhkrxx;
	}

	public void setSyGjYdhkrxx(SyGjYdhkrxx syGjYdhkrxx) {
		this.syGjYdhkrxx = syGjYdhkrxx;
	}

	public SyDkDhgl getSyDkDhgl() {
		return this.syDkDhgl;
	}

	public void setSyDkDhgl(SyDkDhgl syDkDhgl) {
		this.syDkDhgl = syDkDhgl;
	}

	public String getJlbh2() {
		return this.jlbh2;
	}

	public void setJlbh2(String jlbh2) {
		this.jlbh2 = jlbh2;
	}

	public String getDkzh() {
		return this.dkzh;
	}

	public void setDkzh(String dkzh) {
		this.dkzh = dkzh;
	}

	public String getCjr3() {
		return this.cjr3;
	}

	public void setCjr3(String cjr3) {
		this.cjr3 = cjr3;
	}

	public Date getCjsj3() {
		return this.cjsj3;
	}

	public void setCjsj3(Date cjsj3) {
		this.cjsj3 = cjsj3;
	}

	public Set getSyDkKksjs() {
		return this.syDkKksjs;
	}

	public void setSyDkKksjs(Set syDkKksjs) {
		this.syDkKksjs = syDkKksjs;
	}

}