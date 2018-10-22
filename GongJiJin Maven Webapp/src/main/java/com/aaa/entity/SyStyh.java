package com.aaa.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyStyh entity. @author MyEclipse Persistence Tools
 */

public class SyStyh implements java.io.Serializable {

	// Fields

	private Integer styhzj;
	private String styhdm;
	private String styhmc;
	private String jcyhdm;
	private String cbyw;
	private String ztz;
	private String cjr3;
	private Date cjsj3;
	private String tzzd4;
	private String tzzd5;
	private String tzzd6;
	private String yhjdh;
	private BigDecimal wdbh3;
	private Set grzfdkjkhtxxes = new HashSet(0);
	private Set dwzhs = new HashSet(0);
	private Set syJcyhs = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyStyh() {
	}

	/** full constructor */
	public SyStyh(String styhdm, String styhmc, String jcyhdm, String cbyw, String ztz, String cjr3, Date cjsj3,
			String tzzd4, String tzzd5, String tzzd6, String yhjdh, BigDecimal wdbh3, Set grzfdkjkhtxxes, Set dwzhs,
			Set syJcyhs) {
		this.styhdm = styhdm;
		this.styhmc = styhmc;
		this.jcyhdm = jcyhdm;
		this.cbyw = cbyw;
		this.ztz = ztz;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.tzzd4 = tzzd4;
		this.tzzd5 = tzzd5;
		this.tzzd6 = tzzd6;
		this.yhjdh = yhjdh;
		this.wdbh3 = wdbh3;
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
		this.dwzhs = dwzhs;
		this.syJcyhs = syJcyhs;
	}

	// Property accessors

	public Integer getStyhzj() {
		return this.styhzj;
	}

	public void setStyhzj(Integer styhzj) {
		this.styhzj = styhzj;
	}

	public String getStyhdm() {
		return this.styhdm;
	}

	public void setStyhdm(String styhdm) {
		this.styhdm = styhdm;
	}

	public String getStyhmc() {
		return this.styhmc;
	}

	public void setStyhmc(String styhmc) {
		this.styhmc = styhmc;
	}

	public String getJcyhdm() {
		return this.jcyhdm;
	}

	public void setJcyhdm(String jcyhdm) {
		this.jcyhdm = jcyhdm;
	}

	public String getCbyw() {
		return this.cbyw;
	}

	public void setCbyw(String cbyw) {
		this.cbyw = cbyw;
	}

	public String getZtz() {
		return this.ztz;
	}

	public void setZtz(String ztz) {
		this.ztz = ztz;
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

	public String getYhjdh() {
		return this.yhjdh;
	}

	public void setYhjdh(String yhjdh) {
		this.yhjdh = yhjdh;
	}

	public BigDecimal getWdbh3() {
		return this.wdbh3;
	}

	public void setWdbh3(BigDecimal wdbh3) {
		this.wdbh3 = wdbh3;
	}

	public Set getGrzfdkjkhtxxes() {
		return this.grzfdkjkhtxxes;
	}

	public void setGrzfdkjkhtxxes(Set grzfdkjkhtxxes) {
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

	public Set getDwzhs() {
		return this.dwzhs;
	}

	public void setDwzhs(Set dwzhs) {
		this.dwzhs = dwzhs;
	}

	public Set getSyJcyhs() {
		return this.syJcyhs;
	}

	public void setSyJcyhs(Set syJcyhs) {
		this.syJcyhs = syJcyhs;
	}

}