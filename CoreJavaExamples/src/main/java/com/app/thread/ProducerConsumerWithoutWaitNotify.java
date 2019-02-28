package com.app.thread;

public class ProducerConsumerWithoutWaitNotify {

	public static void main(String[] args) {

		Producer prod=new Producer();
        Consumer cons=new Consumer(prod);
        
        Thread prodThread=new Thread(prod,"prodThread");
        Thread consThread=new Thread(cons,"consThread");
        
        prodThread.start();     //start producer thread.
        consThread.start();     //start consumer thread.
        
	}

}
