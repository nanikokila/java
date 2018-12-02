package com.app.thread;

import java.util.TreeSet;

public class TreeSetExample {


	public static void main(String[] args) {
		

		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(30);
		tset.add(20);
		tset.add(50);
		tset.add(10);
		tset.add(40);
		tset.add(60);
		
		/*for(Integer in:tset)
		{
			System.out.println(in);
		}*/
		
		System.out.println(tset);
	

	}
}