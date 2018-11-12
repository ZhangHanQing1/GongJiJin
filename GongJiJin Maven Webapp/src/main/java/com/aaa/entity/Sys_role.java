package com.aaa.entity;

public class Sys_role {
    private Integer roleId;

    private String roleName;

    private String roleKey;

    private String roleSort;

    private Integer status;

    private String remark;
  
    
    private Sys_role_menu sys_role_menu;
    private Sys_user_role sys_user_role;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleKey() {
		return roleKey;
	}
	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}
	public String getRoleSort() {
		return roleSort;
	}
	public void setRoleSort(String roleSort) {
		this.roleSort = roleSort;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Sys_user_role getSys_user_role() {
		return sys_user_role;
	}
	public void setSys_user_role(Sys_user_role sys_user_role) {
		this.sys_user_role = sys_user_role;
	}
	public Sys_role(Integer roleId, String roleName, String roleKey, String roleSort, Integer status, String remark,
			Sys_role_menu sys_role_menu, Sys_user_role sys_user_role) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleKey = roleKey;
		this.roleSort = roleSort;
		this.status = status;
		this.remark = remark;
		this.sys_role_menu = sys_role_menu;
		this.sys_user_role = sys_user_role;
	}
	public Sys_role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
}