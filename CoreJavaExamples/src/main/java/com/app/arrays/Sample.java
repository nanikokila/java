package com.app.arrays;

public class Sample {

	public static void main(String[] args) {

		String[] str = {"a","b"};
		args = str;
		System.out.println(args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}

}
