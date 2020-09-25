package com;

import java.util.Map;

interface ICacheEvictionPolicy {
	void evict(Map<Integer, Integer> map);

}
