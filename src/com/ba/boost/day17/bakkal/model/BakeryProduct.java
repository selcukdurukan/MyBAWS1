package com.ba.boost.day17.bakkal.model;

import java.time.LocalDate;

public class BakeryProduct extends Product{

	public BakeryProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super(name, unit, unitPrice, quantity, productionDate);
	}

	@Override
	public String toString() {
		return "BakeryProduct [toString()=" + super.toString() + "]";
	}

	@Override
	public boolean expired() {
		return false;
	}

	
	
}
