package com;

public class CacheSystem implements ICacheSystem {
	AbsractCacheSystem L1;
	AbsractCacheSystem L2;
	AbsractCacheSystem L3;
	@Override
	public void put(int level, int key, int value) {
		switch(level) {
		case 1:
			L1.put(key, value);
			break;
		case 2:
			L2.put(key, value);
			break;
		case 3:
			L3.put(key, value);
			break;
		default:
			System.out.println("Inappropriate level Selected");
		}
	}

	@Override
	public int get(int key) {
		if(L1.getValue(key) != -1) {
			return L1.getValue(key);
		}
		if(L2.getValue(key) != -1) {
			return L2.getValue(key);
		}
		if(L3.getValue(key) != -1) {
			return L3.getValue(key);
		}
		return -1;
	}
	
	CacheSystem() {
		L1 = new L1Cache(new LRUPolicy(), new PutPolicy());
		L2 = new L2Cache(new LRUPolicy(), new PutPolicy());
		L3 = new L3Cache(new LRUPolicy(), new PutPolicy());
	}
	
	
}
