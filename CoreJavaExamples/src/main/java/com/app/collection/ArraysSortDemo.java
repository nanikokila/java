package com.app.collection;

import java.util.Arrays;

public class ArraysSortDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int[] a= {10, 5, 20, 11, 6};
		System.out.println("Arrays before sorting:");
		for(int a1:a)
		{

			System.out.println(a1);
		}

		Arrays.sort(a);
		System.out.println("Arrays after sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}

		String[] s = {"c","k","a","n","r"};
		System.out.println("Object array before sorting");
		for(String s1:s)
		{
			System.out.println(s1);
		}

		Arrays.sort(s);
		System.out.println("Object array after sorting");
		for(String s1:s)
		{
			System.out.println(s1);
		}

		Arrays.sort(s, new MyComparator1());
		System.out.println("Object Array After Sorting By Comparator:");
		for (String s1 : s) {
			System.out.println(s1);
		}

	}

}
