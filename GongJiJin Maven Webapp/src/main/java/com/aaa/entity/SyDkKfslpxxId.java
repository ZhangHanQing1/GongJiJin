package com.aaa.entity;

import java.util.Date;

/**
 * SyDkKfslpxxId entity. @author MyEclipse Persistence Tools
 */

public class SyDkKfslpxxId implements java.io.Serializable {

	// Fields

	private String kfsbh;
	private String lpbh;
	private String lpmc;
	private String lpwz;
	private String jzjg;
	private String tzzd1;
	private String tzzd2;
	private String tzzd3;
	private String cjr;
	private Date cjsj;
	private String lpbah;

	// Constructors

	/** default constructor */
	public SyDkKfslpxxId() {
	}

	/** full constructor */
	public SyDkKfslpxxId(String kfsbh, String lpbh, String lpmc, String lpwz, String jzjg, String tzzd1, String tzzd2,
			String tzzd3, String cjr, Date cjsj, String lpbah) {
		this.kfsbh = kfsbh;
		this.lpbh = lpbh;
		this.lpmc = lpmc;
		this.lpwz = lpwz;
		this.jzjg = jzjg;
		this.tzzd1 = tzzd1;
		this.tzzd2 = tzzd2;
		this.tzzd3 = tzzd3;
		this.cjr = cjr;
		this.cjsj = cjsj;
		this.lpbah = lpbah;
	}

	// Property accessors

	public String getKfsbh() {
		return this.kfsbh;
	}

	public void setKfsbh(String kfsbh) {
		this.kfsbh = kfsbh;
	}

	public String getLpbh() {
		return this.lpbh;
	}

	public void setLpbh(String lpbh) {
		this.lpbh = lpbh;
	}

	public String getLpmc() {
		return this.lpmc;
	}

	public void setLpmc(String lpmc) {
		this.lpmc = lpmc;
	}

	public String getLpwz() {
		return this.lpwz;
	}

	public void setLpwz(String lpwz) {
		this.lpwz = lpwz;
	}

	public String getJzjg() {
		return this.jzjg;
	}

	public void setJzjg(String jzjg) {
		this.jzjg = jzjg;
	}

	public String getTzzd1() {
		return this.tzzd1;
	}

	public void setTzzd1(String tzzd1) {
		this.tzzd1 = tzzd1;
	}

	public String getTzzd2() {
		return this.tzzd2;
	}

	public void setTzzd2(String tzzd2) {
		this.tzzd2 = tzzd2;
	}

	public String getTzzd3() {
		return this.tzzd3;
	}

	public void setTzzd3(String tzzd3) {
		this.tzzd3 = tzzd3;
	}

	public String getCjr() {
		return this.cjr;
	}

	public void setCjr(String cjr) {
		this.cjr = cjr;
	}

	public Date getCjsj() {
		return this.cjsj;
	}

	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}

	public String getLpbah() {
		return this.lpbah;
	}

	public void setLpbah(String lpbah) {
		this.lpbah = lpbah;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SyDkKfslpxxId))
			return false;
		SyDkKfslpxxId castOther = (SyDkKfslpxxId) other;

		return ((this.getKfsbh() == castOther.getKfsbh()) || (this.getKfsbh() != null && castOther.getKfsbh() != null
				&& this.getKfsbh().equals(castOther.getKfsbh())))
				&& ((this.getLpbh() == castOther.getLpbh()) || (this.getLpbh() != null && castOther.getLpbh() != null
						&& this.getLpbh().equals(castOther.getLpbh())))
				&& ((this.getLpmc() == castOther.getLpmc()) || (this.getLpmc() != null && castOther.getLpmc() != null
						&& this.getLpmc().equals(castOther.getLpmc())))
				&& ((this.getLpwz() == castOther.getLpwz()) || (this.getLpwz() != null && castOther.getLpwz() != null
						&& this.getLpwz().equals(castOther.getLpwz())))
				&& ((this.getJzjg() == castOther.getJzjg()) || (this.getJzjg() != null && castOther.getJzjg() != null
						&& this.getJzjg().equals(castOther.getJzjg())))
				&& ((this.getTzzd1() == castOther.getTzzd1()) || (this.getTzzd1() != null
						&& castOther.getTzzd1() != null && this.getTzzd1().equals(castOther.getTzzd1())))
				&& ((this.getTzzd2() == castOther.getTzzd2()) || (this.getTzzd2() != null
						&& castOther.getTzzd2() != null && this.getTzzd2().equals(castOther.getTzzd2())))
				&& ((this.getTzzd3() == castOther.getTzzd3()) || (this.getTzzd3() != null
						&& castOther.getTzzd3() != null && this.getTzzd3().equals(castOther.getTzzd3())))
				&& ((this.getCjr() == castOther.getCjr()) || (this.getCjr() != null && castOther.getCjr() != null
						&& this.getCjr().equals(castOther.getCjr())))
				&& ((this.getCjsj() == castOther.getCjsj()) || (this.getCjsj() != null && castOther.getCjsj() != null
						&& this.getCjsj().equals(castOther.getCjsj())))
				&& ((this.getLpbah() == castOther.getLpbah()) || (this.getLpbah() != null
						&& castOther.getLpbah() != null && this.getLpbah().equals(castOther.getLpbah())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getKfsbh() == null ? 0 : this.getKfsbh().hashCode());
		result = 37 * result + (getLpbh() == null ? 0 : this.getLpbh().hashCode());
		result = 37 * result + (getLpmc() == null ? 0 : this.getLpmc().hashCode());
		result = 37 * result + (getLpwz() == null ? 0 : this.getLpwz().hashCode());
		result = 37 * result + (getJzjg() == null ? 0 : this.getJzjg().hashCode());
		result = 37 * result + (getTzzd1() == null ? 0 : this.getTzzd1().hashCode());
		result = 37 * result + (getTzzd2() == null ? 0 : this.getTzzd2().hashCode());
		result = 37 * result + (getTzzd3() == null ? 0 : this.getTzzd3().hashCode());
		result = 37 * result + (getCjr() == null ? 0 : this.getCjr().hashCode());
		result = 37 * result + (getCjsj() == null ? 0 : this.getCjsj().hashCode());
		result = 37 * result + (getLpbah() == null ? 0 : this.getLpbah().hashCode());
		return result;
	}

}