package com.app.thread;

public class Sample extends Thread{

	Display d;
	String name;
	public Sample(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}
