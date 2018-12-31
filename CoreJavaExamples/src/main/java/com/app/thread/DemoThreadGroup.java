package com.app.thread;

public class DemoThreadGroup {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

		ThreadGroup tg = new ThreadGroup("Parent Group");
		ThreadGroup tg1 = new ThreadGroup(tg, "Child Group");
		MyThread1 t = new MyThread1(tg, "Child thread1");
		MyThread1 t1 = new MyThread1(tg, "Child thread2");
		t.start();
		t1.start();
		System.out.println(tg.activeCount());
		System.out.println(tg.activeGroupCount());
		tg.list();
		Thread.sleep(5000);
		System.out.println(tg.activeCount());
		tg.list();
		
		System.out.println("=========");
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t2 = new Thread[system.activeCount()]; 
		system.enumerate(t2);
		for(Thread t3:t2)
		{
			System.out.println(t3.getName()+" "+t3.isDaemon());
		}
	}

}
