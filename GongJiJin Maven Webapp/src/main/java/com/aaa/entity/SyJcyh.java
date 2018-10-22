package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SyJcyh entity. @author MyEclipse Persistence Tools
 */

public class SyJcyh implements java.io.Serializable {

	// Fields

	private Integer jcyhzj;
	private SySydkyh sySydkyh;
	private SyStyh syStyh;
	private SyTxdkyh syTxdkyh;
	private String yhdm;
	private String yhmc;
	private String yhlhh;
	private String sjyhdm;
	private String tzzd1;
	private String tzzd2;
	private Long wdbh;
	private Set jsxmdkjkhtxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyJcyh() {
	}

	/** minimal constructor */
	public SyJcyh(SySydkyh sySydkyh, String yhdm) {
		this.sySydkyh = sySydkyh;
		this.yhdm = yhdm;
	}

	/** full constructor */
	public SyJcyh(SySydkyh sySydkyh, SyStyh syStyh, SyTxdkyh syTxdkyh, String yhdm, String yhmc, String yhlhh,
			String sjyhdm, String tzzd1, String tzzd2, Long wdbh, Set jsxmdkjkhtxxes) {
		this.sySydkyh = sySydkyh;
		this.syStyh = syStyh;
		this.syTxdkyh = syTxdkyh;
		this.yhdm = yhdm;
		this.yhmc = yhmc;
		this.yhlhh = yhlhh;
		this.sjyhdm = sjyhdm;
		this.tzzd1 = tzzd1;
		this.tzzd2 = tzzd2;
		this.wdbh = wdbh;
		this.jsxmdkjkhtxxes = jsxmdkjkhtxxes;
	}

	// Property accessors

	public Integer getJcyhzj() {
		return this.jcyhzj;
	}

	public void setJcyhzj(Integer jcyhzj) {
		this.jcyhzj = jcyhzj;
	}

	public SySydkyh getSySydkyh() {
		return this.sySydkyh;
	}

	public void setSySydkyh(SySydkyh sySydkyh) {
		this.sySydkyh = sySydkyh;
	}

	public SyStyh getSyStyh() {
		return this.syStyh;
	}

	public void setSyStyh(SyStyh syStyh) {
		this.syStyh = syStyh;
	}

	public SyTxdkyh getSyTxdkyh() {
		return this.syTxdkyh;
	}

	public void setSyTxdkyh(SyTxdkyh syTxdkyh) {
		this.syTxdkyh = syTxdkyh;
	}

	public String getYhdm() {
		return this.yhdm;
	}

	public void setYhdm(String yhdm) {
		this.yhdm = yhdm;
	}

	public String getYhmc() {
		return this.yhmc;
	}

	public void setYhmc(String yhmc) {
		this.yhmc = yhmc;
	}

	public String getYhlhh() {
		return this.yhlhh;
	}

	public void setYhlhh(String yhlhh) {
		this.yhlhh = yhlhh;
	}

	public String getSjyhdm() {
		return this.sjyhdm;
	}

	public void setSjyhdm(String sjyhdm) {
		this.sjyhdm = sjyhdm;
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

	public Long getWdbh() {
		return this.wdbh;
	}

	public void setWdbh(Long wdbh) {
		this.wdbh = wdbh;
	}

	public Set getJsxmdkjkhtxxes() {
		return this.jsxmdkjkhtxxes;
	}

	public void setJsxmdkjkhtxxes(Set jsxmdkjkhtxxes) {
		this.jsxmdkjkhtxxes = jsxmdkjkhtxxes;
	}

}