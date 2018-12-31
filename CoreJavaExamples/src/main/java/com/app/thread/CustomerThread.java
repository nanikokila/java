package com.app.thread;

public class CustomerThread extends Thread{

	static Integer custId =0;
	@SuppressWarnings("rawtypes")
	private static ThreadLocal tl = new ThreadLocal()
	{
		protected Integer initialValue()
		{
			return ++custId;

		}
	};

	CustomerThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"Executing with customer ID"
					+tl.get());
		}
	}
}
