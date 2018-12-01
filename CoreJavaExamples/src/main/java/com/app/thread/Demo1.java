package com.app.thread;

public class Demo1 {

	public static void main(String[] args) {

		MyDemo d = new MyDemo();
		d.setPriority(6);

		d.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Parent Thread....");
		}
		
	}

}
