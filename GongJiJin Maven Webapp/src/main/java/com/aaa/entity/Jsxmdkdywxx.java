package com.aaa.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Jsxmdkdywxx entity. @author MyEclipse Persistence Tools
 */

public class Jsxmdkdywxx implements java.io.Serializable {

	// Fields

	private Integer dywzj;
	private Jsxmxx jsxmxx;
	private BigDecimal dyhtbh;
	private BigDecimal xmbh;
	private String dywlx;
	private String dywmc;
	private String dywqszmbh;
	private String dywcs;
	private Date dyqjlrq;
	private Date dyqjcrq;
	private BigDecimal dywpgjz;
	private BigDecimal ydyjz;
	private BigDecimal dyl;
	private Set dbxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jsxmdkdywxx() {
	}

	/** minimal constructor */
	public Jsxmdkdywxx(BigDecimal dyhtbh) {
		this.dyhtbh = dyhtbh;
	}

	/** full constructor */
	public Jsxmdkdywxx(Jsxmxx jsxmxx, BigDecimal dyhtbh, BigDecimal xmbh, String dywlx, String dywmc, String dywqszmbh,
			String dywcs, Date dyqjlrq, Date dyqjcrq, BigDecimal dywpgjz, BigDecimal ydyjz, BigDecimal dyl,
			Set dbxxes) {
		this.jsxmxx = jsxmxx;
		this.dyhtbh = dyhtbh;
		this.xmbh = xmbh;
		this.dywlx = dywlx;
		this.dywmc = dywmc;
		this.dywqszmbh = dywqszmbh;
		this.dywcs = dywcs;
		this.dyqjlrq = dyqjlrq;
		this.dyqjcrq = dyqjcrq;
		this.dywpgjz = dywpgjz;
		this.ydyjz = ydyjz;
		this.dyl = dyl;
		this.dbxxes = dbxxes;
	}

	// Property accessors

	public Integer getDywzj() {
		return this.dywzj;
	}

	public void setDywzj(Integer dywzj) {
		this.dywzj = dywzj;
	}

	public Jsxmxx getJsxmxx() {
		return this.jsxmxx;
	}

	public void setJsxmxx(Jsxmxx jsxmxx) {
		this.jsxmxx = jsxmxx;
	}

	public BigDecimal getDyhtbh() {
		return this.dyhtbh;
	}

	public void setDyhtbh(BigDecimal dyhtbh) {
		this.dyhtbh = dyhtbh;
	}

	public BigDecimal getXmbh() {
		return this.xmbh;
	}

	public void setXmbh(BigDecimal xmbh) {
		this.xmbh = xmbh;
	}

	public String getDywlx() {
		return this.dywlx;
	}

	public void setDywlx(String dywlx) {
		this.dywlx = dywlx;
	}

	public String getDywmc() {
		return this.dywmc;
	}

	public void setDywmc(String dywmc) {
		this.dywmc = dywmc;
	}

	public String getDywqszmbh() {
		return this.dywqszmbh;
	}

	public void setDywqszmbh(String dywqszmbh) {
		this.dywqszmbh = dywqszmbh;
	}

	public String getDywcs() {
		return this.dywcs;
	}

	public void setDywcs(String dywcs) {
		this.dywcs = dywcs;
	}

	public Date getDyqjlrq() {
		return this.dyqjlrq;
	}

	public void setDyqjlrq(Date dyqjlrq) {
		this.dyqjlrq = dyqjlrq;
	}

	public Date getDyqjcrq() {
		return this.dyqjcrq;
	}

	public void setDyqjcrq(Date dyqjcrq) {
		this.dyqjcrq = dyqjcrq;
	}

	public BigDecimal getDywpgjz() {
		return this.dywpgjz;
	}

	public void setDywpgjz(BigDecimal dywpgjz) {
		this.dywpgjz = dywpgjz;
	}

	public BigDecimal getYdyjz() {
		return this.ydyjz;
	}

	public void setYdyjz(BigDecimal ydyjz) {
		this.ydyjz = ydyjz;
	}

	public BigDecimal getDyl() {
		return this.dyl;
	}

	public void setDyl(BigDecimal dyl) {
		this.dyl = dyl;
	}

	public Set getDbxxes() {
		return this.dbxxes;
	}

	public void setDbxxes(Set dbxxes) {
		this.dbxxes = dbxxes;
	}

}