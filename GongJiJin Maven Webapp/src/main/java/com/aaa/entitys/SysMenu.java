package com.aaa.entitys;

import java.util.HashSet;
import java.util.Set;

/**
 * SysMenu entity. @author MyEclipse Persistence Tools
 */

public class SysMenu implements java.io.Serializable {

	// Fields

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
	private Set sysRoleMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysMenu() {
	}

	/** full constructor */
	public SysMenu(String menuName, String parentId, Integer orderNum, String url, String menuType, String visible,
			String perms, String lcon, String remark, Set sysRoleMenus) {
		this.menuName = menuName;
		this.parentId = parentId;
		this.orderNum = orderNum;
		this.url = url;
		this.menuType = menuType;
		this.visible = visible;
		this.perms = perms;
		this.lcon = lcon;
		this.remark = remark;
		this.sysRoleMenus = sysRoleMenus;
	}

	// Property accessors

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getVisible() {
		return this.visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getPerms() {
		return this.perms;
	}

	public void setPerms(String perms) {
		this.perms = perms;
	}

	public String getLcon() {
		return this.lcon;
	}

	public void setLcon(String lcon) {
		this.lcon = lcon;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getSysRoleMenus() {
		return this.sysRoleMenus;
	}

	public void setSysRoleMenus(Set sysRoleMenus) {
		this.sysRoleMenus = sysRoleMenus;
	}

}