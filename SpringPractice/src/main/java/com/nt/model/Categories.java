package com.nt.model;

public class Categories {

	private String name;
	 private Book bk;
	public Categories() {
		super();
	}
	public Categories(String name, Book bk) {
		super();
		this.name = name;
		this.bk = bk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "Categories [name=" + name + ", bk=" + bk + "]";
	}
	 
	 
}
