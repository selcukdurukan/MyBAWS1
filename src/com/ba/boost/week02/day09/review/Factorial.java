package com.ba.boost.week02.day09.review;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write a positive integer number to calculate factorial: ");
		double yourNumber = scan.nextInt();
		System.out.println("Your factorial number is: " + yourNumber);
		scan.close();
		
	    double a = yourNumber;
		for (double i = 1; i < a; i++) {
			yourNumber = yourNumber * i;	
		}
		System.out.println("\n" + a + " factorial is " + yourNumber);
		
	}
	


}
