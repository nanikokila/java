package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.service.EmpReportGen;

public class Test {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
		EmpReportGen e=(EmpReportGen)ac.getBean("empReportGen");

	}
}
