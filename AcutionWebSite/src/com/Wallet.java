package com;

import java.util.List;

public class Wallet {
	int amount;
	List<IPaymentMethod> allPayments;
	boolean pay(int amount) {
		return true;
	}
	
}
