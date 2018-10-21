package com.aaa.entitys;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyDkBzxx entity. @author MyEclipse Persistence Tools
 */

public class SyDkBzxx implements java.io.Serializable {

	// Fields

	private Integer bzxxzj;
	private String xxbh;
	private String bzhtbh;
	private String bzjgmc;
	private String dkbzj;
	private Date fhbzjrq;
	private String beiz;
	private String ztz;
	private String tzzd1;
	private String tzzd2;
	private Set dbxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyDkBzxx() {
	}

	/** full constructor */
	public SyDkBzxx(String xxbh, String bzhtbh, String bzjgmc, String dkbzj, Date fhbzjrq, String beiz, String ztz,
			String tzzd1, String tzzd2, Set dbxxes) {
		this.xxbh = xxbh;
		this.bzhtbh = bzhtbh;
		this.bzjgmc = bzjgmc;
		this.dkbzj = dkbzj;
		this.fhbzjrq = fhbzjrq;
		this.beiz = beiz;
		this.ztz = ztz;
		this.tzzd1 = tzzd1;
		this.tzzd2 = tzzd2;
		this.dbxxes = dbxxes;
	}

	// Property accessors

	public Integer getBzxxzj() {
		return this.bzxxzj;
	}

	public void setBzxxzj(Integer bzxxzj) {
		this.bzxxzj = bzxxzj;
	}

	public String getXxbh() {
		return this.xxbh;
	}

	public void setXxbh(String xxbh) {
		this.xxbh = xxbh;
	}

	public String getBzhtbh() {
		return this.bzhtbh;
	}

	public void setBzhtbh(String bzhtbh) {
		this.bzhtbh = bzhtbh;
	}

	public String getBzjgmc() {
		return this.bzjgmc;
	}

	public void setBzjgmc(String bzjgmc) {
		this.bzjgmc = bzjgmc;
	}

	public String getDkbzj() {
		return this.dkbzj;
	}

	public void setDkbzj(String dkbzj) {
		this.dkbzj = dkbzj;
	}

	public Date getFhbzjrq() {
		return this.fhbzjrq;
	}

	public void setFhbzjrq(Date fhbzjrq) {
		this.fhbzjrq = fhbzjrq;
	}

	public String getBeiz() {
		return this.beiz;
	}

	public void setBeiz(String beiz) {
		this.beiz = beiz;
	}

	public String getZtz() {
		return this.ztz;
	}

	public void setZtz(String ztz) {
		this.ztz = ztz;
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

	public Set getDbxxes() {
		return this.dbxxes;
	}

	public void setDbxxes(Set dbxxes) {
		this.dbxxes = dbxxes;
	}

}