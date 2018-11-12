package com.aaa.entity;

public class Sys_menu {
    private Integer menuId;

    private String menuName;

    private String parentId;

    private Integer orderNum;

    private String url;

    private String menuType;

    private String visible;

    private String perms;

    private String lcon;

    private String remark;
    private Sys_role_menu sys_role_menu;
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public String getVisible() {
		return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
	}
	public String getPerms() {
		return perms;
	}
	public void setPerms(String perms) {
		this.perms = perms;
	}
	public String getLcon() {
		return lcon;
	}
	public void setLcon(String lcon) {
		this.lcon = lcon;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Sys_role_menu getSys_role_menu() {
		return sys_role_menu;
	}
	public void setSys_role_menu(Sys_role_menu sys_role_menu) {
		this.sys_role_menu = sys_role_menu;
	}
	public Sys_menu(Integer menuId, String menuName, String parentId, Integer orderNum, String url, String menuType,
			String visible, String perms, String lcon, String remark, Sys_role_menu sys_role_menu) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.parentId = parentId;
		this.orderNum = orderNum;
		this.url = url;
		this.menuType = menuType;
		this.visible = visible;
		this.perms = perms;
		this.lcon = lcon;
		this.remark = remark;
		this.sys_role_menu = sys_role_menu;
	}
	public Sys_menu() {
		super();
		// TODO Auto-generated constructor stub
	}
   
}