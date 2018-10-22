package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SySydkyh entity. @author MyEclipse Persistence Tools
 */

public class SySydkyh implements java.io.Serializable {

	// Fields

	private Integer syyhzj;
	private String syyhbh;
	private String skfkhyhdm;
	private String skfkhyhmc;
	private String jcyhdm;
	private String skfzh;
	private String skfhm;
	private String ztz;
	private String cjr;
	private Date cjsj;
	private String tzzd1;
	private String tzzd2;
	private String tzzd3;
	private Set syJcyhs = new HashSet(0);

	// Constructors

	/** default constructor */
	public SySydkyh() {
	}

	/** full constructor */
	public SySydkyh(String syyhbh, String skfkhyhdm, String skfkhyhmc, String jcyhdm, String skfzh, String skfhm,
			String ztz, String cjr, Date cjsj, String tzzd1, String tzzd2, String tzzd3, Set syJcyhs) {
		this.syyhbh = syyhbh;
		this.skfkhyhdm = skfkhyhdm;
		this.skfkhyhmc = skfkhyhmc;
		this.jcyhdm = jcyhdm;
		this.skfzh = skfzh;
		this.skfhm = skfhm;
		this.ztz = ztz;
		this.cjr = cjr;
		this.cjsj = cjsj;
		this.tzzd1 = tzzd1;
		this.tzzd2 = tzzd2;
		this.tzzd3 = tzzd3;
		this.syJcyhs = syJcyhs;
	}

	// Property accessors

	public Integer getSyyhzj() {
		return this.syyhzj;
	}

	public void setSyyhzj(Integer syyhzj) {
		this.syyhzj = syyhzj;
	}

	public String getSyyhbh() {
		return this.syyhbh;
	}

	public void setSyyhbh(String syyhbh) {
		this.syyhbh = syyhbh;
	}

	public String getSkfkhyhdm() {
		return this.skfkhyhdm;
	}

	public void setSkfkhyhdm(String skfkhyhdm) {
		this.skfkhyhdm = skfkhyhdm;
	}

	public String getSkfkhyhmc() {
		return this.skfkhyhmc;
	}

	public void setSkfkhyhmc(String skfkhyhmc) {
		this.skfkhyhmc = skfkhyhmc;
	}

	public String getJcyhdm() {
		return this.jcyhdm;
	}

	public void setJcyhdm(String jcyhdm) {
		this.jcyhdm = jcyhdm;
	}

	public String getSkfzh() {
		return this.skfzh;
	}

	public void setSkfzh(String skfzh) {
		this.skfzh = skfzh;
	}

	public String getSkfhm() {
		return this.skfhm;
	}

	public void setSkfhm(String skfhm) {
		this.skfhm = skfhm;
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

	public Set getSyJcyhs() {
		return this.syJcyhs;
	}

	public void setSyJcyhs(Set syJcyhs) {
		this.syJcyhs = syJcyhs;
	}

}