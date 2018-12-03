package com.app.innerclasses;

public class Demo {

	public static void main(String[] args) {
		
		 new Thread(new Runnable()
				 {
			 public void run()
			 {
				 for(int i=0;i<3;i++)
				 {
					 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 System.out.println("Child-thread1");
				 }
			 }
				 }).start();
		
		 for(int i=0;i<3;i++)
		 {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("main-thread1");
		 }
	}
}
