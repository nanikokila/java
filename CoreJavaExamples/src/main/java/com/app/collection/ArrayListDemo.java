
package com.app.collection;

import java.util.ArrayList;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class ArrayListDemo {

	private static Logger log = Logger.getLogger(ArrayListDemo.class);
	public static void main(String[] args) {

		//Layout layout = new HTMLLayout();
		Layout layout = new SimpleLayout();
		Appender ap = new ConsoleAppender(layout);
		log.addAppender(ap);
		ArrayList<String> al = new ArrayList<String>();
		log.info("it prints empty arraylist");
		System.out.println(al);
		al.add("Ashok");
		al.add("Naveen");
		al.add("Naresh");
		al.add("Vijay");
		al.add("Ramya");
		
		al.add("null");
		al.add("love you");
		log.debug("it prints arraylist");
		System.out.println(al);
		log.warn("it prints with size of arraylist");
		System.out.println(al.size());
		al.add("Sathish");
		al.add("Kalyan");
		log.warn("an element is removed from arraylist");
		al.remove(4);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(5);
		log.info("an element is added to an arraylist");
		al.add(4, "Ramya");
		al.add("Ashok");
		System.out.println(al);
		System.out.println(al.size());
		log.info("total arraylist is cleared ");
		al.clear();
	}

}
