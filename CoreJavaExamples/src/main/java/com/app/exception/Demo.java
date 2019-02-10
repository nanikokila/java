package com.app.exception;

import org.apache.log4j.Logger;

public class Demo {

	private static Logger log = Logger.getLogger(Demo.class);
	//control flow
	public static void main(String[] args) {

		try
		{
			if(log.isDebugEnabled())
			{
				log.debug("welcome to exception handling");
			}
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println(10/0);
			System.out.println("statement3");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("statement4");
		}
		finally
		{
			System.out.println("statement5");
		}
		System.out.println("statement6");
	}

}

/*output
 * statement1,2,5 executes
 */
/*
 * if the catch block is matched then all statements will be executed
 */
