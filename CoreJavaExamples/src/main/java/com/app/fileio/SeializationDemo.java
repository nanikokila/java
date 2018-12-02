package com.app.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeializationDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("E://JavaFiles//java.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis  = new FileInputStream("E://JavaFiles//java.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog d2 = (Dog)ois.readObject();
		System.out.println(d1.a+" "+d2.b);
	}

}
