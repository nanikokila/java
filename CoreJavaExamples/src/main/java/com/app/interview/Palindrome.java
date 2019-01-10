package com.app.interview;

public class Palindrome {

	public static void main(String[] args) {

		int r,temp,sum=0;
		int n=454;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
