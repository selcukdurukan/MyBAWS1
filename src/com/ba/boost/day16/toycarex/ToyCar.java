package com.ba.boost.day16.toycarex;

import java.util.Scanner;

public class ToyCar {

	private static int batteryCapacity = 100;
	private static int distanceX = 0;
	private static int distanceY = 0;
	private Scanner sc;
	
	void moveX() {
		if (ToyCar.batteryCapacity > 0) {
			System.out.println("Forward or Backward ? Press F or B.");
			this.sc = new Scanner(System.in);
			String moving = sc.nextLine();
			try {
				if (moving.equalsIgnoreCase("f")) {
					ToyCar.distanceX ++;
					ToyCar.batteryCapacity--;
					System.out.println("Battery: " + ToyCar.batteryCapacity + "\nX: " + ToyCar.distanceX + "\nY: " + ToyCar.distanceY );
				} else if (moving.equalsIgnoreCase("b")) {
					ToyCar.distanceX --;
					ToyCar.batteryCapacity--;
					System.out.println("Battery: " + ToyCar.batteryCapacity + "\nX: " + ToyCar.distanceX + "\nY: " + ToyCar.distanceY );
				}else {
					System.out.println("You should have pressed F or B.\n");
					moveX();
				}
			} catch (Exception e) {
				System.out.println("Please press F or B.");
				moveX();
			}
			
		} else {
			System.out.println("There isn't enough charge.");
		}
	}
	
	void moveY() {
		if (ToyCar.batteryCapacity > 0) {
			System.out.println("Forward or Backward ? Press F or B.");
			this.sc = new Scanner(System.in);
			String moving = sc.nextLine();
			try {
				if (moving.equalsIgnoreCase("f")) {
					ToyCar.distanceY ++;
					ToyCar.batteryCapacity--;
					System.out.println("Battery: " + ToyCar.batteryCapacity + "\nX: " + ToyCar.distanceX + "\nY: " + ToyCar.distanceY );
				} else if (moving.equalsIgnoreCase("b")) {
					ToyCar.distanceY --;
					ToyCar.batteryCapacity--;
					System.out.println("Battery: " + ToyCar.batteryCapacity + "\nX: " + ToyCar.distanceX + "\nY: " + ToyCar.distanceY );
				}else {
					System.out.println("You should have pressed F or B.\n");
					moveY();
				}
			} catch (Exception e) {
				System.out.println("Please press F or B");
				moveY();
			}
		} else {
			System.out.println("There isn't enough charge.");
		}		
	}
	
	void chargeCar() {
		try {
			if (ToyCar.batteryCapacity != 100 && ToyCar.batteryCapacity >= 0) {
				ToyCar.batteryCapacity++;
				System.out.println("Your car have been charged. ");
				System.out.println("Battery: " + ToyCar.batteryCapacity);
			} else {
				System.out.println("Your charging level is 100, so you can't charge your car. ");
			}
		} catch (Exception e) {
			System.out.println("Something going wrong..");
		}
	}

}
