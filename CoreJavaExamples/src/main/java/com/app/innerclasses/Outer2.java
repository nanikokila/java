package com.app.innerclasses;

public class Outer2 {
	int x=10;
	static int y=20;
	class Inner
	{
		public void methodOne()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		new Outer2().new Inner().methodOne();
	}
}
