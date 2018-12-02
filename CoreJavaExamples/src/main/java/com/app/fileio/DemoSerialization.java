package com.app.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws Exception {
		Account a = new Account();
		System.out.println(a.username+" "+a.password);
		FileOutputStream fos = new FileOutputStream("E://JavaFiles//abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);

		FileInputStream fis  = new FileInputStream("E://JavaFiles//abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a1 = (Account)ois.readObject();
		System.out.println(a1.username+" "+a1.password);
	}

}
