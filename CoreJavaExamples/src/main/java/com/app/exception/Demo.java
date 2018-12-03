package com.app.exception;

public class Demo {

	//control flow
	public static void main(String[] args) {

		try
		{
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
