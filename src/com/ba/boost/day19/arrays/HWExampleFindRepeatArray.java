package com.ba.boost.day19.arrays;

import java.util.Arrays;

public class HWExampleFindRepeatArray {

	public static void main(String[] args) {

		// MAX AND MİN

		int[] arrays1 = { 56, 34, 1, 8, 101, -2, -33 };

		Arrays.sort(arrays1);
		System.out.println("MAX: " + arrays1[arrays1.length - 1]);
		System.out.println("MIN: " + arrays1[0]);

		// Repeat

		int[] arrays2 = { 3, 7, 12, 43, 54, 43, 28, 3, 19, -24, -19 };
		Arrays.sort(arrays2);
		System.out.println(Arrays.toString(arrays2));
		
		int a = 1;
		for (int i = 1; i < arrays2.length; i++) {
			if (arrays2[i-1] == arrays2[i]) {
				System.out.println(a+ ". number: "+arrays2[i]);
				a++;
			}
		}
		

	}

}
