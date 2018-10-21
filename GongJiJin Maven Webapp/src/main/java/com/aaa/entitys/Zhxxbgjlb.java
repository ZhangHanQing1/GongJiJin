package com.aaa.entitys;

/**
 * Zhxxbgjlb entity. @author MyEclipse Persistence Tools
 */

public class Zhxxbgjlb implements java.io.Serializable {

	// Fields

	private Integer bgjlbh;
	private Dwzh dwzh;
	private Integer xgqdwbl;
	private Integer xgqgrbl;
	private Integer xghgrbl;
	private Integer xghgebl;

	// Constructors

	/** default constructor */
	public Zhxxbgjlb() {
	}

	/** full constructor */
	public Zhxxbgjlb(Dwzh dwzh, Integer xgqdwbl, Integer xgqgrbl, Integer xghgrbl, Integer xghgebl) {
		this.dwzh = dwzh;
		this.xgqdwbl = xgqdwbl;
		this.xgqgrbl = xgqgrbl;
		this.xghgrbl = xghgrbl;
		this.xghgebl = xghgebl;
	}

	// Property accessors

	public Integer getBgjlbh() {
		return this.bgjlbh;
	}

	public void setBgjlbh(Integer bgjlbh) {
		this.bgjlbh = bgjlbh;
	}

	public Dwzh getDwzh() {
		return this.dwzh;
	}

	public void setDwzh(Dwzh dwzh) {
		this.dwzh = dwzh;
	}

	public Integer getXgqdwbl() {
		return this.xgqdwbl;
	}

	public void setXgqdwbl(Integer xgqdwbl) {
		this.xgqdwbl = xgqdwbl;
	}

	public Integer getXgqgrbl() {
		return this.xgqgrbl;
	}

	public void setXgqgrbl(Integer xgqgrbl) {
		this.xgqgrbl = xgqgrbl;
	}

	public Integer getXghgrbl() {
		return this.xghgrbl;
	}

	public void setXghgrbl(Integer xghgrbl) {
		this.xghgrbl = xghgrbl;
	}

	public Integer getXghgebl() {
		return this.xghgebl;
	}

	public void setXghgebl(Integer xghgebl) {
		this.xghgebl = xghgebl;
	}

}