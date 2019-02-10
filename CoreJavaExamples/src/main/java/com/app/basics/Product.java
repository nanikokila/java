package com.app.basics;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Product {

	private static Logger log = Logger.getLogger(Product.class);
	public static void main(String[] args) {

		Layout out = new SimpleLayout();
		Appender ap = new ConsoleAppender(out);
		log.addAppender(ap);
		log.debug("hi");
		log.info("Ashok");
	}

}
