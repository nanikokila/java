package com.app.basics;

/*
 * 
 */
public class Example {

	static int x =10;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Example e = new Example();
		System.out.println(Example.x);
		System.out.println(e.x);
		System.out.println(x);
	}

}
