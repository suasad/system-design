package com;

public class Admin extends Account{
	boolean blockAccount(Account account) {
		return true;
	}
	boolean removeAuction(IAuctionItem auction) {
		return true;
	}
}
