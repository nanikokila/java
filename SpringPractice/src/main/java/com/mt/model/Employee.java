package com.mt.model;

public class Employee {

	private Address addr;

	public Employee() {
		super();
	}

	public Employee(Address addr) {
		super();
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	
	
}
