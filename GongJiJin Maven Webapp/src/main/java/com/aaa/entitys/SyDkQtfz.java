package com.aaa.entitys;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SyDkQtfz entity. @author MyEclipse Persistence Tools
 */

public class SyDkQtfz implements java.io.Serializable {

	// Fields

	private Integer fzbh;
	private String jkhtbh;
	private String jkrgjjzh;
	private String jtgxdm;
	private Date dkffrq;
	private Date dkdqrq;
	private BigDecimal htje;
	private BigDecimal dkye;
	private BigDecimal dqyqqs;
	private BigDecimal wghbx90;
	private BigDecimal wghbx180;
	private String cjr3;
	private Date cjsj3;
	private Set grzfdkjkhtxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public SyDkQtfz() {
	}

	/** full constructor */
	public SyDkQtfz(String jkhtbh, String jkrgjjzh, String jtgxdm, Date dkffrq, Date dkdqrq, BigDecimal htje,
			BigDecimal dkye, BigDecimal dqyqqs, BigDecimal wghbx90, BigDecimal wghbx180, String cjr3, Date cjsj3,
			Set grzfdkjkhtxxes) {
		this.jkhtbh = jkhtbh;
		this.jkrgjjzh = jkrgjjzh;
		this.jtgxdm = jtgxdm;
		this.dkffrq = dkffrq;
		this.dkdqrq = dkdqrq;
		this.htje = htje;
		this.dkye = dkye;
		this.dqyqqs = dqyqqs;
		this.wghbx90 = wghbx90;
		this.wghbx180 = wghbx180;
		this.cjr3 = cjr3;
		this.cjsj3 = cjsj3;
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

	// Property accessors

	public Integer getFzbh() {
		return this.fzbh;
	}

	public void setFzbh(Integer fzbh) {
		this.fzbh = fzbh;
	}

	public String getJkhtbh() {
		return this.jkhtbh;
	}

	public void setJkhtbh(String jkhtbh) {
		this.jkhtbh = jkhtbh;
	}

	public String getJkrgjjzh() {
		return this.jkrgjjzh;
	}

	public void setJkrgjjzh(String jkrgjjzh) {
		this.jkrgjjzh = jkrgjjzh;
	}

	public String getJtgxdm() {
		return this.jtgxdm;
	}

	public void setJtgxdm(String jtgxdm) {
		this.jtgxdm = jtgxdm;
	}

	public Date getDkffrq() {
		return this.dkffrq;
	}

	public void setDkffrq(Date dkffrq) {
		this.dkffrq = dkffrq;
	}

	public Date getDkdqrq() {
		return this.dkdqrq;
	}

	public void setDkdqrq(Date dkdqrq) {
		this.dkdqrq = dkdqrq;
	}

	public BigDecimal getHtje() {
		return this.htje;
	}

	public void setHtje(BigDecimal htje) {
		this.htje = htje;
	}

	public BigDecimal getDkye() {
		return this.dkye;
	}

	public void setDkye(BigDecimal dkye) {
		this.dkye = dkye;
	}

	public BigDecimal getDqyqqs() {
		return this.dqyqqs;
	}

	public void setDqyqqs(BigDecimal dqyqqs) {
		this.dqyqqs = dqyqqs;
	}

	public BigDecimal getWghbx90() {
		return this.wghbx90;
	}

	public void setWghbx90(BigDecimal wghbx90) {
		this.wghbx90 = wghbx90;
	}

	public BigDecimal getWghbx180() {
		return this.wghbx180;
	}

	public void setWghbx180(BigDecimal wghbx180) {
		this.wghbx180 = wghbx180;
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