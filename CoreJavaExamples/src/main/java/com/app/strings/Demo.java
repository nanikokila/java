package com.app.strings;
public class Demo {

	public static void main(String[] args) {

		/*
		 * Once we create string object we cannot perform any changes in the existing object
		 * If we are trying to change a new object will be created.This behavior is called
		 * Immutability 
		 */
		String s = "ashok";
		s.concat("reddy");
		System.out.println(s);
		
		/*
		 * Once we create StringBuffer object we can perform any changes to the existing
		 * object.This behavior is called Mutability
		 */
		StringBuffer sb = new StringBuffer("ashok");
		sb.append("reddy");
		System.out.println(sb);
	}

}
