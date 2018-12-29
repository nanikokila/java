package com.app.fileio;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account1 implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username = "ashok";
	transient String password  = "ramya";
	
	@SuppressWarnings("unused")
	private void wirteObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123"+password;
		os.writeObject(os);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String pwd = (String)is.readObject();
		password = pwd.substring(3);
	}
	
}
