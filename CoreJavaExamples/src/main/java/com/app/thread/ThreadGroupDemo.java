package com.app.thread;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup tg = new ThreadGroup("Parent Group");
		System.out.println(tg.getParent().getName());
		ThreadGroup tg1 = new ThreadGroup(tg, "Chile Group");
		System.out.println(tg1.getParent().getName());
		
		ThreadGroup g = new ThreadGroup("tg");
		Thread t = new Thread(g, "Thread1");
		Thread t1 = new Thread(g, "Thread2");
		g.setMaxPriority(3);
		Thread t2 = new Thread(g, "Thread3");
		System.out.println(t.getPriority());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	}

}
