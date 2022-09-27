package com.ba.boost.day11.casting;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		
		int lowerType = 31534456;
		long higherType = lowerType;    // Widening typecasting. there is no problem because int is 32-bit and long is 64-bit.
		
		System.out.println(higherType);

	}

}
