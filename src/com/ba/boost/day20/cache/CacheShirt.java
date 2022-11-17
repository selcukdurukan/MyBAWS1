package com.ba.boost.day20.cache;

public class CacheShirt {
	
	private Shirt entry;

	public void add(Shirt entry) {
		this.entry = entry;
	}

	public Shirt getEntry() {
		return this.entry;
	}

}
