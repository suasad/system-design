package com;

import java.util.LinkedHashMap;

public class L1Cache extends AbsractCacheSystem {

	L1Cache(ICacheEvictionPolicy cache, ICachePutPolicy putData) {
		super(cache, putData);
		this.map = new LinkedHashMap<>();
		this.capacity = 2;
	}

}
