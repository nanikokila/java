package com.app.thread;

import java.util.LinkedList;
import java.util.List;


/**
* Producer Class in java, Producer will allow consumer to consume only
* when 10 products have been produced (i.e. when production is over).
*/

public class Producer implements Runnable {

	boolean prodInProcess;
	List<Integer> list;
	
	
	public Producer() {
		//initially Producer will be producing, so make this productionInProcess true.
		super();
		prodInProcess =true;
		list = new LinkedList<Integer>();
	}


	public void run() {

		for(int i=1;i<=20;i++)
		{
			list.add(i);
			System.out.println("Producer is still Producing, Produced :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/* Once production is over, make this productionInProcess false.
	            * Production is over, consumer can consume.
	            */
		
		}
		
		prodInProcess=false;
	}

}
