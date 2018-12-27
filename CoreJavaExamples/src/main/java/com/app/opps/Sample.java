package com.app.opps;

public class Sample {

	public void methodOne(String s)
	{
		System.out.println("String version");
	}
	public void methodOne(Object o)
	{
		System.out.println("Object version");
	}
	public static void main(String[] args) {

      Sample s = new Sample();
      s.methodOne("ashok");
      s.methodOne(new Object());
      s.methodOne(null);
	}

}
