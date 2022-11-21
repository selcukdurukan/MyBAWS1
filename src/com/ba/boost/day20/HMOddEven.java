package com.ba.boost.day20;

import java.util.ArrayList;

public class HMOddEven {

	public static void main(String[] args) {

		ArrayList<Integer> evenNumbers = new ArrayList<>();
		ArrayList<Integer> oddNumbers = new ArrayList<>();

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				evenNumbers.add(i);
				if (i < 10) {
					evenNumbers.removeAll(evenNumbers);
				}
			} else {
				oddNumbers.add(i);
			}
		}
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);

	}

}
