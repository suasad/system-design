package com;

public interface ICacheSystem {
	void put(int level, int key, int value);
	int get(int key);
}
