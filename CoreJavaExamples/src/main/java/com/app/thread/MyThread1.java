package com.app.thread;

public class MyThread1 extends Thread{
	
	MyThread1(ThreadGroup g,String name)
	{
		super(g,name);
	}
	public void run()
	{
		System.out.println("ChildThread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
