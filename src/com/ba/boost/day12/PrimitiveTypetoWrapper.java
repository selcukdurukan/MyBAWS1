package com.ba.boost.day12;

public class PrimitiveTypetoWrapper {

	public static void main(String[] args) {
		
		int a = 5;
		Integer aObj = Integer.valueOf(a);
		
		if (aObj instanceof Integer) {
			System.out.println("It is integer.");
		} else {
			System.out.println("It's not integer.");
		}
		
		//autoboxing
		
		int a1 = 10;
		
		Integer aObj1 = a1; // converts wrapper class.

		double b = 10.5;
		
		Double bObj = b; // converts wrapper class.
		
		
	}

}
