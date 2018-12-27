package com.app.arrays;

/*
 * possible valid arrays
 * int[] a = {10,20,30};,char[] ch = {a,e,i,o,u};,
 * int[] b = a;(valid),int[] b = ch;(invalid)[incompatible type]
 */
public class Test {

	public static void main(String[] args) {

		System.out.println(sum(new int[]{10,30,50,40}));
	}
	
	public static int sum(int[] x)
	{
		int total =0;
		for(int x1:x)
		{
			total = total+x1;
		}
		return total;
	}

}
