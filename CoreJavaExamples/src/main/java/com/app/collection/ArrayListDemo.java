package com.app.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al);
		al.add("Ashok");
		al.add("Naveen");
		al.add("Naresh");
		al.add("Vijay");
		al.add("Ramya");
		System.out.println(al);
		System.out.println(al.size());
		al.add("Sathish");
		al.add("Kalyan");
		al.remove(4);
		System.out.println(al);
		System.out.println(al.size());
		al.add(4, "Ramya");
		al.add("Ashok");
		System.out.println(al);
		System.out.println(al.size());
		al.clear();
	}

}
