package com.ba.boost.day17.bakkal.model;

import java.time.LocalDate;

public class MeatProduct extends AnimalProduct implements Perishable, Wholesaleable {
	
	public MeatProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate,
			AnimalProductType type) {
		super(name, unit, unitPrice, quantity, productionDate, type);
	}

	@Override
	public int calculateDaysToPerish() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getShelfLifeInDays() {
		return 15;
	}

	@Override
	public boolean expired() {
		return false;
	}

	@Override
	public int getWholeUnitAmount() {
		return 100;
	}	

}
