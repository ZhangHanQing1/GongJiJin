package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Jsztb entity. @author MyEclipse Persistence Tools
 */

public class Jsztb implements java.io.Serializable {

	// Fields

	private Integer jsztbh;
	private String ztmc;
	private Set dwywmxbs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jsztb() {
	}

	/** full constructor */
	public Jsztb(String ztmc, Set dwywmxbs) {
		this.ztmc = ztmc;
		this.dwywmxbs = dwywmxbs;
	}

	// Property accessors

	public Integer getJsztbh() {
		return this.jsztbh;
	}

	public void setJsztbh(Integer jsztbh) {
		this.jsztbh = jsztbh;
	}

	public String getZtmc() {
		return this.ztmc;
	}

	public void setZtmc(String ztmc) {
		this.ztmc = ztmc;
	}

	public Set getDwywmxbs() {
		return this.dwywmxbs;
	}

	public void setDwywmxbs(Set dwywmxbs) {
		this.dwywmxbs = dwywmxbs;
	}

}