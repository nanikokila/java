package com.app.collection;

import java.util.TreeSet;

public class Comp {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Employee e1 = new Employee("Pawan", 100);
		Employee e2 = new Employee("Charan", 200);
		Employee e3 = new Employee("Ashok", 50);
		Employee e4 = new Employee("Naveen",150);
		Employee e5 = new Employee("Ramya", 100);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);


		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}
}
