package com.ba.boost.day57;

import com.ba.boost.day57.constructorexample.Brand;
import com.ba.boost.day57.constructorexample.Car;
import com.ba.boost.day57.constructorexample.Coachbuilder;
import com.ba.boost.day57.constructorexample.Door;
import com.ba.boost.day57.constructorexample.DoorNumber;
import com.ba.boost.day57.constructorexample.DoorType;
import java.awt.*;
public class CarTest {

	public static void main(String[] args) {

		DoorNumber doorNumber = new DoorNumber(4);
		Brand brand = new Brand("BMW");
		Door door = new Door(DoorType.BUTTERFLY);
		Coachbuilder coachbuilder = new Coachbuilder(door, brand, doorNumber);
		Car car = new Car(100000, coachbuilder);
		System.out.println(car);

		System.out.println(car.getCoachbuilder().getCarBrand().getBrand());

	}

}
