package com.aaa.entity;

public class Hjfs {
    private Integer jjbh;

    private String jjmc;

    public Integer getJjbh() {
        return jjbh;
    }

    public void setJjbh(Integer jjbh) {
        this.jjbh = jjbh;
    }

    public String getJjmc() {
        return jjmc;
    }

    public void setJjmc(String jjmc) {
        this.jjmc = jjmc == null ? null : jjmc.trim();
    }
}