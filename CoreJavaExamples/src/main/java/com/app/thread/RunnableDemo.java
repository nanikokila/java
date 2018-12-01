package com.app.thread;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {

		MyRunnable mr= new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);
			System.out.println("Parent Thread.....");
		}
	}

}
