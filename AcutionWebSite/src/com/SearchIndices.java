package com;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class SearchIndices {
	List<User> allUsers;
	List<ImpAuction> allActions;
	Map<String, List<ImpAuction>> allAuctionCityWise;
	Map<Date, List<ImpAuction>> allAuctionDateWise;
	ISearch searchInterface;
	
	List<ImpAuction> searchResult(ISearch search, int number) {
		return search.getResult(this, number);
	}
	
}
