package com.app.basics;

import org.apache.log4j.Logger;

public class Employee {

	private static Logger log = Logger.getLogger(Employee.class);
	public static void main(String[] args) {

		log.debug("hello");
		log.info("hello");
		log.warn("hi");
		log.error("nee");
		log.fatal("abba....");
	}

}
