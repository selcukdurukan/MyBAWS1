package com.ba.boost.day35.factoryexample.differentsolution;

public class Test {

	public static void main(String[] args) {
		
	System.out.println(CarFactory.buildCar(CarType.HATCHBACK));	;
	System.out.println(CarFactory.buildCar(CarType.HATCHBACK));	;
	System.out.println(CarFactory.buildCar(CarType.SEDAN));	;
	System.out.println(CarFactory.buildCar(CarType.JEEP));	;

	}

}
