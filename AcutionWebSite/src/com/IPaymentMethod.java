package com;

public interface IPaymentMethod {
	String getTransactionId();
	PaymentStatus getPaymentStatus();
	boolean pay(int amount);
}
