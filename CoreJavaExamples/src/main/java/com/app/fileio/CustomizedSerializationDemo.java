package com.app.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerializationDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Account1 a = new Account1();
		System.out.println(a.username+" "+a.password);
		FileOutputStream fos = new FileOutputStream("E://JavaFiles//reddy.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(a);
		
		System.out.println("Data send successfull to file...");
		FileInputStream fis = new FileInputStream("E://JavaFiles//reddy.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account1 a2 = (Account1)ois.readObject();
		System.out.println(a2.username+" "+a2.password);
	}

}
