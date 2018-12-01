package com.app.thread;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Parent Thread....");
		}
	}

}
