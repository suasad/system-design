package com;

public class Driver {
	public static void main(String sr[]) {
		CacheSystem cacheSystem = new CacheSystem();
		cacheSystem.put(1, 1, 2);
		cacheSystem.put(2, 3, 6);
		cacheSystem.put(3, 4, 8);
		cacheSystem.put(4, 5, 10);
		cacheSystem.put(1, 6, 12);
		cacheSystem.put(2, 7, 14);
		System.out.println(cacheSystem.get(3));
		System.out.println(cacheSystem.get(2));
		System.out.println(cacheSystem.get(5));
		System.out.println(cacheSystem.get(7));
	}
}
