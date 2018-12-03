package com.app.exception;

public class Main {

	public static void main(String[] args) {

		int age = 20;
		if(age>60)
		{
			throw new TooYoungException("pelase wait for sometime ur already crossed 60");
		}
		if(age<18)
		{
			throw new TooYoungException("pelase wait for sometime ur not eligible to marry");
		}
		else
		{
			System.out.println("u'll get match details by mail");
		}
	}

}
