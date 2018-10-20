package com.aaa.entity;

public class jjlx {
    private Integer jjlxbh;

    private String jjlxmc;

    public Integer getJjlxbh() {
        return jjlxbh;
    }

    public void setJjlxbh(Integer jjlxbh) {
        this.jjlxbh = jjlxbh;
    }

    public String getJjlxmc() {
        return jjlxmc;
    }

    public void setJjlxmc(String jjlxmc) {
        this.jjlxmc = jjlxmc == null ? null : jjlxmc.trim();
    }
}