package com;

import java.util.List;

public class User extends Account {
	List<IAuctionItem> allAuctionHistory;
	Profile profile;
	Wallet wallet;
	boolean login() {
		return false;
	}
	List<IAuctionItem> AllTransaction() {
		return allAuctionHistory;
	}
}
