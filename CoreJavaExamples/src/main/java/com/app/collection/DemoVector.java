package com.app.collection;

import java.util.Vector;

public class DemoVector {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("ashok");
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
