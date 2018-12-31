package com.app.collection;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComparator1 implements Comparator{

	public int compare(Object obj1, Object obj2) {
		String s1 =obj1.toString();
		String s2 =obj2.toString();
		return s1.compareTo(s2);
	}
}
