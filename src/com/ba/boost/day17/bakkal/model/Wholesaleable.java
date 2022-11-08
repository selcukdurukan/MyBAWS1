package com.ba.boost.day17.bakkal.model;

public interface Wholesaleable {
	
	default double getDiscountRate() {
		return 0.15;
	}
	
	int getWholeUnitAmount();

}
