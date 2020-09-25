package com;

import java.util.Map;

public abstract class AbsractCacheSystem implements IMultiLayerCacheSystem{
		ICacheEvictionPolicy cache;
		ICachePutPolicy putData;
		Map<Integer, Integer>  map;
		int capacity;
		AbsractCacheSystem(ICacheEvictionPolicy cache, ICachePutPolicy putData) {
			this.cache = cache;
			this.putData = putData;
		}
		@Override
		public void put(int key, int value) {
			if(map.size() == capacity) {
				cache.evict(map);
			}
			putData.put(map,key,value);
		}
		@Override
		public int getValue(int key) {
			if(map.containsKey(key)) {
				return map.get(key);
			}
			return -1;
		}
		
}