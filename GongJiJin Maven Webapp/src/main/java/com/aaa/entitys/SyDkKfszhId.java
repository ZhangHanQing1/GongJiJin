package com.aaa.entitys;

import java.util.Date;

/**
 * SyDkKfszhId entity. @author MyEclipse Persistence Tools
 */

public class SyDkKfszhId implements java.io.Serializable {

	// Fields

	private String zhbh;
	private String kfsbh;
	private String skyhdm;
	private String skyhmc;
	private String skyhzh;
	private String skyhhm;
	private String tzzd1;
	private String tzzd2;
	private String tzzd3;
	private String cjr;
	private Date cjsj;

	// Constructors

	/** default constructor */
	public SyDkKfszhId() {
	}

	/** full constructor */
	public SyDkKfszhId(String zhbh, String kfsbh, String skyhdm, String skyhmc, String skyhzh, String skyhhm,
			String tzzd1, String tzzd2, String tzzd3, String cjr, Date cjsj) {
		this.zhbh = zhbh;
		this.kfsbh = kfsbh;
		this.skyhdm = skyhdm;
		this.skyhmc = skyhmc;
		this.skyhzh = skyhzh;
		this.skyhhm = skyhhm;
		this.tzzd1 = tzzd1;
		this.tzzd2 = tzzd2;
		this.tzzd3 = tzzd3;
		this.cjr = cjr;
		this.cjsj = cjsj;
	}

	// Property accessors

	public String getZhbh() {
		return this.zhbh;
	}

	public void setZhbh(String zhbh) {
		this.zhbh = zhbh;
	}

	public String getKfsbh() {
		return this.kfsbh;
	}

	public void setKfsbh(String kfsbh) {
		this.kfsbh = kfsbh;
	}

	public String getSkyhdm() {
		return this.skyhdm;
	}

	public void setSkyhdm(String skyhdm) {
		this.skyhdm = skyhdm;
	}

	public String getSkyhmc() {
		return this.skyhmc;
	}

	public void setSkyhmc(String skyhmc) {
		this.skyhmc = skyhmc;
	}

	public String getSkyhzh() {
		return this.skyhzh;
	}

	public void setSkyhzh(String skyhzh) {
		this.skyhzh = skyhzh;
	}

	public String getSkyhhm() {
		return this.skyhhm;
	}

	public void setSkyhhm(String skyhhm) {
		this.skyhhm = skyhhm;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SyDkKfszhId))
			return false;
		SyDkKfszhId castOther = (SyDkKfszhId) other;

		return ((this.getZhbh() == castOther.getZhbh()) || (this.getZhbh() != null && castOther.getZhbh() != null
				&& this.getZhbh().equals(castOther.getZhbh())))
				&& ((this.getKfsbh() == castOther.getKfsbh()) || (this.getKfsbh() != null
						&& castOther.getKfsbh() != null && this.getKfsbh().equals(castOther.getKfsbh())))
				&& ((this.getSkyhdm() == castOther.getSkyhdm()) || (this.getSkyhdm() != null
						&& castOther.getSkyhdm() != null && this.getSkyhdm().equals(castOther.getSkyhdm())))
				&& ((this.getSkyhmc() == castOther.getSkyhmc()) || (this.getSkyhmc() != null
						&& castOther.getSkyhmc() != null && this.getSkyhmc().equals(castOther.getSkyhmc())))
				&& ((this.getSkyhzh() == castOther.getSkyhzh()) || (this.getSkyhzh() != null
						&& castOther.getSkyhzh() != null && this.getSkyhzh().equals(castOther.getSkyhzh())))
				&& ((this.getSkyhhm() == castOther.getSkyhhm()) || (this.getSkyhhm() != null
						&& castOther.getSkyhhm() != null && this.getSkyhhm().equals(castOther.getSkyhhm())))
				&& ((this.getTzzd1() == castOther.getTzzd1()) || (this.getTzzd1() != null
						&& castOther.getTzzd1() != null && this.getTzzd1().equals(castOther.getTzzd1())))
				&& ((this.getTzzd2() == castOther.getTzzd2()) || (this.getTzzd2() != null
						&& castOther.getTzzd2() != null && this.getTzzd2().equals(castOther.getTzzd2())))
				&& ((this.getTzzd3() == castOther.getTzzd3()) || (this.getTzzd3() != null
						&& castOther.getTzzd3() != null && this.getTzzd3().equals(castOther.getTzzd3())))
				&& ((this.getCjr() == castOther.getCjr()) || (this.getCjr() != null && castOther.getCjr() != null
						&& this.getCjr().equals(castOther.getCjr())))
				&& ((this.getCjsj() == castOther.getCjsj()) || (this.getCjsj() != null && castOther.getCjsj() != null
						&& this.getCjsj().equals(castOther.getCjsj())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getZhbh() == null ? 0 : this.getZhbh().hashCode());
		result = 37 * result + (getKfsbh() == null ? 0 : this.getKfsbh().hashCode());
		result = 37 * result + (getSkyhdm() == null ? 0 : this.getSkyhdm().hashCode());
		result = 37 * result + (getSkyhmc() == null ? 0 : this.getSkyhmc().hashCode());
		result = 37 * result + (getSkyhzh() == null ? 0 : this.getSkyhzh().hashCode());
		result = 37 * result + (getSkyhhm() == null ? 0 : this.getSkyhhm().hashCode());
		result = 37 * result + (getTzzd1() == null ? 0 : this.getTzzd1().hashCode());
		result = 37 * result + (getTzzd2() == null ? 0 : this.getTzzd2().hashCode());
		result = 37 * result + (getTzzd3() == null ? 0 : this.getTzzd3().hashCode());
		result = 37 * result + (getCjr() == null ? 0 : this.getCjr().hashCode());
		result = 37 * result + (getCjsj() == null ? 0 : this.getCjsj().hashCode());
		return result;
	}

}