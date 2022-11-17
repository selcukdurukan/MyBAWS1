package com.ba.boost.day17.bakkal.model;

import java.time.LocalDate;

public class Cheese extends MilkProduct implements Perishable{

	public Cheese(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate,
			AnimalProductType type, boolean bottled, boolean lactoseFree) {
		super(name, unit, unitPrice, quantity, productionDate, type, bottled, lactoseFree);
		//TODO Auto-generated constructor stub
	}

	private CheeseProductType type;

	@Override
	public int calculateDaysToPerish() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getShelfLifeInDays() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public boolean expired() {
		// TODO Auto-generated method stub
		return false;
	}

}
