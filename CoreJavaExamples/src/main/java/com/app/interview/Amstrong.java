package com.app.interview;

public class Amstrong {

	public static void main(String[] args) {
		
		int r,c=0,temp;
		int n=153;
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			c=c+(r*r*r);
		}
		if(temp==c)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
	}
}
