package com.aaa.entitys;

import java.util.Date;

/**
 * SyDkGhdkr entity. @author MyEclipse Persistence Tools
 */

public class SyDkGhdkr implements java.io.Serializable {

	// Fields

	private Integer ghdkrzj;
	private SyDkDhgl syDkDhgl;
	private String jlbh2;
	private String bgqdkzh;
	private String bghdkzh;
	private String cjr3;
	private Date cjsj3;
	private String tzzd4;
	private String tzzd5;
	private String tzzd6;

	// Constructors

	/** default constructor */
	public SyDkGhdkr() {
	}

	/** full constructor */
	public SyDkGhdkr(SyDkDhgl syDkDhgl, String jlbh2, String bgqdkzh, String bghdkzh, String cjr3, Date cjsj3,
			String tzzd4, String tzzd5, String tzzd6) {
		this.syDkDhgl = syDkDhgl;
		this.jlbh2 = jlbh2;
		this.bgqdkzh = bgqdkzh;
		this.bghdkzh = bghdkzh;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.tzzd4 = tzzd4;
		this.tzzd5 = tzzd5;
		this.tzzd6 = tzzd6;
	}

	// Property accessors

	public Integer getGhdkrzj() {
		return this.ghdkrzj;
	}

	public void setGhdkrzj(Integer ghdkrzj) {
		this.ghdkrzj = ghdkrzj;
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

	public String getBgqdkzh() {
		return this.bgqdkzh;
	}

	public void setBgqdkzh(String bgqdkzh) {
		this.bgqdkzh = bgqdkzh;
	}

	public String getBghdkzh() {
		return this.bghdkzh;
	}

	public void setBghdkzh(String bghdkzh) {
		this.bghdkzh = bghdkzh;
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

	public String getTzzd4() {
		return this.tzzd4;
	}

	public void setTzzd4(String tzzd4) {
		this.tzzd4 = tzzd4;
	}

	public String getTzzd5() {
		return this.tzzd5;
	}

	public void setTzzd5(String tzzd5) {
		this.tzzd5 = tzzd5;
	}

	public String getTzzd6() {
		return this.tzzd6;
	}

	public void setTzzd6(String tzzd6) {
		this.tzzd6 = tzzd6;
	}

}