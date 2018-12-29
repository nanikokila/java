package com.app.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("E://JavaFiles//cricket.txt", true);
		fw.write(99);
		fw.write("\n");
		fw.write('c');
		
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
	}

}
