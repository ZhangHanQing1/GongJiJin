package com.aaa.entitys;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyDkHkjh entity. @author MyEclipse Persistence Tools
 */

public class SyDkHkjh implements java.io.Serializable {

	// Fields

	private Integer hkjhzj;
	private SyDkYdtqsp syDkYdtqsp;
	private String dkzh;
	private Date hkrq;
	private Long qic;
	private Long yhbj;
	private Long yhlx;
	private String ztz;
	private String cjr;
	private Date cjsj;
	private String tzzd1;
	private String tzzd2;
	private String tzzd3;
	private Set syDkDhgls = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyDkHkjh() {
	}

	/** full constructor */
	public SyDkHkjh(SyDkYdtqsp syDkYdtqsp, String dkzh, Date hkrq, Long qic, Long yhbj, Long yhlx, String ztz,
			String cjr, Date cjsj, String tzzd1, String tzzd2, String tzzd3, Set syDkDhgls) {
		this.syDkYdtqsp = syDkYdtqsp;
		this.dkzh = dkzh;
		this.hkrq = hkrq;
		this.qic = qic;
		this.yhbj = yhbj;
		this.yhlx = yhlx;
		this.ztz = ztz;
		this.cjr = cjr;
		this.cjsj = cjsj;
		this.tzzd1 = tzzd1;
		this.tzzd2 = tzzd2;
		this.tzzd3 = tzzd3;
		this.syDkDhgls = syDkDhgls;
	}

	// Property accessors

	public Integer getHkjhzj() {
		return this.hkjhzj;
	}

	public void setHkjhzj(Integer hkjhzj) {
		this.hkjhzj = hkjhzj;
	}

	public SyDkYdtqsp getSyDkYdtqsp() {
		return this.syDkYdtqsp;
	}

	public void setSyDkYdtqsp(SyDkYdtqsp syDkYdtqsp) {
		this.syDkYdtqsp = syDkYdtqsp;
	}

	public String getDkzh() {
		return this.dkzh;
	}

	public void setDkzh(String dkzh) {
		this.dkzh = dkzh;
	}

	public Date getHkrq() {
		return this.hkrq;
	}

	public void setHkrq(Date hkrq) {
		this.hkrq = hkrq;
	}

	public Long getQic() {
		return this.qic;
	}

	public void setQic(Long qic) {
		this.qic = qic;
	}

	public Long getYhbj() {
		return this.yhbj;
	}

	public void setYhbj(Long yhbj) {
		this.yhbj = yhbj;
	}

	public Long getYhlx() {
		return this.yhlx;
	}

	public void setYhlx(Long yhlx) {
		this.yhlx = yhlx;
	}

	public String getZtz() {
		return this.ztz;
	}

	public void setZtz(String ztz) {
		this.ztz = ztz;
	}

	public String getCjr() {
		return this.cjr;
	}

	public void setCjr(String cjr) {
		this.cjr = cjr;
	}

	public Date getCjsj() {
		return this.cjsj;
	}

	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}

	public String getTzzd1() {
		return this.tzzd1;
	}

	public void setTzzd1(String tzzd1) {
		this.tzzd1 = tzzd1;
	}

	public String getTzzd2() {
		return this.tzzd2;
	}

	public void setTzzd2(String tzzd2) {
		this.tzzd2 = tzzd2;
	}

	public String getTzzd3() {
		return this.tzzd3;
	}

	public void setTzzd3(String tzzd3) {
		this.tzzd3 = tzzd3;
	}

	public Set getSyDkDhgls() {
		return this.syDkDhgls;
	}

	public void setSyDkDhgls(Set syDkDhgls) {
		this.syDkDhgls = syDkDhgls;
	}

}