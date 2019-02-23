package com.app.strings;

import java.util.Arrays;

public class StringToByteArray {

	public static void main(String[] args)  {

		String str = "ashok";
		byte[] b = str.getBytes();
		System.out.println("String to byte array :"+Arrays.toString(b));
	}

}
