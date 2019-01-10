package com.app.arrays;

import java.util.Arrays;
import java.util.List;

public class StringArrayToList {

	public static void main(String[] args) {
		String str[] = {"Ashok","Ramya","Naveen","Naresh","Sathish"};
		List<String> list = Arrays.asList(str);
		System.out.println("List "+list);
	}
}
