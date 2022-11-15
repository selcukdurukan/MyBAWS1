package com.ba.boost.day17.hospital;

import java.util.Scanner;

public class Child extends Person {

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, boolean isHealthy, int age) {
		super(name, isHealthy, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void examination() {
		if (super.isHealthy() == false) {
			System.out
					.println("Child's examination has been done, but s/he is a patient so her/his medicine is here...");
		} else if (super.isHealthy() == true) {
			System.out.println("Child's check up has been done.");
		} else {
			System.out.println("Something went wrong...");
		}
	}

	public void measlesVaccine() {
		System.out.println("Does " + super.getName() + " have measles vaccine? Y/N");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if (input.equalsIgnoreCase("y")) {
			System.out.println("OK... WELLL - " + super.getName());
		} else if (input.equalsIgnoreCase("n")) {
			System.out.println("OK..... Your child must be gotten vacinated. " + super.getName());
		} else {
			System.out.println("Something going wrong...");
		}
		sc.close();
	}

}
