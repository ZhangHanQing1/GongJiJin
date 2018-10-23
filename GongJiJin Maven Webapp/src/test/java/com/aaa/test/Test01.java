package com.aaa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aaa.dao.DbxxMapper;
import com.aaa.entity.Dbxx;

public class Test01 {

	public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        DbxxMapper dao=ac.getBean(DbxxMapper.class);
        Dbxx db=dao.selectByPrimaryKey(1);
        System.out.println(db.getDbhtbh());
	}

}
