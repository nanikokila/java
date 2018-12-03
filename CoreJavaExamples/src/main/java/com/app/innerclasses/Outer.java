package com.app.innerclasses;

public class Outer {

	static int x=10;
	int y=20;
	class Inner
	{
		public void m()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m();
	}
}
