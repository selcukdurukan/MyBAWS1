package com.ba.boost.day09.review;

public class ForTest {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". Durukan");
		}

		int j = 1;
		for (; j <= 5; j++) {
			System.out.println(j + ". Kaan");
		}

		int k = 1;
		for (; k <= 5;) {
			System.out.println(k + ". Mehmet");
			k++;
		}

		int l = 1;
		for (; ; ) {
			System.out.println(l + ". Mert");
			l++;
			if (l>5) {
				break;
			}
		}
		
		double a = Double.MAX_VALUE;
	}
}
