package com.ba.boost.day20.cache;

public class CacheGenericImportant<T extends Number, K, V, S> {

	private T entry;
	private K key;
	private V value;
	private S neBileyimBen;

	public T getEntry() {
		return entry;
	}

	public void setEntry(T entry) {
		this.entry = entry;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public S getNeBileyimBen() {
		return neBileyimBen;
	}

	public void setNeBileyimBen(S neBileyimBen) {
		this.neBileyimBen = neBileyimBen;
	}

	@Override
	public String toString() {
		return "CacheGenericImportant [entry=" + entry + ", key=" + key + ", value=" + value + ", neBileyimBen="
				+ neBileyimBen + "]";
	}

}
