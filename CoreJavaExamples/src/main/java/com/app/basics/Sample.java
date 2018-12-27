package com.app.basics;

/*
 *if a variable varied from one object to another object such type of variable is called instance variable
 * should be declared directly with in the class but outside of any method
 */
public class Sample {

	int i = 10;//instance variable
	boolean b;
	public static void main(String[] args) {

		//non-static variable cannot be referenced from a static context
		//System.out.println(i);
		
		Sample s  = new Sample();
		System.out.println(s.b);//false
		s.methodOne();

	}
	public void methodOne()
	{
		System.out.println(i);
	}

}
