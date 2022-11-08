package com.ba.boost.day17.bakkal.model;

import java.time.LocalDate;

public abstract class AnimalProduct extends Product{
	

	private AnimalProductType type; // koyun - keci -inek
	
	public AnimalProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate,
			AnimalProductType type) {
		super(name, unit, unitPrice, quantity, productionDate);
		this.type = type;
	}
	public AnimalProductType getType() {
		return type;
	}
	public void setType(AnimalProductType type) {
		this.type = type;
	}
	

}
