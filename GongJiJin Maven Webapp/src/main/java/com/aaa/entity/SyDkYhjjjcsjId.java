package com.aaa.entity;

/**
 * SyDkYhjjjcsjId entity. @author MyEclipse Persistence Tools
 */

public class SyDkYhjjjcsjId implements java.io.Serializable {

	// Fields

	private String dkzh;
	private Long jqbj;
	private Long jqlx;
	private Long jyslx;
	private Long wdbh;
	private String yhdm;
	private Long jjrq;

	// Constructors

	/** default constructor */
	public SyDkYhjjjcsjId() {
	}

	/** full constructor */
	public SyDkYhjjjcsjId(String dkzh, Long jqbj, Long jqlx, Long jyslx, Long wdbh, String yhdm, Long jjrq) {
		this.dkzh = dkzh;
		this.jqbj = jqbj;
		this.jqlx = jqlx;
		this.jyslx = jyslx;
		this.wdbh = wdbh;
		this.yhdm = yhdm;
		this.jjrq = jjrq;
	}

	// Property accessors

	public String getDkzh() {
		return this.dkzh;
	}

	public void setDkzh(String dkzh) {
		this.dkzh = dkzh;
	}

	public Long getJqbj() {
		return this.jqbj;
	}

	public void setJqbj(Long jqbj) {
		this.jqbj = jqbj;
	}

	public Long getJqlx() {
		return this.jqlx;
	}

	public void setJqlx(Long jqlx) {
		this.jqlx = jqlx;
	}

	public Long getJyslx() {
		return this.jyslx;
	}

	public void setJyslx(Long jyslx) {
		this.jyslx = jyslx;
	}

	public Long getWdbh() {
		return this.wdbh;
	}

	public void setWdbh(Long wdbh) {
		this.wdbh = wdbh;
	}

	public String getYhdm() {
		return this.yhdm;
	}

	public void setYhdm(String yhdm) {
		this.yhdm = yhdm;
	}

	public Long getJjrq() {
		return this.jjrq;
	}

	public void setJjrq(Long jjrq) {
		this.jjrq = jjrq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SyDkYhjjjcsjId))
			return false;
		SyDkYhjjjcsjId castOther = (SyDkYhjjjcsjId) other;

		return ((this.getDkzh() == castOther.getDkzh()) || (this.getDkzh() != null && castOther.getDkzh() != null
				&& this.getDkzh().equals(castOther.getDkzh())))
				&& ((this.getJqbj() == castOther.getJqbj()) || (this.getJqbj() != null && castOther.getJqbj() != null
						&& this.getJqbj().equals(castOther.getJqbj())))
				&& ((this.getJqlx() == castOther.getJqlx()) || (this.getJqlx() != null && castOther.getJqlx() != null
						&& this.getJqlx().equals(castOther.getJqlx())))
				&& ((this.getJyslx() == castOther.getJyslx()) || (this.getJyslx() != null
						&& castOther.getJyslx() != null && this.getJyslx().equals(castOther.getJyslx())))
				&& ((this.getWdbh() == castOther.getWdbh()) || (this.getWdbh() != null && castOther.getWdbh() != null
						&& this.getWdbh().equals(castOther.getWdbh())))
				&& ((this.getYhdm() == castOther.getYhdm()) || (this.getYhdm() != null && castOther.getYhdm() != null
						&& this.getYhdm().equals(castOther.getYhdm())))
				&& ((this.getJjrq() == castOther.getJjrq()) || (this.getJjrq() != null && castOther.getJjrq() != null
						&& this.getJjrq().equals(castOther.getJjrq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDkzh() == null ? 0 : this.getDkzh().hashCode());
		result = 37 * result + (getJqbj() == null ? 0 : this.getJqbj().hashCode());
		result = 37 * result + (getJqlx() == null ? 0 : this.getJqlx().hashCode());
		result = 37 * result + (getJyslx() == null ? 0 : this.getJyslx().hashCode());
		result = 37 * result + (getWdbh() == null ? 0 : this.getWdbh().hashCode());
		result = 37 * result + (getYhdm() == null ? 0 : this.getYhdm().hashCode());
		result = 37 * result + (getJjrq() == null ? 0 : this.getJjrq().hashCode());
		return result;
	}

}