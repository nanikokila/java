package com.nt;

public class Cheque extends Payment{
	
	private String chequeType;

	public Cheque() {
		super();
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

	@Override
	public String toString() {
		return "Cheque [chequeType=" + chequeType + "]";
	}

	
	

}
