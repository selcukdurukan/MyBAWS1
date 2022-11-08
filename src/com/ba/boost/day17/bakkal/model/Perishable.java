package com.ba.boost.day17.bakkal.model;

public interface Perishable {
	
//	public static final int XXX;   -- Muhakkak bir değere sahip olması gerekir.
	
	int calculateDaysToPerish(); // It's always public and abstract when you use this like, and also we know abstract method should always be public.
	
	int getShelfLifeInDays();
	
	
	default boolean isPerished() {
		return false;
	}
}
