package com.ba.boost.day35.factoryexample.differentsolution;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	void placeGasTank() {
		
		System.out.println("50L gas tank placed");
		
	}

	@Override
	void insertTyres() {

		System.out.println("Inserted 21' tyres");
		
	}

}
