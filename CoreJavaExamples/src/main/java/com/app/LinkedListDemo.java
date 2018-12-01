package com.app;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll);
		ll.add("Bhadraiah");
		ll.add("Sarala");
		ll.add("Ashok");
		ll.add("Naveen");
		System.out.println(ll);
		System.out.println(ll.size());
		ll.addFirst("Reddy");
		ll.addLast("Ramya");
		ll.removeLast();
		ll.addFirst("Ramya");
		ll.addFirst("Ashok");
		System.out.println(ll);
		System.out.println(ll.size());
		ll.clear();
	}

}
