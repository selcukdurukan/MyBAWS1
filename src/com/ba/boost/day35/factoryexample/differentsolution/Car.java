package com.ba.boost.day35.factoryexample.differentsolution;

public abstract class Car {
	
	private CarType model;
	
	public Car(CarType model) {
		super();
		this.model = model;
	}
	
	abstract void placeGasTank();
	abstract void insertTyres();
	
	protected void construct() {
		placeGasTank();
		insertTyres();
	}
	
}
