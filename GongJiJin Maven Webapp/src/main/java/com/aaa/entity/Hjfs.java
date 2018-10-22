package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Hjfs entity. @author MyEclipse Persistence Tools
 */

public class Hjfs implements java.io.Serializable {

	// Fields

	private Integer jjbh;
	private String jjmc;
	private Set dwywmxbs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Hjfs() {
	}

	/** full constructor */
	public Hjfs(String jjmc, Set dwywmxbs) {
		this.jjmc = jjmc;
		this.dwywmxbs = dwywmxbs;
	}

	// Property accessors

	public Integer getJjbh() {
		return this.jjbh;
	}

	public void setJjbh(Integer jjbh) {
		this.jjbh = jjbh;
	}

	public String getJjmc() {
		return this.jjmc;
	}

	public void setJjmc(String jjmc) {
		this.jjmc = jjmc;
	}

	public Set getDwywmxbs() {
		return this.dwywmxbs;
	}

	public void setDwywmxbs(Set dwywmxbs) {
		this.dwywmxbs = dwywmxbs;
	}

}