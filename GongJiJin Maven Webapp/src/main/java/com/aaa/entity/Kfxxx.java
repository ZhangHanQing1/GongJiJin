package com.aaa.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Kfxxx entity. @author MyEclipse Persistence Tools
 */

public class Kfxxx implements java.io.Serializable {

	// Fields

	private Integer kfszj;
	private String kfsbh;
	private String kfsdz;
	private String kfsmc;
	private String dwfrdbxm;
	private String dwfrzjlx;
	private String dwfrzjhm;
	private String dwyb;
	private String gddhhm2;
	private String tzzd4;
	private String tzzd5;
	private String tzzd6;
	private String cjr3;
	private Date cjsj3;
	private String dwdzxx;
	private BigDecimal wdbh3;
	private Set grzfdkjkhtxxes = new HashSet(0);
	private Set dkkdlpxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Kfxxx() {
	}

	/** full constructor */
	public Kfxxx(String kfsbh, String kfsdz, String kfsmc, String dwfrdbxm, String dwfrzjlx, String dwfrzjhm,
			String dwyb, String gddhhm2, String tzzd4, String tzzd5, String tzzd6, String cjr3, Date cjsj3,
			String dwdzxx, BigDecimal wdbh3, Set grzfdkjkhtxxes, Set dkkdlpxxes) {
		this.kfsbh = kfsbh;
		this.kfsdz = kfsdz;
		this.kfsmc = kfsmc;
		this.dwfrdbxm = dwfrdbxm;
		this.dwfrzjlx = dwfrzjlx;
		this.dwfrzjhm = dwfrzjhm;
		this.dwyb = dwyb;
		this.gddhhm2 = gddhhm2;
		this.tzzd4 = tzzd4;
		this.tzzd5 = tzzd5;
		this.tzzd6 = tzzd6;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.dwdzxx = dwdzxx;
		this.wdbh3 = wdbh3;
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
		this.dkkdlpxxes = dkkdlpxxes;
	}

	// Property accessors

	public Integer getKfszj() {
		return this.kfszj;
	}

	public void setKfszj(Integer kfszj) {
		this.kfszj = kfszj;
	}

	public String getKfsbh() {
		return this.kfsbh;
	}

	public void setKfsbh(String kfsbh) {
		this.kfsbh = kfsbh;
	}

	public String getKfsdz() {
		return this.kfsdz;
	}

	public void setKfsdz(String kfsdz) {
		this.kfsdz = kfsdz;
	}

	public String getKfsmc() {
		return this.kfsmc;
	}

	public void setKfsmc(String kfsmc) {
		this.kfsmc = kfsmc;
	}

	public String getDwfrdbxm() {
		return this.dwfrdbxm;
	}

	public void setDwfrdbxm(String dwfrdbxm) {
		this.dwfrdbxm = dwfrdbxm;
	}

	public String getDwfrzjlx() {
		return this.dwfrzjlx;
	}

	public void setDwfrzjlx(String dwfrzjlx) {
		this.dwfrzjlx = dwfrzjlx;
	}

	public String getDwfrzjhm() {
		return this.dwfrzjhm;
	}

	public void setDwfrzjhm(String dwfrzjhm) {
		this.dwfrzjhm = dwfrzjhm;
	}

	public String getDwyb() {
		return this.dwyb;
	}

	public void setDwyb(String dwyb) {
		this.dwyb = dwyb;
	}

	public String getGddhhm2() {
		return this.gddhhm2;
	}

	public void setGddhhm2(String gddhhm2) {
		this.gddhhm2 = gddhhm2;
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

	public String getDwdzxx() {
		return this.dwdzxx;
	}

	public void setDwdzxx(String dwdzxx) {
		this.dwdzxx = dwdzxx;
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

	public Set getDkkdlpxxes() {
		return this.dkkdlpxxes;
	}

	public void setDkkdlpxxes(Set dkkdlpxxes) {
		this.dkkdlpxxes = dkkdlpxxes;
	}

}