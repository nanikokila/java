package org.sathya;

public class Employee {
	
	private Address addr;
	
	public Employee() {
		super();
		System.out.println("In default");
	}

	public Employee(Address addr) {
		super();
		this.addr = addr;
		System.out.println("in Param");
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Empoyee [addr=" + addr + "]";
	}

	
}
