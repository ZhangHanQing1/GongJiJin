package com.aaa.entity;

public class Sys_menu {
	private Integer menu_id;
	private String menu_name;
	private String parent_id;
	private Integer order_num;
	private String url;
	private String menu_type;
	private String visible;
	private String perms;
	private String lcon;
	private String remark;
	private int checked;
	private Sys_role_menu sys_role_menu;
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getOrder_num() {
		return order_num;
	}
	public void setOrder_num(Integer order_num) {
		this.order_num = order_num;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMenu_type() {
		return menu_type;
	}
	public void setMenu_type(String menu_type) {
		this.menu_type = menu_type;
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
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	public Sys_role_menu getSys_role_menu() {
		return sys_role_menu;
	}
	public void setSys_role_menu(Sys_role_menu sys_role_menu) {
		this.sys_role_menu = sys_role_menu;
	}
	public Sys_menu(Integer menu_id, String menu_name, String parent_id, Integer order_num, String url,
			String menu_type, String visible, String perms, String lcon, String remark, int checked,
			Sys_role_menu sys_role_menu) {
		super();
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.parent_id = parent_id;
		this.order_num = order_num;
		this.url = url;
		this.menu_type = menu_type;
		this.visible = visible;
		this.perms = perms;
		this.lcon = lcon;
		this.remark = remark;
		this.checked = checked;
		this.sys_role_menu = sys_role_menu;
	}
	public Sys_menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
