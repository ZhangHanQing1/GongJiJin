package com.aaa.wz.entity;

public class Sys_dept {
    private Integer deptId;

    private Integer parenId;

    private String deptName;

    private Integer orderNum;

    private String lerder;

    private String phone;

    private String email;

    private Integer status;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getParenId() {
        return parenId;
    }

    public void setParenId(Integer parenId) {
        this.parenId = parenId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getLerder() {
        return lerder;
    }

    public void setLerder(String lerder) {
        this.lerder = lerder == null ? null : lerder.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}