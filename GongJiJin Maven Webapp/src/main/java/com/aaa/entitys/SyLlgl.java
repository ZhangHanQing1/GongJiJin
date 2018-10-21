package com.aaa.entitys;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyLlgl entity. @author MyEclipse Persistence Tools
 */

public class SyLlgl implements java.io.Serializable {

	// Fields

	private Integer llzj;
	private String llbh;
	private String lllx;
	private BigDecimal zxll;
	private Date qsrq;
	private Date jzrq3;
	private String cjr3;
	private Date cjsj3;
	private Set grzfdkjkhtxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyLlgl() {
	}

	/** full constructor */
	public SyLlgl(String llbh, String lllx, BigDecimal zxll, Date qsrq, Date jzrq3, String cjr3, Date cjsj3,
			Set grzfdkjkhtxxes) {
		this.llbh = llbh;
		this.lllx = lllx;
		this.zxll = zxll;
		this.qsrq = qsrq;
		this.jzrq3 = jzrq3;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

	// Property accessors

	public Integer getLlzj() {
		return this.llzj;
	}

	public void setLlzj(Integer llzj) {
		this.llzj = llzj;
	}

	public String getLlbh() {
		return this.llbh;
	}

	public void setLlbh(String llbh) {
		this.llbh = llbh;
	}

	public String getLllx() {
		return this.lllx;
	}

	public void setLllx(String lllx) {
		this.lllx = lllx;
	}

	public BigDecimal getZxll() {
		return this.zxll;
	}

	public void setZxll(BigDecimal zxll) {
		this.zxll = zxll;
	}

	public Date getQsrq() {
		return this.qsrq;
	}

	public void setQsrq(Date qsrq) {
		this.qsrq = qsrq;
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

	public Set getGrzfdkjkhtxxes() {
		return this.grzfdkjkhtxxes;
	}

	public void setGrzfdkjkhtxxes(Set grzfdkjkhtxxes) {
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

}