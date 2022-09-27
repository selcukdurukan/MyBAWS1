package com.ba.boost.day12;

public class RecursiceFactorial1 {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}

	private static int factorial(int a) {
		
		 if (a==0) return 1;	
		return a*factorial(a-1);
	}
	/*
	 * a=5;
	 * return 5*factorial(4)
	 * factorial(4) = 4 * factorial(3)
	 * factorial(3) = 3 * factorial(2)
	 * factorial(2) = 2 * factorial(1)
	 * factorial(1) = 1 * factorial(0) 
	 * factorial(0) = 1
	 * 
	 */

}
