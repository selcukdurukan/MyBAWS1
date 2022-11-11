package com.ba.boost.day16.toycarex;

import java.util.Scanner;

public class ToyCarTest {

	public static void main(String[] args) {
		
		menu();

	}

	private static void menu() {
		
		System.out.println("ToyCar");
		while (true) {
			try {
				System.out.println("\t1 - Press 1 to move in the direction X.");
				System.out.println("\t2 - Press 2 to move in the direction Y.");
				System.out.println("\t3 - Press 3 to charge your car.");
				System.out.println("\t4 - Press 4 to quit.");
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				ToyCar toycar = new ToyCar();
				if (input == 1) {
					toycar.moveX();
				} else if (input == 2) {
					toycar.moveY();
				} else if (input == 3) {
					toycar.chargeCar();
				} else if (input == 4){
					System.out.println("Bye....");
					break;
				} else {
					System.out.println("You should have pressed 1, 2, 3 or 4.");
				}
			
			} catch (Exception e) {
				System.out.println("You should have pressed 1, 2, 3 or 4.");
			}
		}

	}
}
