package com.aaa.entitys;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyDkDbgs entity. @author MyEclipse Persistence Tools
 */

public class SyDkDbgs implements java.io.Serializable {

	// Fields

	private Integer dbgszj;
	private String dbgsbh;
	private String dbgsmc;
	private String dbgsdz;
	private String lxr;
	private String lxdz;
	private String ztz;
	private String cjr;
	private Date cjsj;
	private Set dbxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyDkDbgs() {
	}

	/** minimal constructor */
	public SyDkDbgs(String dbgsbh) {
		this.dbgsbh = dbgsbh;
	}

	/** full constructor */
	public SyDkDbgs(String dbgsbh, String dbgsmc, String dbgsdz, String lxr, String lxdz, String ztz, String cjr,
			Date cjsj, Set dbxxes) {
		this.dbgsbh = dbgsbh;
		this.dbgsmc = dbgsmc;
		this.dbgsdz = dbgsdz;
		this.lxr = lxr;
		this.lxdz = lxdz;
		this.ztz = ztz;
		this.cjr = cjr;
		this.cjsj = cjsj;
		this.dbxxes = dbxxes;
	}

	// Property accessors

	public Integer getDbgszj() {
		return this.dbgszj;
	}

	public void setDbgszj(Integer dbgszj) {
		this.dbgszj = dbgszj;
	}

	public String getDbgsbh() {
		return this.dbgsbh;
	}

	public void setDbgsbh(String dbgsbh) {
		this.dbgsbh = dbgsbh;
	}

	public String getDbgsmc() {
		return this.dbgsmc;
	}

	public void setDbgsmc(String dbgsmc) {
		this.dbgsmc = dbgsmc;
	}

	public String getDbgsdz() {
		return this.dbgsdz;
	}

	public void setDbgsdz(String dbgsdz) {
		this.dbgsdz = dbgsdz;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getLxdz() {
		return this.lxdz;
	}

	public void setLxdz(String lxdz) {
		this.lxdz = lxdz;
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

	public Set getDbxxes() {
		return this.dbxxes;
	}

	public void setDbxxes(Set dbxxes) {
		this.dbxxes = dbxxes;
	}

}