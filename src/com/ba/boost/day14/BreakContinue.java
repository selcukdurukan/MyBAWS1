package com.ba.boost.day14;

public class BreakContinue {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 4; i++) {
			if (i==2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Outside of loop.");
		
		for (int i = 0; i < 4; i++) {
			if (i==2) {
				System.out.println("Burasi cok tehlikeli.");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Outside of loop.");
		
		
		for (int i = 0; i < 4; i++) {
			if (i==2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Outside of loop.");
	}

}
