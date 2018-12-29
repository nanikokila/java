package com.app.fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("E://JavaFiles//cricket.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}

}
