package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Zjlxb entity. @author MyEclipse Persistence Tools
 */

public class Zjlxb implements java.io.Serializable {

	// Fields

	private Integer zjlxbh;
	private String zjmc;
	private Set grzhxxes = new HashSet(0);
	private Set dwzhs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Zjlxb() {
	}

	/** full constructor */
	public Zjlxb(String zjmc, Set grzhxxes, Set dwzhs) {
		this.zjmc = zjmc;
		this.grzhxxes = grzhxxes;
		this.dwzhs = dwzhs;
	}

	// Property accessors

	public Integer getZjlxbh() {
		return this.zjlxbh;
	}

	public void setZjlxbh(Integer zjlxbh) {
		this.zjlxbh = zjlxbh;
	}

	public String getZjmc() {
		return this.zjmc;
	}

	public void setZjmc(String zjmc) {
		this.zjmc = zjmc;
	}

	public Set getGrzhxxes() {
		return this.grzhxxes;
	}

	public void setGrzhxxes(Set grzhxxes) {
		this.grzhxxes = grzhxxes;
	}

	public Set getDwzhs() {
		return this.dwzhs;
	}

	public void setDwzhs(Set dwzhs) {
		this.dwzhs = dwzhs;
	}

}