package com.app.thread;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		CustomerThread c1 = new CustomerThread("Customer thread1");
		CustomerThread c2 = new CustomerThread("Customer thread2");
		CustomerThread c3 = new CustomerThread("Customer thread3");
		CustomerThread c4 = new CustomerThread("Customer thread4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
