package com.app.collection;

import java.util.ArrayList;

public class ArrayListDuplicates {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("a");
		al.add("v");
		al.add("a");
		al.add("java");
		al.add("c");
		al.add("10");
		al.add("g");
		al.add("java");
		System.out.println("Before remove of Duplicates "+al);

		for(int i = 0;i<al.size();i++)
		{
			for(int j = i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println("After removing duplictes are "+al);

	}


}
