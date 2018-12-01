package com.app.thread;

public class MyDemo extends Thread{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread.....");
		}
	}

}
