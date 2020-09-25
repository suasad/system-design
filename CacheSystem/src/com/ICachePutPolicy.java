package com;

import java.util.Map;

public interface ICachePutPolicy {
	public void put(Map<Integer, Integer> map, int key, int value);
}
