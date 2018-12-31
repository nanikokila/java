package com.app.thread;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup tg = new ThreadGroup("Parent Group");
		System.out.println(tg.getParent().getName());
		ThreadGroup tg1 = new ThreadGroup(tg, "Chile Group");
		System.out.println(tg1.getParent().getName());
	}

}
