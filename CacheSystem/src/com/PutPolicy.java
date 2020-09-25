package com;

import java.util.Map;

public class PutPolicy implements ICachePutPolicy{
	@Override
	public void put(Map<Integer, Integer> map, int key, int value) {
		map.put(key, value);
	}

}
