package org.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("sp4config.xml");
		Employee e = (Employee)ctx.getBean("empObj");
		System.out.println(e);
	}

}
