package com.ba.boost.day35.factoryexample;

public class CarFactoryTest {

	public static void main(String[] args) {

		Car car1 = CarFactory.create("Hatchback");
		System.out.println(car1);

		Car car2 = CarFactory.create("Sedan");
		System.out.println(car2);

		Car car3 = CarFactory.create("Jeep");
		System.out.println(car3);

	}

}
