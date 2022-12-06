package com.ba.boost.day35.factoryexample.differentsolution;

public class HatchbackCar extends Car {

	public HatchbackCar() {
		super(CarType.HATCHBACK);
		construct();
	}

	@Override
	void placeGasTank() {
		
		System.out.println("40L gas tank placed");
		
	}

	@Override
	void insertTyres() {

		System.out.println("Inserted 19' tyres");
		
	}

}
