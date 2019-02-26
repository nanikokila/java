package com.app.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings("unused")
public class Example1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ashok");
		al.add("Naveen");
		al.add("Naresh");
		al.add("Vijay");
		al.add("Ramya");
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
	}

}
