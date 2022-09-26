package com.ba.boost.week02.day12;

import java.util.Scanner;

public class House {

	public static void main(String[] args) {
		
		buildHouse();

	}

	public static int buildHousewithNumber(int a) {
		House roof = new House();
		roof.buildRoof();

		for (int i = 0; i < a; i++) {
			buildFloor();
		}
		return a;		
	}

	public static void buildHouse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many floors do you want to have own house? ");
		int input = sc.nextInt();
		sc.close();

		House roof = new House();
		roof.buildRoof();

		for (int i = 0; i < input; i++) {
			buildFloor();
		}

	}

	public void buildRoof() {
		System.out.println("      ____");
		System.out.println("     /    \\");
		System.out.println("    /      \\");
		System.out.println("   /        \\");
		System.out.println("  /          \\");
		System.out.println(" /            \\");
		System.out.println("/              \\");
		System.out.println("+==============+");
	}

	public static void buildFloor() {

		System.out.println("|              |");
		System.out.println("|              |");
		System.out.println("|              |");
		System.out.println("|              |");
		System.out.println("|              |");
		System.out.println("+==============+");

	}
}