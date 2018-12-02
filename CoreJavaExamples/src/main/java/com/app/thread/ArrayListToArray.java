package com.app.thread;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("ashok");
		list.add("ramya");
		list.add("naveen");
		list.add("naresh");
		list.add("sathish");

		//System.out.println(list);

		//converting to array
		Object[] array =list.toArray();

		for(Object obj:array)
		{
			System.out.println(obj);
		}
	}

}
