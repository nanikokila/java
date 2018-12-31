package com.app.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread1 extends Thread{

	@SuppressWarnings("rawtypes")
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	@SuppressWarnings("unchecked")
	public void run() {
		try { Thread.sleep(2000); }
		catch (InterruptedException e) {}
		System.out.println("Child Thread Updating List");
		l.add("C");
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		MyThread t = new MyThread();
		t.start();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s1 = (String)itr.next();
			System.out.println("Main Thread Iterating List And Current Object is: " +s1);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}
