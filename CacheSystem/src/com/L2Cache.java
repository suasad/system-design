package com;

import java.util.LinkedHashMap;

public class L2Cache extends AbsractCacheSystem {

	L2Cache(ICacheEvictionPolicy cache, ICachePutPolicy putData) {
		super(cache, putData);
		this.map = new LinkedHashMap<>();
		this.capacity = 4;
	}

}
