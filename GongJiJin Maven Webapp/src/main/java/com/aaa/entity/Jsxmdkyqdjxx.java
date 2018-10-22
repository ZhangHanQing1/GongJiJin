package com.aaa.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Jsxmdkyqdjxx entity. @author MyEclipse Persistence Tools
 */

public class Jsxmdkyqdjxx implements java.io.Serializable {

	// Fields

	private Integer xmzj;
	private SyDkDhgl syDkDhgl;
	private BigDecimal xmbh;
	private BigDecimal yqbj;
	private BigDecimal yqlx;
	private BigDecimal yqfx;
	private Date ssrq;
	private BigDecimal ssyqbj;
	private BigDecimal ssyqlx;
	private BigDecimal ssyqfx;

	// Constructors

	/** default constructor */
	public Jsxmdkyqdjxx() {
	}

	/** full constructor */
	public Jsxmdkyqdjxx(SyDkDhgl syDkDhgl, BigDecimal xmbh, BigDecimal yqbj, BigDecimal yqlx, BigDecimal yqfx,
			Date ssrq, BigDecimal ssyqbj, BigDecimal ssyqlx, BigDecimal ssyqfx) {
		this.syDkDhgl = syDkDhgl;
		this.xmbh = xmbh;
		this.yqbj = yqbj;
		this.yqlx = yqlx;
		this.yqfx = yqfx;
		this.ssrq = ssrq;
		this.ssyqbj = ssyqbj;
		this.ssyqlx = ssyqlx;
		this.ssyqfx = ssyqfx;
	}

	// Property accessors

	public Integer getXmzj() {
		return this.xmzj;
	}

	public void setXmzj(Integer xmzj) {
		this.xmzj = xmzj;
	}

	public SyDkDhgl getSyDkDhgl() {
		return this.syDkDhgl;
	}

	public void setSyDkDhgl(SyDkDhgl syDkDhgl) {
		this.syDkDhgl = syDkDhgl;
	}

	public BigDecimal getXmbh() {
		return this.xmbh;
	}

	public void setXmbh(BigDecimal xmbh) {
		this.xmbh = xmbh;
	}

	public BigDecimal getYqbj() {
		return this.yqbj;
	}

	public void setYqbj(BigDecimal yqbj) {
		this.yqbj = yqbj;
	}

	public BigDecimal getYqlx() {
		return this.yqlx;
	}

	public void setYqlx(BigDecimal yqlx) {
		this.yqlx = yqlx;
	}

	public BigDecimal getYqfx() {
		return this.yqfx;
	}

	public void setYqfx(BigDecimal yqfx) {
		this.yqfx = yqfx;
	}

	public Date getSsrq() {
		return this.ssrq;
	}

	public void setSsrq(Date ssrq) {
		this.ssrq = ssrq;
	}

	public BigDecimal getSsyqbj() {
		return this.ssyqbj;
	}

	public void setSsyqbj(BigDecimal ssyqbj) {
		this.ssyqbj = ssyqbj;
	}

	public BigDecimal getSsyqlx() {
		return this.ssyqlx;
	}

	public void setSsyqlx(BigDecimal ssyqlx) {
		this.ssyqlx = ssyqlx;
	}

	public BigDecimal getSsyqfx() {
		return this.ssyqfx;
	}

	public void setSsyqfx(BigDecimal ssyqfx) {
		this.ssyqfx = ssyqfx;
	}

}