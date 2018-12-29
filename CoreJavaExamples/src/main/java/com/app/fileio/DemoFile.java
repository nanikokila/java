package com.app.fileio;

import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException{

		int count = 0;
		File f = new File("E://JavaFiles//xyz.txt");
		String[] s = f.list();
		for(String s2:s)
		{
			File f2 = new File(f,s2);
			if(f2.isFile()){
				count++;
				System.out.println(s2);
			}
			
			
		}
		System.out.println("total number:"+count);
	}

}
