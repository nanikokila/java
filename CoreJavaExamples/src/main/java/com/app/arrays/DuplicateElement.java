package com.app.arrays;

public class DuplicateElement {

	public static void main(String[] args) {

		int arr[] = {5,4,8,5,6,4,8};
		System.out.println("Duplicate elements are:");
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]+" ");
				}
	}

}
