package com.app.thread;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d = new Display();
		Sample s = new Sample(d, "Ashok");
		Sample s1 = new Sample(d,"Ramya");
		s.start();
		s1.start();
	}

}
