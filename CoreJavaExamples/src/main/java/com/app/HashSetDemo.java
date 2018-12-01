package com.app;

import java.util.HashSet;
import java.util.Iterator;

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
		//hs.clear();
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println(hs.size());
	}

}
