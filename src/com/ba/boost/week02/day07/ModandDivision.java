package com.ba.boost.week02.day07;

import java.util.Scanner;

public class ModandDivision {
	static Scanner sc = new Scanner(System.in);
	
	void read() {
		
		System.out.print("Please enter first number: ");
		double FirstNumber = sc.nextInt();
		
		System.out.print("Please enter first number: ");
		double SecondNumber = sc.nextInt();
		
		System.out.println("Division : " + FirstNumber/SecondNumber);
		System.out.println("Mod: " +  FirstNumber%SecondNumber);
		
	}

	public static void main(String[] args) {
		
		ModandDivision x = new ModandDivision();
		x.read();
	}

}
