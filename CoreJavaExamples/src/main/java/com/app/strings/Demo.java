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
		
		/*
		 * In string class .equals() is overridden for content comparison and == operator
		 * for reference comparison
		 */
		
		String str = new String("ashok");
		String st = new String("ashok");
		System.out.println(str==st);//false
		System.out.println(str.equals(st));//true
		
		/*
		 * In stringBuffer class .equals() is not overridden for content comparison 
		 */
		StringBuffer sb1 = new StringBuffer("ashok");
		StringBuffer sb2 = new StringBuffer("ashok");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
	}

}
