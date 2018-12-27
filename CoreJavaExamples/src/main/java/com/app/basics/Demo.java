package com.app.basics;

public class Demo {

	Demo()
	{
		System.out.println(this);
		System.out.println(this.hashCode());
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Demo d = new Demo();
	}

}
