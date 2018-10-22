package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Dwzhzt entity. @author MyEclipse Persistence Tools
 */

public class Dwzhzt implements java.io.Serializable {

	// Fields

	private Integer dwzhztbh;
	private String dwzhztmc;
	private Set grzhxxes = new HashSet(0);
	private Set dwzhs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dwzhzt() {
	}

	/** full constructor */
	public Dwzhzt(String dwzhztmc, Set grzhxxes, Set dwzhs) {
		this.dwzhztmc = dwzhztmc;
		this.grzhxxes = grzhxxes;
		this.dwzhs = dwzhs;
	}

	// Property accessors

	public Integer getDwzhztbh() {
		return this.dwzhztbh;
	}

	public void setDwzhztbh(Integer dwzhztbh) {
		this.dwzhztbh = dwzhztbh;
	}

	public String getDwzhztmc() {
		return this.dwzhztmc;
	}

	public void setDwzhztmc(String dwzhztmc) {
		this.dwzhztmc = dwzhztmc;
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