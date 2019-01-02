package com.mt.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("sp3config.xml");
		Employee e = (Employee)ctx.getBean("emp");
		System.out.println(e);
	}

}
