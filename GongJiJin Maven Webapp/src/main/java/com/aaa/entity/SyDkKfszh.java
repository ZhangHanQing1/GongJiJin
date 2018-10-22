package com.aaa.entity;

/**
 * SyDkKfszh entity. @author MyEclipse Persistence Tools
 */

public class SyDkKfszh implements java.io.Serializable {

	// Fields

	private SyDkKfszhId id;

	// Constructors

	/** default constructor */
	public SyDkKfszh() {
	}

	/** full constructor */
	public SyDkKfszh(SyDkKfszhId id) {
		this.id = id;
	}

	// Property accessors

	public SyDkKfszhId getId() {
		return this.id;
	}

	public void setId(SyDkKfszhId id) {
		this.id = id;
	}

}