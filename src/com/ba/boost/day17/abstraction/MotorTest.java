package com.ba.boost.day17.abstraction;

public class MotorTest {

	public static void main(String[] args) {
		
//		MotorBike motorbike = new MotorBike();     // This cannot work because MotorBike is abstract class.
		
		MotorBike sport = new SportBike();
		MotorBike mountain = new MountainBike();
		
		sport.brake();
		mountain.brake();
		sport.brake1();

	}

}
