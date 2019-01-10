package com.app.arrays;

import java.util.Arrays;

public class SecondLargest {

	public static int getLarestNumber(int a[], int total)
	{
		Arrays.sort(a);
		return a[total-2];
		//return a[total-3] third largest
	}
	public static void main(String[] args) {

		int a[] = {54,75,85,62,25,98};
		System.out.println("Second largest is: "+getLarestNumber(a, 6));
		
	}

}
