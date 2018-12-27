package com.app.opps;

public class Test {

	public void methodOne()
	{
		System.out.println("no-arg method..");
	}
	public void methodOne(int i)
	{
		System.out.println("int-arg method");
	}
	public void methodOne(double d)
	{
		System.out.println("double-arg method");
	}
	public static void main(String[] args) {
		
		Test t= new Test();
		t.methodOne();
		t.methodOne(10);
		t.methodOne(10.0);
	}

}
