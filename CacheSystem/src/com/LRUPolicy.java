package com;

import java.util.Map;

public class LRUPolicy implements ICacheEvictionPolicy{

	@Override
	public void evict(Map<Integer, Integer> map) {
		Integer lastkey = null;
		for(Integer key: map.keySet()) {
			lastkey = key;
		}
		map.remove(lastkey);
	}

}
