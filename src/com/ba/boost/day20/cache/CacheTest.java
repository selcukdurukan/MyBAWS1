package com.ba.boost.day20.cache;

public class CacheTest {

	public static void main(String[] args) {
		
		CacheString cacheString = new CacheString();
		CacheShirt cacheShirt = new CacheShirt();
		
		cacheString.add("Bir gun okula giderken...");
		System.out.println(cacheString.getEntry());
		
		
		cacheShirt.add(new Shirt("Mavi", "Kirmizi"));
		System.out.println(cacheShirt.getEntry());
		
		
		
		CacheGeneric<Shirt> shirts = new CacheGeneric<>();
		shirts.add(new Shirt("Mavi", "Kirmizi"));
		System.out.println(shirts.getEntry());
		
		CacheGeneric<Integer> integers = new CacheGeneric<>();
		integers.add(1);
		System.out.println(integers.getEntry());
		
		
		
		CacheGenericImportant<Integer, String, Boolean, Double> importants = new CacheGenericImportant<>();
		importants.setEntry(10);
		importants.setKey("Ali");
		importants.setValue(false);
		importants.setNeBileyimBen(15.2);
		
		System.out.println(importants);

	}

}
