package com.app.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("E://JavaFiles//nava.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("ashok");
		bw.newLine();
		bw.write("software engineer");
		bw.flush();
		System.out.println("Data send successfully..");
		bw.close();
	}

}
