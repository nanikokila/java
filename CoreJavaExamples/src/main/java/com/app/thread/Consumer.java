package com.app.thread;

public class Consumer extends Thread{

	 Producer prod;
	    
	    Consumer(Producer obj){
	     prod=obj;
	    }
	    
	    public void run(){
	           /*
	            * consumer checks whether productionInProcess is true or not,
	            * if it's true, consumer will sleep and wake up after certain time
	            * and again check whether productionInProcess is true or false.
	            * process will repeat till productionInProcess is true.
	            * Once productionInProcess is false we'll exit below while loop.
	            */
	           while(this.prod.prodInProcess){ 
	              System.out.println("Consumer waiting for production to get over.");
	              try{
	                  Thread.sleep(4000);
	              }catch(InterruptedException e){e.printStackTrace();}
	           
	           }
	           
	           
	           /*productionInProcess is false means production is over,
	            * consumer will start consuming. */
	           System.out.println("Production is over, consumer can consume.");
	           int productSize=this.prod.list.size();
	           for(int i=0;i<productSize;i++)
	                  System.out.println("CONSUMED : "+ this.prod.list.remove(0) +" "); 
	           
	    }
	    
}
