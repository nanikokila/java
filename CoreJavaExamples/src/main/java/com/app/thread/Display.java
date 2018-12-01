package com.app.thread;

public class Display {

	/*if we are not declaring synchronized then both methods 
	 * will be executed simultaneously
	 */
	public synchronized void wish(String name)
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("Goo morning...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name);
		}
		
	}
}
