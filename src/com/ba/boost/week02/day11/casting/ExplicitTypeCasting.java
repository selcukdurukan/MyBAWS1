package com.ba.boost.week02.day11.casting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {

		double higherType = 32.568;
		int lowerType = (int)higherType; // Narrrowing typecasting. there is big problem because int is 32-bit and double
											// is 64-bit. Data could be lost.
		
		System.out.println(lowerType);
	}

}
