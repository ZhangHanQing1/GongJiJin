package com.aaa.wz.entity;

public class Sy_dk_dhgl {
    private Integer dhglzj;

    private Integer hkjhzj;

    private String dkzh;

    private String qtcsjl;

    private String dxcsjl;

    private String dhcsjl;

    public Integer getDhglzj() {
        return dhglzj;
    }

    public void setDhglzj(Integer dhglzj) {
        this.dhglzj = dhglzj;
    }

    public Integer getHkjhzj() {
        return hkjhzj;
    }

    public void setHkjhzj(Integer hkjhzj) {
        this.hkjhzj = hkjhzj;
    }

    public String getDkzh() {
        return dkzh;
    }

    public void setDkzh(String dkzh) {
        this.dkzh = dkzh == null ? null : dkzh.trim();
    }

    public String getQtcsjl() {
        return qtcsjl;
    }

    public void setQtcsjl(String qtcsjl) {
        this.qtcsjl = qtcsjl == null ? null : qtcsjl.trim();
    }

    public String getDxcsjl() {
        return dxcsjl;
    }

    public void setDxcsjl(String dxcsjl) {
        this.dxcsjl = dxcsjl == null ? null : dxcsjl.trim();
    }

    public String getDhcsjl() {
        return dhcsjl;
    }

    public void setDhcsjl(String dhcsjl) {
        this.dhcsjl = dhcsjl == null ? null : dhcsjl.trim();
    }
}