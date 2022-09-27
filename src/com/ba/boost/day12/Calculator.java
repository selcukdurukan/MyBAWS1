package com.ba.boost.day12;

public class Calculator {

	public static void main(String[] args) {

		double a = divide(add(4,5) , divide(6,3));
		System.out.println(a);
		
		
		House.buildHousewithNumber(2);
		
		System.out.println(quadrat(5));
		System.out.println(multipy(5,4));
		
		int x = 10;
		
		System.out.println(quadrat(x));
		System.out.println(x);
		
	}

	private static double multipy(double a, double b) {
		
		return a*b;
	}

	private static double quadrat(double a) {
		return multipy(a,a);
		
	}

	private static double divide(double a, double b) {
		
		return a/b;	
	}
	
 	private static int divide(int a, int b) {
		
		return a/b;	
	}
	
	private static int add(int a, int b) {
		
		return a+b;
	}

}
