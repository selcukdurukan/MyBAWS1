package com.ba.boost.day35.factory2;

import java.util.Scanner;

public class FactoryTest {

	public static void main(String[] args) {
		
		System.out.print("Enter the name of plan you wanna to generate: ");
		Scanner sc = new Scanner(System.in);
		String planName = sc.nextLine();
		
		System.out.print("Enter number of units you wanna to calculate for " + planName + " : ");
		int units = sc.nextInt();
		
		sc.close();
		
		Plan plan = PlanFactory.create(planName);
		plan.getRate();
		System.out.print("Bill for " + planName + " is: ");
		plan.calculateBill(units);
	
	}

}
