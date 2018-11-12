package com.aaa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aaa.dao.DbxxMapper;
import com.aaa.dao.Sys_roleMapper;
import com.aaa.entity.Dbxx;

import com.aaa.entity.Sys_role;

public class Test01 {

	public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Sys_roleMapper sysrole=ac.getBean(Sys_roleMapper.class);
        Sys_role sr= sysrole.selectByPrimaryKey(1);
        System.out.println(sr.getStatus());
	}

}
