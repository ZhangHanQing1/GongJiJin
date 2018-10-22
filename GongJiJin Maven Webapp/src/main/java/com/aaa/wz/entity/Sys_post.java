package com.aaa.wz.entity;

public class Sys_post {
    private Integer postId;

    private String postCode;

    private String postName;

    private Integer postSort;

    private Integer status5;

    private String pemark;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Integer getPostSort() {
        return postSort;
    }

    public void setPostSort(Integer postSort) {
        this.postSort = postSort;
    }

    public Integer getStatus5() {
        return status5;
    }

    public void setStatus5(Integer status5) {
        this.status5 = status5;
    }

    public String getPemark() {
        return pemark;
    }

    public void setPemark(String pemark) {
        this.pemark = pemark == null ? null : pemark.trim();
    }
}