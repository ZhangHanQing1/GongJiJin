package com.aaa.entitys;

import java.util.HashSet;
import java.util.Set;

/**
 * SyDkDhgl entity. @author MyEclipse Persistence Tools
 */

public class SyDkDhgl implements java.io.Serializable {

	// Fields

	private Integer dhglzj;
	private SyDkHkjh syDkHkjh;
	private String dkzh;
	private String qtcsjl;
	private String dxcsjl;
	private String dhcsjl;
	private Set grzfdkyqdjxxes = new HashSet(0);
	private Set syDkZdhdlbs = new HashSet(0);
	private Set syDkGhdkrs = new HashSet(0);
	private Set jsxmdkyqdjxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyDkDhgl() {
	}

	/** full constructor */
	public SyDkDhgl(SyDkHkjh syDkHkjh, String dkzh, String qtcsjl, String dxcsjl, String dhcsjl, Set grzfdkyqdjxxes,
			Set syDkZdhdlbs, Set syDkGhdkrs, Set jsxmdkyqdjxxes) {
		this.syDkHkjh = syDkHkjh;
		this.dkzh = dkzh;
		this.qtcsjl = qtcsjl;
		this.dxcsjl = dxcsjl;
		this.dhcsjl = dhcsjl;
		this.grzfdkyqdjxxes = grzfdkyqdjxxes;
		this.syDkZdhdlbs = syDkZdhdlbs;
		this.syDkGhdkrs = syDkGhdkrs;
		this.jsxmdkyqdjxxes = jsxmdkyqdjxxes;
	}

	// Property accessors

	public Integer getDhglzj() {
		return this.dhglzj;
	}

	public void setDhglzj(Integer dhglzj) {
		this.dhglzj = dhglzj;
	}

	public SyDkHkjh getSyDkHkjh() {
		return this.syDkHkjh;
	}

	public void setSyDkHkjh(SyDkHkjh syDkHkjh) {
		this.syDkHkjh = syDkHkjh;
	}

	public String getDkzh() {
		return this.dkzh;
	}

	public void setDkzh(String dkzh) {
		this.dkzh = dkzh;
	}

	public String getQtcsjl() {
		return this.qtcsjl;
	}

	public void setQtcsjl(String qtcsjl) {
		this.qtcsjl = qtcsjl;
	}

	public String getDxcsjl() {
		return this.dxcsjl;
	}

	public void setDxcsjl(String dxcsjl) {
		this.dxcsjl = dxcsjl;
	}

	public String getDhcsjl() {
		return this.dhcsjl;
	}

	public void setDhcsjl(String dhcsjl) {
		this.dhcsjl = dhcsjl;
	}

	public Set getGrzfdkyqdjxxes() {
		return this.grzfdkyqdjxxes;
	}

	public void setGrzfdkyqdjxxes(Set grzfdkyqdjxxes) {
		this.grzfdkyqdjxxes = grzfdkyqdjxxes;
	}

	public Set getSyDkZdhdlbs() {
		return this.syDkZdhdlbs;
	}

	public void setSyDkZdhdlbs(Set syDkZdhdlbs) {
		this.syDkZdhdlbs = syDkZdhdlbs;
	}

	public Set getSyDkGhdkrs() {
		return this.syDkGhdkrs;
	}

	public void setSyDkGhdkrs(Set syDkGhdkrs) {
		this.syDkGhdkrs = syDkGhdkrs;
	}

	public Set getJsxmdkyqdjxxes() {
		return this.jsxmdkyqdjxxes;
	}

	public void setJsxmdkyqdjxxes(Set jsxmdkyqdjxxes) {
		this.jsxmdkyqdjxxes = jsxmdkyqdjxxes;
	}

}