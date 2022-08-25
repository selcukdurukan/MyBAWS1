package com.ba.boost.week02.day7;

import java.util.Scanner;

public class ThreeVariables {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("This program calculates A*(B+C). ");
		
		System.out.print("Please enter A of number: ");
		int A = sc.nextInt();
		
		System.out.print("Please enter B of number: ");
		int B = sc.nextInt();
		
		System.out.print("Please enter C of number: ");
		int C = sc.nextInt();
		
		System.out.println("Result is: " + (A*(B+C)));

	}

}
