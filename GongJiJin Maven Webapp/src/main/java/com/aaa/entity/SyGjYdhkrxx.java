package com.aaa.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyGjYdhkrxx entity. @author MyEclipse Persistence Tools
 */

public class SyGjYdhkrxx implements java.io.Serializable {

	// Fields

	private Integer hkrzj;
	private Grzhxx grzhxx;
	private SyDkYdtqsp syDkYdtqsp;
	private String hkrxxbh;
	private String hkrdwzh;
	private String hkrgrzh;
	private String hkrxm;
	private String hkrzjhm;
	private BigDecimal hkryxj;
	private String cjr3;
	private Date cjsj3;
	private String dkzh;
	private Set syDkYdtqsps = new HashSet(0);
	private Set syDkZdhdlbs = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyGjYdhkrxx() {
	}

	/** minimal constructor */
	public SyGjYdhkrxx(String hkrxxbh) {
		this.hkrxxbh = hkrxxbh;
	}

	/** full constructor */
	public SyGjYdhkrxx(Grzhxx grzhxx, SyDkYdtqsp syDkYdtqsp, String hkrxxbh, String hkrdwzh, String hkrgrzh,
			String hkrxm, String hkrzjhm, BigDecimal hkryxj, String cjr3, Date cjsj3, String dkzh, Set syDkYdtqsps,
			Set syDkZdhdlbs) {
		this.grzhxx = grzhxx;
		this.syDkYdtqsp = syDkYdtqsp;
		this.hkrxxbh = hkrxxbh;
		this.hkrdwzh = hkrdwzh;
		this.hkrgrzh = hkrgrzh;
		this.hkrxm = hkrxm;
		this.hkrzjhm = hkrzjhm;
		this.hkryxj = hkryxj;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.dkzh = dkzh;
		this.syDkYdtqsps = syDkYdtqsps;
		this.syDkZdhdlbs = syDkZdhdlbs;
	}

	// Property accessors

	public Integer getHkrzj() {
		return this.hkrzj;
	}

	public void setHkrzj(Integer hkrzj) {
		this.hkrzj = hkrzj;
	}

	public Grzhxx getGrzhxx() {
		return this.grzhxx;
	}

	public void setGrzhxx(Grzhxx grzhxx) {
		this.grzhxx = grzhxx;
	}

	public SyDkYdtqsp getSyDkYdtqsp() {
		return this.syDkYdtqsp;
	}

	public void setSyDkYdtqsp(SyDkYdtqsp syDkYdtqsp) {
		this.syDkYdtqsp = syDkYdtqsp;
	}

	public String getHkrxxbh() {
		return this.hkrxxbh;
	}

	public void setHkrxxbh(String hkrxxbh) {
		this.hkrxxbh = hkrxxbh;
	}

	public String getHkrdwzh() {
		return this.hkrdwzh;
	}

	public void setHkrdwzh(String hkrdwzh) {
		this.hkrdwzh = hkrdwzh;
	}

	public String getHkrgrzh() {
		return this.hkrgrzh;
	}

	public void setHkrgrzh(String hkrgrzh) {
		this.hkrgrzh = hkrgrzh;
	}

	public String getHkrxm() {
		return this.hkrxm;
	}

	public void setHkrxm(String hkrxm) {
		this.hkrxm = hkrxm;
	}

	public String getHkrzjhm() {
		return this.hkrzjhm;
	}

	public void setHkrzjhm(String hkrzjhm) {
		this.hkrzjhm = hkrzjhm;
	}

	public BigDecimal getHkryxj() {
		return this.hkryxj;
	}

	public void setHkryxj(BigDecimal hkryxj) {
		this.hkryxj = hkryxj;
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

	public String getDkzh() {
		return this.dkzh;
	}

	public void setDkzh(String dkzh) {
		this.dkzh = dkzh;
	}

	public Set getSyDkYdtqsps() {
		return this.syDkYdtqsps;
	}

	public void setSyDkYdtqsps(Set syDkYdtqsps) {
		this.syDkYdtqsps = syDkYdtqsps;
	}

	public Set getSyDkZdhdlbs() {
		return this.syDkZdhdlbs;
	}

	public void setSyDkZdhdlbs(Set syDkZdhdlbs) {
		this.syDkZdhdlbs = syDkZdhdlbs;
	}

}