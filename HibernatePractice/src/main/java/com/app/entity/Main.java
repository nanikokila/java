package com.app.entity;

public class Main {

	public static void main(String[] args) {

		ImageDao dao = new ImageDaoImpl();
		//dao.insertImage();
        dao.selectImage(1);
	
	}

}
