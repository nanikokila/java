package com.sathya.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
		Employee e = (Employee)ctx.getBean("emp");
		System.out.println(e);
	}

}
