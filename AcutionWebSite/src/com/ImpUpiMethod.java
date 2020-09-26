package com;

public class ImpUpiMethod implements IPaymentMethod{

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
	
	ImpUpiMethod(String upiAddress) {
		
	}
	

}
