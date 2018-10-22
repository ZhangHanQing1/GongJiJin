package com.aaa.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Jsxmdkjkhtxx entity. @author MyEclipse Persistence Tools
 */

public class Jsxmdkjkhtxx implements java.io.Serializable {

	// Fields

	private Integer zj;
	private SyJcyh syJcyh;
	private Integer jkhtbh;
	private BigDecimal dkje;
	private BigDecimal dkqx;
	private BigDecimal jkhtll;
	private BigDecimal yqfxll;
	private BigDecimal nyfxll;
	private String zjjgzhzh;
	private String yhdm;
	private String dkfffs;
	private String dkhbfs;
	private String wtr;
	private String wtrqydb;
	private Date wtrqysj;
	private String dkr;
	private String dkrqydb;
	private Date dkrqysj;
	private String jkr;
	private String jkrqydb;
	private Date jkrqysj;
	private Set dbxxes = new HashSet(0);
	private Set grzfdkjkhtxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jsxmdkjkhtxx() {
	}

	/** minimal constructor */
	public Jsxmdkjkhtxx(Integer jkhtbh) {
		this.jkhtbh = jkhtbh;
	}

	/** full constructor */
	public Jsxmdkjkhtxx(SyJcyh syJcyh, Integer jkhtbh, BigDecimal dkje, BigDecimal dkqx, BigDecimal jkhtll,
			BigDecimal yqfxll, BigDecimal nyfxll, String zjjgzhzh, String yhdm, String dkfffs, String dkhbfs,
			String wtr, String wtrqydb, Date wtrqysj, String dkr, String dkrqydb, Date dkrqysj, String jkr,
			String jkrqydb, Date jkrqysj, Set dbxxes, Set grzfdkjkhtxxes) {
		this.syJcyh = syJcyh;
		this.jkhtbh = jkhtbh;
		this.dkje = dkje;
		this.dkqx = dkqx;
		this.jkhtll = jkhtll;
		this.yqfxll = yqfxll;
		this.nyfxll = nyfxll;
		this.zjjgzhzh = zjjgzhzh;
		this.yhdm = yhdm;
		this.dkfffs = dkfffs;
		this.dkhbfs = dkhbfs;
		this.wtr = wtr;
		this.wtrqydb = wtrqydb;
		this.wtrqysj = wtrqysj;
		this.dkr = dkr;
		this.dkrqydb = dkrqydb;
		this.dkrqysj = dkrqysj;
		this.jkr = jkr;
		this.jkrqydb = jkrqydb;
		this.jkrqysj = jkrqysj;
		this.dbxxes = dbxxes;
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

	// Property accessors

	public Integer getZj() {
		return this.zj;
	}

	public void setZj(Integer zj) {
		this.zj = zj;
	}

	public SyJcyh getSyJcyh() {
		return this.syJcyh;
	}

	public void setSyJcyh(SyJcyh syJcyh) {
		this.syJcyh = syJcyh;
	}

	public Integer getJkhtbh() {
		return this.jkhtbh;
	}

	public void setJkhtbh(Integer jkhtbh) {
		this.jkhtbh = jkhtbh;
	}

	public BigDecimal getDkje() {
		return this.dkje;
	}

	public void setDkje(BigDecimal dkje) {
		this.dkje = dkje;
	}

	public BigDecimal getDkqx() {
		return this.dkqx;
	}

	public void setDkqx(BigDecimal dkqx) {
		this.dkqx = dkqx;
	}

	public BigDecimal getJkhtll() {
		return this.jkhtll;
	}

	public void setJkhtll(BigDecimal jkhtll) {
		this.jkhtll = jkhtll;
	}

	public BigDecimal getYqfxll() {
		return this.yqfxll;
	}

	public void setYqfxll(BigDecimal yqfxll) {
		this.yqfxll = yqfxll;
	}

	public BigDecimal getNyfxll() {
		return this.nyfxll;
	}

	public void setNyfxll(BigDecimal nyfxll) {
		this.nyfxll = nyfxll;
	}

	public String getZjjgzhzh() {
		return this.zjjgzhzh;
	}

	public void setZjjgzhzh(String zjjgzhzh) {
		this.zjjgzhzh = zjjgzhzh;
	}

	public String getYhdm() {
		return this.yhdm;
	}

	public void setYhdm(String yhdm) {
		this.yhdm = yhdm;
	}

	public String getDkfffs() {
		return this.dkfffs;
	}

	public void setDkfffs(String dkfffs) {
		this.dkfffs = dkfffs;
	}

	public String getDkhbfs() {
		return this.dkhbfs;
	}

	public void setDkhbfs(String dkhbfs) {
		this.dkhbfs = dkhbfs;
	}

	public String getWtr() {
		return this.wtr;
	}

	public void setWtr(String wtr) {
		this.wtr = wtr;
	}

	public String getWtrqydb() {
		return this.wtrqydb;
	}

	public void setWtrqydb(String wtrqydb) {
		this.wtrqydb = wtrqydb;
	}

	public Date getWtrqysj() {
		return this.wtrqysj;
	}

	public void setWtrqysj(Date wtrqysj) {
		this.wtrqysj = wtrqysj;
	}

	public String getDkr() {
		return this.dkr;
	}

	public void setDkr(String dkr) {
		this.dkr = dkr;
	}

	public String getDkrqydb() {
		return this.dkrqydb;
	}

	public void setDkrqydb(String dkrqydb) {
		this.dkrqydb = dkrqydb;
	}

	public Date getDkrqysj() {
		return this.dkrqysj;
	}

	public void setDkrqysj(Date dkrqysj) {
		this.dkrqysj = dkrqysj;
	}

	public String getJkr() {
		return this.jkr;
	}

	public void setJkr(String jkr) {
		this.jkr = jkr;
	}

	public String getJkrqydb() {
		return this.jkrqydb;
	}

	public void setJkrqydb(String jkrqydb) {
		this.jkrqydb = jkrqydb;
	}

	public Date getJkrqysj() {
		return this.jkrqysj;
	}

	public void setJkrqysj(Date jkrqysj) {
		this.jkrqysj = jkrqysj;
	}

	public Set getDbxxes() {
		return this.dbxxes;
	}

	public void setDbxxes(Set dbxxes) {
		this.dbxxes = dbxxes;
	}

	public Set getGrzfdkjkhtxxes() {
		return this.grzfdkjkhtxxes;
	}

	public void setGrzfdkjkhtxxes(Set grzfdkjkhtxxes) {
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

}