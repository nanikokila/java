package com.app.exception;

public class Test {

	public static void main(String[] args) {

		try
		{
			System.out.println("try-block");
			//System.out.println(10/0);
			System.exit(0);//with this statement finally block won't execute
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("catch-block");
		}
		
		finally
		{
			System.out.println("finally-block");
		}
	}

}
