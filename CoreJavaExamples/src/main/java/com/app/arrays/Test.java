package com.app.arrays;

/*
 * possible valid arrays
 * int[] a = {10,20,30};,char[] ch = {a,e,i,o,u};,
 * int[] b = a;(valid),int[] b = ch;(invalid)[incompatible type]
 */
public class Test {

	public static void main(String[] args) {

		System.out.println(sum(new int[]{10,30,50,40}));
		
		/*
		 * when we are assigning one array to another array internal elements won't copy
		 * just reference variables will be assigned size i s not important but type must
		 * be matched 
		 */
		int[] b = {10,20,50,40,30};
		int[] c = {20,30};
		b=c;
		c=b;
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
