package com.app.strings;

public class StringDemo {

	public static void main(String[] args) {

		/*
		 * string methods
		 */
		String s = "ashok";
		System.out.println(s.charAt(2));
		//System.out.println(s.charAt(6));// StringIndexOutOfBoundsException
		
		String s1 = "ashok";
		s1 = s.concat("Software Engineer");
		//s1+=s1+"Software Engineer";
		System.out.println(s1);
		
		String s2 = "ashok";
		System.out.println(s2.equals("ashok"));//true
		System.out.println(s2.equalsIgnoreCase("ASHOK"));//true
		
		String s3 = "ashoksoftware";
		System.out.println(s3.substring(5));
		System.out.println(s3.substring(5, 9));
		
		String s4 = "ashokreddy";
		System.out.println(s4.length());
		
		String s5 = "ababab";
		System.out.println(s5.replace('a', 'b'));
		
		String s6 = "ASHOKREDDY";
		System.out.println(s6.toLowerCase());
		
		String s7 = "ramyareddy";
		System.out.println(s7.toUpperCase());
		
		String s8 = " ashok reddy ";
		System.out.println(s8.trim());
		
		String s9 = "ashokreddy";
		System.out.println(s9.indexOf('o'));
		
	}

}
