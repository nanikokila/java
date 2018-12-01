package com.app;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.addElement("Ashok");
		v.addElement("Reddy");
		v.addElement("Naveen");
		v.addElement("Fasak");
		System.out.println(v);
		v.remove(3);
		v.addElement("Bhadraiah");
		v.addElement("Sarala");
		System.out.println(v);
		System.out.println(v.size());
	}

}
