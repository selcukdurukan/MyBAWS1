package com.ba.boost.day20.cache;

public class CacheGeneric<T> {
	
	private T entry;

	
	public void add(T entry) {
		this.entry = entry;
	}
	
	public T getEntry( ) {
		return this.entry;
		
	}
	
	
}
