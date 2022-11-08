package com.ba.boost.day17.bakkal.model;

import java.time.LocalDate;

public class HardwareProduct extends Product implements Wholesaleable {

	public HardwareProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super(name, unit, unitPrice, quantity, productionDate);

	}

	@Override
	public boolean expired() {
		return false;
	}

	@Override
	public int getWholeUnitAmount() {
		return 50;
	}

}
