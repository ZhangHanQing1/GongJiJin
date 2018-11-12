package com.aaa.entity;

public class Zjlxb {
    private Integer zjlxbh;

    private String zjmc;

    public Integer getZjlxbh() {
        return zjlxbh;
    }

    public void setZjlxbh(Integer zjlxbh) {
        this.zjlxbh = zjlxbh;
    }

    public String getZjmc() {
        return zjmc;
    }

    public void setZjmc(String zjmc) {
        this.zjmc = zjmc == null ? null : zjmc.trim();
    }
}