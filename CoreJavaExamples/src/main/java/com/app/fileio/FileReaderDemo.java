package com.app.fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("E://JavaFiles//cricket.txt");
		int i = fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
	}

}
