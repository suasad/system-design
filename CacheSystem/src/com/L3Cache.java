package com;

import java.util.LinkedHashMap;

public class L3Cache extends AbsractCacheSystem {

	L3Cache(ICacheEvictionPolicy cache, ICachePutPolicy putData) {
		super(cache, putData);
		this.map = new LinkedHashMap<>();
		this.capacity = 5;
	}

}
