package com.aaa.entitys;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Dwywmxb entity. @author MyEclipse Persistence Tools
 */

public class Dwywmxb implements java.io.Serializable {

	// Fields

	private Integer dwywlsh;
	private Hjfs hjfs;
	private Dwzh dwzh;
	private Jsztb jsztb;
	private String ywblrq;
	private BigDecimal fse3;
	private Integer fsrs;
	private String hbcjny;
	private BigDecimal zckfse;
	private Date jzrq3;
	private String cjr3;
	private Date cjsj3;
	private String bz;
	private String sfgxjjny;
	private Set grywmxxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dwywmxb() {
	}

	/** full constructor */
	public Dwywmxb(Hjfs hjfs, Dwzh dwzh, Jsztb jsztb, String ywblrq, BigDecimal fse3, Integer fsrs, String hbcjny,
			BigDecimal zckfse, Date jzrq3, String cjr3, Date cjsj3, String bz, String sfgxjjny, Set grywmxxxes) {
		this.hjfs = hjfs;
		this.dwzh = dwzh;
		this.jsztb = jsztb;
		this.ywblrq = ywblrq;
		this.fse3 = fse3;
		this.fsrs = fsrs;
		this.hbcjny = hbcjny;
		this.zckfse = zckfse;
		this.jzrq3 = jzrq3;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.bz = bz;
		this.sfgxjjny = sfgxjjny;
		this.grywmxxxes = grywmxxxes;
	}

	// Property accessors

	public Integer getDwywlsh() {
		return this.dwywlsh;
	}

	public void setDwywlsh(Integer dwywlsh) {
		this.dwywlsh = dwywlsh;
	}

	public Hjfs getHjfs() {
		return this.hjfs;
	}

	public void setHjfs(Hjfs hjfs) {
		this.hjfs = hjfs;
	}

	public Dwzh getDwzh() {
		return this.dwzh;
	}

	public void setDwzh(Dwzh dwzh) {
		this.dwzh = dwzh;
	}

	public Jsztb getJsztb() {
		return this.jsztb;
	}

	public void setJsztb(Jsztb jsztb) {
		this.jsztb = jsztb;
	}

	public String getYwblrq() {
		return this.ywblrq;
	}

	public void setYwblrq(String ywblrq) {
		this.ywblrq = ywblrq;
	}

	public BigDecimal getFse3() {
		return this.fse3;
	}

	public void setFse3(BigDecimal fse3) {
		this.fse3 = fse3;
	}

	public Integer getFsrs() {
		return this.fsrs;
	}

	public void setFsrs(Integer fsrs) {
		this.fsrs = fsrs;
	}

	public String getHbcjny() {
		return this.hbcjny;
	}

	public void setHbcjny(String hbcjny) {
		this.hbcjny = hbcjny;
	}

	public BigDecimal getZckfse() {
		return this.zckfse;
	}

	public void setZckfse(BigDecimal zckfse) {
		this.zckfse = zckfse;
	}

	public Date getJzrq3() {
		return this.jzrq3;
	}

	public void setJzrq3(Date jzrq3) {
		this.jzrq3 = jzrq3;
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

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSfgxjjny() {
		return this.sfgxjjny;
	}

	public void setSfgxjjny(String sfgxjjny) {
		this.sfgxjjny = sfgxjjny;
	}

	public Set getGrywmxxxes() {
		return this.grywmxxxes;
	}

	public void setGrywmxxxes(Set grywmxxxes) {
		this.grywmxxxes = grywmxxxes;
	}

}