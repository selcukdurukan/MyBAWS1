package com.ba.boost.day22;

public class IfYouDontKnowWhichException {

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
		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.err.println("Bir hata olustu: " + e.getMessage() +" - " + e.getClass());  //Bu şekilde hatanın ne oldugunu ögrenebilirsin.
		}
		
		
		
	}

}
