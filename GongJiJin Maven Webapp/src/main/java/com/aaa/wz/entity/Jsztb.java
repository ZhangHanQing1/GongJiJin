package com.aaa.wz.entity;

public class Jsztb {
    private Integer jsztbh;

    private String ztmc;

    public Integer getJsztbh() {
        return jsztbh;
    }

    public void setJsztbh(Integer jsztbh) {
        this.jsztbh = jsztbh;
    }

    public String getZtmc() {
        return ztmc;
    }

    public void setZtmc(String ztmc) {
        this.ztmc = ztmc == null ? null : ztmc.trim();
    }
}