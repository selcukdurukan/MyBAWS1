package com.ba.boost.day17.bakkal.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MilkProduct extends AnimalProduct implements Perishable{

	private boolean bottled;
	private boolean lactoseFree;
	
	

	public MilkProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate,
			AnimalProductType type, boolean bottled, boolean lactoseFree) {
		super(name, unit, unitPrice, quantity, productionDate, type);
		this.bottled = bottled;
		this.lactoseFree = lactoseFree;
	}

	@Override
	public boolean isPerished() {
		return this.expired();
	}
	
	@Override
	public int calculateDaysToPerish() {
		LocalDate today = LocalDate.now();
		int daysOnShelf = (int)Duration.between(this.getProductionDate(), today).toDays();
		return getShelfLifeInDays() - daysOnShelf;
	}			
	
	@Override
	public boolean expired() {
		LocalDate today = LocalDate.now();
		long days = this.getProductionDate().until(today, ChronoUnit.DAYS);
		return days > getShelfLifeInDays();
	}

	@Override
	public int getShelfLifeInDays() {
		return 10;
	}



	public boolean isBottled() {
		return bottled;
	}
	public void setBottled(boolean bottled) {
		this.bottled = bottled;
	}
	public boolean isLactoseFree() {
		return lactoseFree;
	}
	public void setLactoseFree(boolean lactoseFree) {
		this.lactoseFree = lactoseFree;
	}

	public void aMethod () {
		
	}
	
	@Override
	public String toString() {
		return "MilkProduct [shelfLifeInDays=" + this.getShelfLifeInDays() + ", bottled=" + bottled + ", lactoseFree="
				+ lactoseFree + ", type=" + this.getType() + ", toString()=" + super.toString() + "]";
	}










	
	
	
	
	
	
	
}
