package com.ba.boost.day35.factoryexample.differentsolution;

public class JeepCar extends Car {

	public JeepCar() {
		super(CarType.JEEP);
		construct();
	}

	@Override
	void placeGasTank() {
		
		System.out.println("60L gas tank placed");
		
	}

	@Override
	void insertTyres() {

		System.out.println("Inserted 23' tyres");
		
	}

	@Override
	public String toString() {
		return "JeepCar [getClass()=" + getClass().getSimpleName() + "]";
	}
	
	

}
