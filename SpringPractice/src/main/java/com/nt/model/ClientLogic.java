package com.nt.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("sp2config.xml");
		Categories c = (Categories)ctx.getBean("id1");
		System.out.println(c);
	}

}
