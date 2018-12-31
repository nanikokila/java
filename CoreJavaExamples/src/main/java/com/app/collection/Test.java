package com.app.collection;

import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		m.put(100, "Pawan");
		m.put(102, "Ram");
		System.out.println(m);
		m.putIfAbsent(100, "Chiru");//Pawan
		m.putIfAbsent(103, "Kalyan");
		System.out.println(m);
	}

}
