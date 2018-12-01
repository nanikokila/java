package com.app.thread;

public class Demo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("PawanKalyan");
		System.out.println(Thread.currentThread().getName());
	}

}
