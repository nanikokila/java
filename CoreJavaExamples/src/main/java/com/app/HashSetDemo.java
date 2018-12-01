package com.app;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs);
		hs.add("Ashok");
		hs.add("Naveen");
		hs.add("Naresh");
		hs.add("Bhadraish");
		hs.add("Reddy");
		hs.add("Ashok");
		System.out.println(hs);
		hs.remove("Reddy");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		hs.clear();
	}

}
