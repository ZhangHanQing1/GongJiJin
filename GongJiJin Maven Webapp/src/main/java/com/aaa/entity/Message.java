package com.aaa.entity;

import java.util.List;

public class Message {
	private List<Sys_role_menu> list;

	public List<Sys_role_menu> getList() {
		return list;
	}

	public void setList(List<Sys_role_menu> list) {
		this.list = list;
	}

	public Message(List<Sys_role_menu> list) {
		super();
		this.list = list;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
