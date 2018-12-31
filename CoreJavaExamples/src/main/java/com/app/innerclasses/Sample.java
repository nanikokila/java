package com.app.innerclasses;

public class Sample {

	int x = 10;
	@SuppressWarnings("unused")
	public void m()
	{
		int y=20;
		class Inner
		{
			public void m2()
			{
				System.out.println(x);
				//System.out.println(y);CE
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		new Sample().m();
	}
}
