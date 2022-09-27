package com.ba.boost.day12;

public class EvenNumber {

	public static void main(String[] args) {

		System.out.println(evenorOdd(4));

	}

	private static boolean evenorOdd(int a) {
		boolean b;
		if (a % 2 == 0) {
			b = true;
		} else {
			b = false;
		}
		return b;

	}

}
