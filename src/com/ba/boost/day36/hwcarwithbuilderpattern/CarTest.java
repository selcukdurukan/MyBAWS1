package com.ba.boost.day36.hwcarwithbuilderpattern;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car.CarBuilder(ColorType.BLACK, 75).setAuto(true).setSunroof(false).build();
		System.out.println(c1);
		
		Car c2 = new Car.CarBuilder(ColorType.BLUE, 115).setAuto(false).setSunroof(true).build();
		System.out.println(c2);

	}

}
