package org.nt.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("sp6config.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println(emp);
	}

}
