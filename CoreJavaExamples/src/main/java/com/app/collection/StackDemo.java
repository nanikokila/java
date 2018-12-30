package com.app.collection;

import java.util.Stack;

public class StackDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Stack s = new Stack();
		s.push("ashok");
		s.push("naveen");
		s.push("naresh");
		s.push("ramya");
		s.push("sathish");
		s.push("reddy");
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.pop();
		System.out.println(s);
		
	}

}
