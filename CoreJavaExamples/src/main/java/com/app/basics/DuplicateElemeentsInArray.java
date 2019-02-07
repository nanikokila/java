package com.app.basics;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElemeentsInArray {

	public static void main(String[] args) {

		String[] strArray = {"abc","def","abc","ghi"};
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j])&&(i!=j))
				{
					System.out.println("Duplicate elements are :"+strArray[i]);
				}
			}
		}
		
		Set<String> set = new HashSet<String>();
		for(String s:strArray)
		{
			if(!set.add(s))
			{
				System.out.println("Duplicate elements are:"+s);
			}
		}
	}

}
