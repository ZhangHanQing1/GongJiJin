package com.aaa.entity;

public class Sshyb {
    private Integer hybh;

    private String hymc;

    public Integer getHybh() {
        return hybh;
    }

    public void setHybh(Integer hybh) {
        this.hybh = hybh;
    }

    public String getHymc() {
        return hymc;
    }

    public void setHymc(String hymc) {
        this.hymc = hymc == null ? null : hymc.trim();
    }
}