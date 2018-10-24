package com.aaa.entity;

public class Dwzhzt {
    private Integer dwzhztbh;

    private String dwzhztmc;

    public Integer getDwzhztbh() {
        return dwzhztbh;
    }

    public void setDwzhztbh(Integer dwzhztbh) {
        this.dwzhztbh = dwzhztbh;
    }

    public String getDwzhztmc() {
        return dwzhztmc;
    }

    public void setDwzhztmc(String dwzhztmc) {
        this.dwzhztmc = dwzhztmc == null ? null : dwzhztmc.trim();
    }
}