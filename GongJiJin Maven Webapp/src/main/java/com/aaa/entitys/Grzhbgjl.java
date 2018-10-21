package com.aaa.entitys;

import java.math.BigDecimal;

/**
 * Grzhbgjl entity. @author MyEclipse Persistence Tools
 */

public class Grzhbgjl implements java.io.Serializable {

	// Fields

	private Integer bgzh;
	private Grzhxx grzhxx;
	private BigDecimal xgqgzjs;
	private BigDecimal xghgzjs;

	// Constructors

	/** default constructor */
	public Grzhbgjl() {
	}

	/** full constructor */
	public Grzhbgjl(Grzhxx grzhxx, BigDecimal xgqgzjs, BigDecimal xghgzjs) {
		this.grzhxx = grzhxx;
		this.xgqgzjs = xgqgzjs;
		this.xghgzjs = xghgzjs;
	}

	// Property accessors

	public Integer getBgzh() {
		return this.bgzh;
	}

	public void setBgzh(Integer bgzh) {
		this.bgzh = bgzh;
	}

	public Grzhxx getGrzhxx() {
		return this.grzhxx;
	}

	public void setGrzhxx(Grzhxx grzhxx) {
		this.grzhxx = grzhxx;
	}

	public BigDecimal getXgqgzjs() {
		return this.xgqgzjs;
	}

	public void setXgqgzjs(BigDecimal xgqgzjs) {
		this.xgqgzjs = xgqgzjs;
	}

	public BigDecimal getXghgzjs() {
		return this.xghgzjs;
	}

	public void setXghgzjs(BigDecimal xghgzjs) {
		this.xghgzjs = xghgzjs;
	}

}