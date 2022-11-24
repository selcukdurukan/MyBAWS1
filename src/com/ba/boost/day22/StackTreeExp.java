package com.ba.boost.day22;

public class StackTreeExp {

	public static void main(String[] args) {
		
		methodA();

	}

	private static void methodA() {
		methodB();
		
	}

	private static void methodB() {
		methodC();
		
	}

	private static void methodC() {
		System.out.println(3 / 0);
		
	}

}
