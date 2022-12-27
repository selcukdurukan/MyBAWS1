package com.ba.boost.atclass;

public class AdditionWithoutAddition {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 20;
		
		System.out.println(AdditionWithoutAddition.add(a,b));

	}

	private static int add(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;
		if (a > 0) return a= -a;
		if (b < 0) b = -b;
		
		if (b > 0) {
			for (int i = b; i > 0; i--) {
				a -=1;
			}
		} else {

		}
		
		return -a;
	}

}
