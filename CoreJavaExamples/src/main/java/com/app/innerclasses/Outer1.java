package com.app.innerclasses;

public class Outer1 {

	class Inner
	{
		public void methodOne()
		{
           System.out.println("Inner class method");
		}
	}
		public void methodTwo()
		{
			Inner i = new Inner();
			i.methodOne();
		}
	
	public static void main(String[] args) {

		Outer1 o = new Outer1();
		o.methodTwo();
		System.out.println("Outer class main method");
	}
}
