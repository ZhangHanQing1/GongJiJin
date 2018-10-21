package com.aaa.entity;

public class Dwlxb {
    private Integer dwlxbh;

    private String dwlxmc;

    public Integer getDwlxbh() {
        return dwlxbh;
    }

    public void setDwlxbh(Integer dwlxbh) {
        this.dwlxbh = dwlxbh;
    }

    public String getDwlxmc() {
        return dwlxmc;
    }

    public void setDwlxmc(String dwlxmc) {
        this.dwlxmc = dwlxmc == null ? null : dwlxmc.trim();
    }
}