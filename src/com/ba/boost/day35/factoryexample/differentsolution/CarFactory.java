package com.ba.boost.day35.factoryexample.differentsolution;

public class CarFactory {
	
	public static Car buildCar(CarType model) {
		
		switch (model) {
		case HATCHBACK:
			return new HatchbackCar();
		case SEDAN:
			return new SedanCar();
		case JEEP:
			return new JeepCar();
		default:
			//
			break;
		}
		return null;
		
	}
	
}
