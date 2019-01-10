package com.app.arrays;

public class MinAndMax {

	public static void main(String[] args) {

		int[] a = {10,20,100,5,60,50};
		for(int a1:a)
		{
			System.out.println(a1);
		}

		int min = a[0];
		for(int i = 1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
	System.out.println("Minimum value is ="+min);
		int max = a[0];
		for(int i = 1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println("Maximum value is ="+max);
	
	}

}
