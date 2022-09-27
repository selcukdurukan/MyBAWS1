package com.ba.boost.day12;

public class FindMinimum {

	public static void main(String[] args) {
		
		findMin(4,4);

	}

	private static double findMin(double a, double b) {
		if (a<b) {
			System.out.println(a + " is min number.");
		} else if (b<a){
			System.out.println(b + " is min number.");
		} else {
			System.out.println("These two numbers are equal each other.");
		}	
		return b;		
	}

}
