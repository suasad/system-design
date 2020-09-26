package com;

import java.util.Date;
import java.util.List;

public interface IAuctionItem {
	String  getID();
	Date getDate();
	List<IBids> allBids();
	String getAuctionItemID();
}
