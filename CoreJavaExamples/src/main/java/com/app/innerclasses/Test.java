package com.app.innerclasses;

public class Test {

	public void m()
	{
		class Inner
		{
			public void sum(int x,int y)
			{
				System.out.println("Sum ="+(x+y));
			}
		}
		Inner i = new Inner();
		i.sum(10, 20);
		i.sum(15, 30);
		i.sum(50, 50);
	}
	
	public static void main(String[] args) {
		new Test().m();
	}
}
