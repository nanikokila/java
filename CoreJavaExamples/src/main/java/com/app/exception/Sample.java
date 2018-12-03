package com.app.exception;

public class Sample {

	static ArithmeticException ae;
	public static void main(String[] args) {

		throw ae;
		//System.out.println();compile time error
	}
}
//NullPointerException