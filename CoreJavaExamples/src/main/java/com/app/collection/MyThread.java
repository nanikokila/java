package com.app.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("unused")
public class MyThread extends Thread{

	/*@SuppressWarnings("rawtypes")
	static HashMap m = new HashMap(); // java.util.ConcurrentModificationException
*/

	@SuppressWarnings("rawtypes")
	static ConcurrentHashMap m = new ConcurrentHashMap();
	
	@SuppressWarnings("unchecked")
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {}
		System.out.println("Child Thread updating Map");
		m.put(103, "C");
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws InterruptedException {
		m.put(101, "A");
		m.put(102, "B");
		MyThread t = new MyThread();
		t.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Integer I1 = (Integer) itr.next();
			System.out.println("Main Thread iterating and Current Entry is:"+I1+"..............."+m.get(I1));
			Thread.sleep(3000);
		}
		System.out.println(m);	
	}

	}
