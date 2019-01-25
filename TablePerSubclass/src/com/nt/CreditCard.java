package com.nt;

public class CreditCard extends Payment{
	
	private String creditCardType;

	public CreditCard() {
		super();
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardType=" + creditCardType + "]";
	}


	

}
