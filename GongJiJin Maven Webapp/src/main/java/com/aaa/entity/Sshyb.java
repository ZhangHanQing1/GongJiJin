package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Sshyb entity. @author MyEclipse Persistence Tools
 */

public class Sshyb implements java.io.Serializable {

	// Fields

	private Integer hybh;
	private String hymc;
	private Set dwzhs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sshyb() {
	}

	/** full constructor */
	public Sshyb(String hymc, Set dwzhs) {
		this.hymc = hymc;
		this.dwzhs = dwzhs;
	}

	// Property accessors

	public Integer getHybh() {
		return this.hybh;
	}

	public void setHybh(Integer hybh) {
		this.hybh = hybh;
	}

	public String getHymc() {
		return this.hymc;
	}

	public void setHymc(String hymc) {
		this.hymc = hymc;
	}

	public Set getDwzhs() {
		return this.dwzhs;
	}

	public void setDwzhs(Set dwzhs) {
		this.dwzhs = dwzhs;
	}

}