package com.aaa.entitys;

import java.util.HashSet;
import java.util.Set;

/**
 * Dwlxb entity. @author MyEclipse Persistence Tools
 */

public class Dwlxb implements java.io.Serializable {

	// Fields

	private Integer dwlxbh;
	private String dwlxmc;
	private Set dwzhs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dwlxb() {
	}

	/** full constructor */
	public Dwlxb(String dwlxmc, Set dwzhs) {
		this.dwlxmc = dwlxmc;
		this.dwzhs = dwzhs;
	}

	// Property accessors

	public Integer getDwlxbh() {
		return this.dwlxbh;
	}

	public void setDwlxbh(Integer dwlxbh) {
		this.dwlxbh = dwlxbh;
	}

	public String getDwlxmc() {
		return this.dwlxmc;
	}

	public void setDwlxmc(String dwlxmc) {
		this.dwlxmc = dwlxmc;
	}

	public Set getDwzhs() {
		return this.dwzhs;
	}

	public void setDwzhs(Set dwzhs) {
		this.dwzhs = dwzhs;
	}

}