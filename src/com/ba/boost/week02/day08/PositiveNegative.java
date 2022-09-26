package com.ba.boost.week02.day08;

import java.util.Scanner;

public class PositiveNegative {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Please enter a number: ");
		double number = sc.nextDouble();
		
		
		if (number<0) {
			System.out.println("Your number is negative.");
		}else if (number == 0) {
			System.out.println("Your number is zero, so not negative or not positive.");
		}else {
			System.out.println("Your number is positive.");
		}
	}

}
