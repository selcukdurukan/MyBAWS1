package com.ba.boost.day17.bakkal.model;

import java.time.LocalDate;

public class FruitAndvegetable extends Product implements Perishable {

	public FruitAndvegetable(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super(name, unit, unitPrice, quantity, productionDate);
	}

	@Override
	public int calculateDaysToPerish() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean expired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getShelfLifeInDays() {
		// TODO Auto-generated method stub
		return 8;
	}

}
