package com.aaa.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Dwzh entity. @author MyEclipse Persistence Tools
 */

public class Dwzh implements java.io.Serializable {

	// Fields

	private Integer dwbh;
	private Dwlxb dwlxb;
	private Jjlx jjlx;
	private SysUser sysUser;
	private Dwzhzt dwzhzt;
	private Zjlxb zjlxb;
	private Sshyb sshyb;
	private SyStyh syStyh;
	private String dwzh3;
	private Integer dwjcbl;
	private Integer grjcbl;
	private Integer dwjcrs;
	private BigDecimal dwzhye;
	private String dwxhrq;
	private String dwxhyy;
	private String jznyr;
	private BigDecimal qjje;
	private String qjys;
	private BigDecimal zckye;
	private String dwmc2;
	private String dwdz;
	private String frxm;
	private String fxr;
	private String jbrxm;
	private Integer jbrdh;
	private String gsclrq;
	private String jgdm;
	private String dwkhrq;
	private String dwxz;
	private Integer dwdh;
	private Set grzhxxes = new HashSet(0);
	private Set dwywmxbs = new HashSet(0);
	private Set zhxxbgjlbs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dwzh() {
	}

	/** full constructor */
	public Dwzh(Dwlxb dwlxb, Jjlx jjlx, SysUser sysUser, Dwzhzt dwzhzt, Zjlxb zjlxb, Sshyb sshyb, SyStyh syStyh,
			String dwzh3, Integer dwjcbl, Integer grjcbl, Integer dwjcrs, BigDecimal dwzhye, String dwxhrq,
			String dwxhyy, String jznyr, BigDecimal qjje, String qjys, BigDecimal zckye, String dwmc2, String dwdz,
			String frxm, String fxr, String jbrxm, Integer jbrdh, String gsclrq, String jgdm, String dwkhrq,
			String dwxz, Integer dwdh, Set grzhxxes, Set dwywmxbs, Set zhxxbgjlbs) {
		this.dwlxb = dwlxb;
		this.jjlx = jjlx;
		this.sysUser = sysUser;
		this.dwzhzt = dwzhzt;
		this.zjlxb = zjlxb;
		this.sshyb = sshyb;
		this.syStyh = syStyh;
		this.dwzh3 = dwzh3;
		this.dwjcbl = dwjcbl;
		this.grjcbl = grjcbl;
		this.dwjcrs = dwjcrs;
		this.dwzhye = dwzhye;
		this.dwxhrq = dwxhrq;
		this.dwxhyy = dwxhyy;
		this.jznyr = jznyr;
		this.qjje = qjje;
		this.qjys = qjys;
		this.zckye = zckye;
		this.dwmc2 = dwmc2;
		this.dwdz = dwdz;
		this.frxm = frxm;
		this.fxr = fxr;
		this.jbrxm = jbrxm;
		this.jbrdh = jbrdh;
		this.gsclrq = gsclrq;
		this.jgdm = jgdm;
		this.dwkhrq = dwkhrq;
		this.dwxz = dwxz;
		this.dwdh = dwdh;
		this.grzhxxes = grzhxxes;
		this.dwywmxbs = dwywmxbs;
		this.zhxxbgjlbs = zhxxbgjlbs;
	}

	// Property accessors

	public Integer getDwbh() {
		return this.dwbh;
	}

	public void setDwbh(Integer dwbh) {
		this.dwbh = dwbh;
	}

	public Dwlxb getDwlxb() {
		return this.dwlxb;
	}

	public void setDwlxb(Dwlxb dwlxb) {
		this.dwlxb = dwlxb;
	}

	public Jjlx getJjlx() {
		return this.jjlx;
	}

	public void setJjlx(Jjlx jjlx) {
		this.jjlx = jjlx;
	}

	public SysUser getSysUser() {
		return this.sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public Dwzhzt getDwzhzt() {
		return this.dwzhzt;
	}

	public void setDwzhzt(Dwzhzt dwzhzt) {
		this.dwzhzt = dwzhzt;
	}

	public Zjlxb getZjlxb() {
		return this.zjlxb;
	}

	public void setZjlxb(Zjlxb zjlxb) {
		this.zjlxb = zjlxb;
	}

	public Sshyb getSshyb() {
		return this.sshyb;
	}

	public void setSshyb(Sshyb sshyb) {
		this.sshyb = sshyb;
	}

	public SyStyh getSyStyh() {
		return this.syStyh;
	}

	public void setSyStyh(SyStyh syStyh) {
		this.syStyh = syStyh;
	}

	public String getDwzh3() {
		return this.dwzh3;
	}

	public void setDwzh3(String dwzh3) {
		this.dwzh3 = dwzh3;
	}

	public Integer getDwjcbl() {
		return this.dwjcbl;
	}

	public void setDwjcbl(Integer dwjcbl) {
		this.dwjcbl = dwjcbl;
	}

	public Integer getGrjcbl() {
		return this.grjcbl;
	}

	public void setGrjcbl(Integer grjcbl) {
		this.grjcbl = grjcbl;
	}

	public Integer getDwjcrs() {
		return this.dwjcrs;
	}

	public void setDwjcrs(Integer dwjcrs) {
		this.dwjcrs = dwjcrs;
	}

	public BigDecimal getDwzhye() {
		return this.dwzhye;
	}

	public void setDwzhye(BigDecimal dwzhye) {
		this.dwzhye = dwzhye;
	}

	public String getDwxhrq() {
		return this.dwxhrq;
	}

	public void setDwxhrq(String dwxhrq) {
		this.dwxhrq = dwxhrq;
	}

	public String getDwxhyy() {
		return this.dwxhyy;
	}

	public void setDwxhyy(String dwxhyy) {
		this.dwxhyy = dwxhyy;
	}

	public String getJznyr() {
		return this.jznyr;
	}

	public void setJznyr(String jznyr) {
		this.jznyr = jznyr;
	}

	public BigDecimal getQjje() {
		return this.qjje;
	}

	public void setQjje(BigDecimal qjje) {
		this.qjje = qjje;
	}

	public String getQjys() {
		return this.qjys;
	}

	public void setQjys(String qjys) {
		this.qjys = qjys;
	}

	public BigDecimal getZckye() {
		return this.zckye;
	}

	public void setZckye(BigDecimal zckye) {
		this.zckye = zckye;
	}

	public String getDwmc2() {
		return this.dwmc2;
	}

	public void setDwmc2(String dwmc2) {
		this.dwmc2 = dwmc2;
	}

	public String getDwdz() {
		return this.dwdz;
	}

	public void setDwdz(String dwdz) {
		this.dwdz = dwdz;
	}

	public String getFrxm() {
		return this.frxm;
	}

	public void setFrxm(String frxm) {
		this.frxm = frxm;
	}

	public String getFxr() {
		return this.fxr;
	}

	public void setFxr(String fxr) {
		this.fxr = fxr;
	}

	public String getJbrxm() {
		return this.jbrxm;
	}

	public void setJbrxm(String jbrxm) {
		this.jbrxm = jbrxm;
	}

	public Integer getJbrdh() {
		return this.jbrdh;
	}

	public void setJbrdh(Integer jbrdh) {
		this.jbrdh = jbrdh;
	}

	public String getGsclrq() {
		return this.gsclrq;
	}

	public void setGsclrq(String gsclrq) {
		this.gsclrq = gsclrq;
	}

	public String getJgdm() {
		return this.jgdm;
	}

	public void setJgdm(String jgdm) {
		this.jgdm = jgdm;
	}

	public String getDwkhrq() {
		return this.dwkhrq;
	}

	public void setDwkhrq(String dwkhrq) {
		this.dwkhrq = dwkhrq;
	}

	public String getDwxz() {
		return this.dwxz;
	}

	public void setDwxz(String dwxz) {
		this.dwxz = dwxz;
	}

	public Integer getDwdh() {
		return this.dwdh;
	}

	public void setDwdh(Integer dwdh) {
		this.dwdh = dwdh;
	}

	public Set getGrzhxxes() {
		return this.grzhxxes;
	}

	public void setGrzhxxes(Set grzhxxes) {
		this.grzhxxes = grzhxxes;
	}

	public Set getDwywmxbs() {
		return this.dwywmxbs;
	}

	public void setDwywmxbs(Set dwywmxbs) {
		this.dwywmxbs = dwywmxbs;
	}

	public Set getZhxxbgjlbs() {
		return this.zhxxbgjlbs;
	}

	public void setZhxxbgjlbs(Set zhxxbgjlbs) {
		this.zhxxbgjlbs = zhxxbgjlbs;
	}

}