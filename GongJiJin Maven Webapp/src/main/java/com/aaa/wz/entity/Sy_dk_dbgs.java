package com.aaa.wz.entity;

import java.util.Date;

public class Sy_dk_dbgs {
    private Integer dbgszj;

    private String dbgsbh;

    private String dbgsmc;

    private String dbgsdz;

    private String lxr;

    private String lxdz;

    private String ztz;

    private String cjr;

    private Date cjsj;

    public Integer getDbgszj() {
        return dbgszj;
    }

    public void setDbgszj(Integer dbgszj) {
        this.dbgszj = dbgszj;
    }

    public String getDbgsbh() {
        return dbgsbh;
    }

    public void setDbgsbh(String dbgsbh) {
        this.dbgsbh = dbgsbh == null ? null : dbgsbh.trim();
    }

    public String getDbgsmc() {
        return dbgsmc;
    }

    public void setDbgsmc(String dbgsmc) {
        this.dbgsmc = dbgsmc == null ? null : dbgsmc.trim();
    }

    public String getDbgsdz() {
        return dbgsdz;
    }

    public void setDbgsdz(String dbgsdz) {
        this.dbgsdz = dbgsdz == null ? null : dbgsdz.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz == null ? null : lxdz.trim();
    }

    public String getZtz() {
        return ztz;
    }

    public void setZtz(String ztz) {
        this.ztz = ztz == null ? null : ztz.trim();
    }

    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr == null ? null : cjr.trim();
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}