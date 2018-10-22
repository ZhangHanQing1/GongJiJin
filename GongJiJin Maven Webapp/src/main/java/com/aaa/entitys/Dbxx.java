package com.aaa.entitys;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Dbxx entity. @author MyEclipse Persistence Tools
 */

public class Dbxx implements java.io.Serializable {

	// Fields

	private Integer dbxxzj;
	private Jsxmdkdywxx jsxmdkdywxx;
	private SyDkDyxx syDkDyxx;
	private SyDkDbgs syDkDbgs;
	private SyDkBzxx syDkBzxx;
	private SyDkZyxx syDkZyxx;
	private Jsxmdkjkhtxx jsxmdkjkhtxx;
	
	private String dbhtbh;
	private String jkhtbh;
	private String dkdblx;
	private String dbjgmc;
	private String dywqzh;
	private String dywfwzl;
	private Date dyqjlrq;
	private Date dyqjcrq;
	private Long dywpgjz;
	private String bzhtbh;
	private String bzjgmc;
	private Long dkbzj;
	private Date fhbzjrq;
	private String zyhtbh;
	private String zywbh;
	private String zywmc;
	private Long zywje;
	private Date zyhtksrq;
	private Date zyhtjsrq;
	private String dbzt;
	private String dyhtbh;
	private Set grzfdkjkhtxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dbxx() {
	}

	/** minimal constructor */
	public Dbxx(String dbhtbh) {
		this.dbhtbh = dbhtbh;
	}

	/** full constructor */
	public Dbxx(Jsxmdkdywxx jsxmdkdywxx, SyDkDyxx syDkDyxx, SyDkDbgs syDkDbgs, SyDkBzxx syDkBzxx, SyDkZyxx syDkZyxx,
			Jsxmdkjkhtxx jsxmdkjkhtxx, String dbhtbh, String jkhtbh, String dkdblx, String dbjgmc, String dywqzh,
			String dywfwzl, Date dyqjlrq, Date dyqjcrq, Long dywpgjz, String bzhtbh, String bzjgmc, Long dkbzj,
			Date fhbzjrq, String zyhtbh, String zywbh, String zywmc, Long zywje, Date zyhtksrq, Date zyhtjsrq,
			String dbzt, String dyhtbh, Set grzfdkjkhtxxes) {
		this.jsxmdkdywxx = jsxmdkdywxx;
		this.syDkDyxx = syDkDyxx;
		this.syDkDbgs = syDkDbgs;
		this.syDkBzxx = syDkBzxx;
		this.syDkZyxx = syDkZyxx;
		this.jsxmdkjkhtxx = jsxmdkjkhtxx;
		this.dbhtbh = dbhtbh;
		this.jkhtbh = jkhtbh;
		this.dkdblx = dkdblx;
		this.dbjgmc = dbjgmc;
		this.dywqzh = dywqzh;
		this.dywfwzl = dywfwzl;
		this.dyqjlrq = dyqjlrq;
		this.dyqjcrq = dyqjcrq;
		this.dywpgjz = dywpgjz;
		this.bzhtbh = bzhtbh;
		this.bzjgmc = bzjgmc;
		this.dkbzj = dkbzj;
		this.fhbzjrq = fhbzjrq;
		this.zyhtbh = zyhtbh;
		this.zywbh = zywbh;
		this.zywmc = zywmc;
		this.zywje = zywje;
		this.zyhtksrq = zyhtksrq;
		this.zyhtjsrq = zyhtjsrq;
		this.dbzt = dbzt;
		this.dyhtbh = dyhtbh;
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

	// Property accessors

	public Integer getDbxxzj() {
		return this.dbxxzj;
	}

	public void setDbxxzj(Integer dbxxzj) {
		this.dbxxzj = dbxxzj;
	}

	public Jsxmdkdywxx getJsxmdkdywxx() {
		return this.jsxmdkdywxx;
	}

	public void setJsxmdkdywxx(Jsxmdkdywxx jsxmdkdywxx) {
		this.jsxmdkdywxx = jsxmdkdywxx;
	}

	public SyDkDyxx getSyDkDyxx() {
		return this.syDkDyxx;
	}

	public void setSyDkDyxx(SyDkDyxx syDkDyxx) {
		this.syDkDyxx = syDkDyxx;
	}

	public SyDkDbgs getSyDkDbgs() {
		return this.syDkDbgs;
	}

	public void setSyDkDbgs(SyDkDbgs syDkDbgs) {
		this.syDkDbgs = syDkDbgs;
	}

	public SyDkBzxx getSyDkBzxx() {
		return this.syDkBzxx;
	}

	public void setSyDkBzxx(SyDkBzxx syDkBzxx) {
		this.syDkBzxx = syDkBzxx;
	}

	public SyDkZyxx getSyDkZyxx() {
		return this.syDkZyxx;
	}

	public void setSyDkZyxx(SyDkZyxx syDkZyxx) {
		this.syDkZyxx = syDkZyxx;
	}

	public Jsxmdkjkhtxx getJsxmdkjkhtxx() {
		return this.jsxmdkjkhtxx;
	}

	public void setJsxmdkjkhtxx(Jsxmdkjkhtxx jsxmdkjkhtxx) {
		this.jsxmdkjkhtxx = jsxmdkjkhtxx;
	}

	public String getDbhtbh() {
		return this.dbhtbh;
	}

	public void setDbhtbh(String dbhtbh) {
		this.dbhtbh = dbhtbh;
	}

	public String getJkhtbh() {
		return this.jkhtbh;
	}

	public void setJkhtbh(String jkhtbh) {
		this.jkhtbh = jkhtbh;
	}

	public String getDkdblx() {
		return this.dkdblx;
	}

	public void setDkdblx(String dkdblx) {
		this.dkdblx = dkdblx;
	}

	public String getDbjgmc() {
		return this.dbjgmc;
	}

	public void setDbjgmc(String dbjgmc) {
		this.dbjgmc = dbjgmc;
	}

	public String getDywqzh() {
		return this.dywqzh;
	}

	public void setDywqzh(String dywqzh) {
		this.dywqzh = dywqzh;
	}

	public String getDywfwzl() {
		return this.dywfwzl;
	}

	public void setDywfwzl(String dywfwzl) {
		this.dywfwzl = dywfwzl;
	}

	public Date getDyqjlrq() {
		return this.dyqjlrq;
	}

	public void setDyqjlrq(Date dyqjlrq) {
		this.dyqjlrq = dyqjlrq;
	}

	public Date getDyqjcrq() {
		return this.dyqjcrq;
	}

	public void setDyqjcrq(Date dyqjcrq) {
		this.dyqjcrq = dyqjcrq;
	}

	public Long getDywpgjz() {
		return this.dywpgjz;
	}

	public void setDywpgjz(Long dywpgjz) {
		this.dywpgjz = dywpgjz;
	}

	public String getBzhtbh() {
		return this.bzhtbh;
	}

	public void setBzhtbh(String bzhtbh) {
		this.bzhtbh = bzhtbh;
	}

	public String getBzjgmc() {
		return this.bzjgmc;
	}

	public void setBzjgmc(String bzjgmc) {
		this.bzjgmc = bzjgmc;
	}

	public Long getDkbzj() {
		return this.dkbzj;
	}

	public void setDkbzj(Long dkbzj) {
		this.dkbzj = dkbzj;
	}

	public Date getFhbzjrq() {
		return this.fhbzjrq;
	}

	public void setFhbzjrq(Date fhbzjrq) {
		this.fhbzjrq = fhbzjrq;
	}

	public String getZyhtbh() {
		return this.zyhtbh;
	}

	public void setZyhtbh(String zyhtbh) {
		this.zyhtbh = zyhtbh;
	}

	public String getZywbh() {
		return this.zywbh;
	}

	public void setZywbh(String zywbh) {
		this.zywbh = zywbh;
	}

	public String getZywmc() {
		return this.zywmc;
	}

	public void setZywmc(String zywmc) {
		this.zywmc = zywmc;
	}

	public Long getZywje() {
		return this.zywje;
	}

	public void setZywje(Long zywje) {
		this.zywje = zywje;
	}

	public Date getZyhtksrq() {
		return this.zyhtksrq;
	}

	public void setZyhtksrq(Date zyhtksrq) {
		this.zyhtksrq = zyhtksrq;
	}

	public Date getZyhtjsrq() {
		return this.zyhtjsrq;
	}

	public void setZyhtjsrq(Date zyhtjsrq) {
		this.zyhtjsrq = zyhtjsrq;
	}

	public String getDbzt() {
		return this.dbzt;
	}

	public void setDbzt(String dbzt) {
		this.dbzt = dbzt;
	}

	public String getDyhtbh() {
		return this.dyhtbh;
	}

	public void setDyhtbh(String dyhtbh) {
		this.dyhtbh = dyhtbh;
	}

	public Set getGrzfdkjkhtxxes() {
		return this.grzfdkjkhtxxes;
	}

	public void setGrzfdkjkhtxxes(Set grzfdkjkhtxxes) {
		this.grzfdkjkhtxxes = grzfdkjkhtxxes;
	}

}