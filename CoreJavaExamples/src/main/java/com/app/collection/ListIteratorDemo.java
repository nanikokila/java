package com.app.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("Pawan");
		l.add("Charan");
		l.add("Chiru");
		l.add("Sai");
		l.add("Varun");
		l.add("Bunny");
		System.out.println(l);
		System.out.println(l.size());
		ListIterator itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("Bunny"))
			{
				itr.remove();
			}
			if(s.equals("Pawan"))
			{
				itr.add("Kalyan");
			}
		}
		System.out.println(l);
		System.out.println(l.size());
	}

}
