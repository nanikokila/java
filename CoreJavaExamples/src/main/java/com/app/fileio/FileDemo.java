package com.app.fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("E://JavaFiles//cricket.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f2 = new File("E://JavaFiles//xyz.txt");
		f2.mkdir();
		File f3 = new File("E://JavaFiles//xyz.txt","java.txt");
		f3.createNewFile();
		System.out.println(f3.exists());
	}

}
