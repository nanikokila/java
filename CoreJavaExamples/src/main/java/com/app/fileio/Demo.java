package com.app.fileio;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {

		/*
		 * 1.This step won't create any file 
		 */
		File f = new File("E://JavaFiles//nav.txt");
		/*
		 * this step creates the file
		 */
		boolean b= f.createNewFile();
		if(b)
		{
			System.out.println("File is created successfully....");
		}
		else
		{
			System.out.println("File is already existed in location..");
		}
	}

}
