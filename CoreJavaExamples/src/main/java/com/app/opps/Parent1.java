package com.app.opps;

public class Parent1 {

	int i=10;
	{
		methodOne();
		System.out.println("First instance block");
	}
	Parent1()
	{
		System.out.println("Parent class constructor");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Parent1 p = new Parent1();
		System.out.println("main method");
	}
	public void methodOne()
	{
		System.out.println();
	}
	{
		System.out.println("Second instance block");
	}
	int j =20;

}
