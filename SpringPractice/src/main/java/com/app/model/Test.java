package com.app.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
            "scope.xml");
        Scope scope = (Scope) ctx.getBean("scopeTest");
        Scope scopeDuplicate = (Scope) ctx.getBean("scopeTestDuplicate");
        System.out.println(scope == scopeDuplicate);
        System.out.println(scope + "::" + scopeDuplicate);
        System.out.println(scope.hashCode() + "::" +scopeDuplicate.hashCode());
    }
}
