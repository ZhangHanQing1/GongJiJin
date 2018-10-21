package com.aaa.entitys;

import java.util.HashSet;
import java.util.Set;

/**
 * Jjlx entity. @author MyEclipse Persistence Tools
 */

public class Jjlx implements java.io.Serializable {

	// Fields

	private Integer jjlxbh;
	private String jjlxmc;
	private Set dwzhs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jjlx() {
	}

	/** full constructor */
	public Jjlx(String jjlxmc, Set dwzhs) {
		this.jjlxmc = jjlxmc;
		this.dwzhs = dwzhs;
	}

	// Property accessors

	public Integer getJjlxbh() {
		return this.jjlxbh;
	}

	public void setJjlxbh(Integer jjlxbh) {
		this.jjlxbh = jjlxbh;
	}

	public String getJjlxmc() {
		return this.jjlxmc;
	}

	public void setJjlxmc(String jjlxmc) {
		this.jjlxmc = jjlxmc;
	}

	public Set getDwzhs() {
		return this.dwzhs;
	}

	public void setDwzhs(Set dwzhs) {
		this.dwzhs = dwzhs;
	}

}