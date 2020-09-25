package com;

public interface IMultiLayerCacheSystem {
	public void put(int key, int value);
	public int getValue(int key);
}
