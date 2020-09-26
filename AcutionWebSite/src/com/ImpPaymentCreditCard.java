package com;

public class ImpPaymentCreditCard implements IPaymentMethod{

	@Override
	public String getTransactionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentStatus getPaymentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pay(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	ImpPaymentCreditCard(String creditCardNo, int year, int month, int cvv) {
		
	}
	

}
