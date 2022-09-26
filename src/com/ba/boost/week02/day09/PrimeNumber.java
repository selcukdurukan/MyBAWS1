package com.ba.boost.week02.day09;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Bu program girdiginiz pozitif sayiyi asal mi degil mi diye kontrol eder. \n\t Lutfen bir sayi giriniz: ");
		int input = sc.nextInt();

		if (input < 0) {
			System.out.println("Lutfen pozitif bir sayi giriniz. Asal sayilar pozitiftir.");
		} else if (input == 0) {
			System.out.println("Bu sayi asal degil.");
		} else if (input == 1) {
			System.out.println("Bu sayi asal degil.");
		} else if (input == 2) {
			System.out.println("Bu sayi asaldir.");
		} else if (input > 1) {
			int temp = 0;
			int tempResult = 0;
			for (int i = 2; i < input; i++) {
				temp = input % i;
				if (temp == 0) {
					tempResult = 1;
					break;
				} else if (temp != 0) {
					tempResult = 2;
				} else {
					System.out.println("Something going wrong...");
				}
			}
			switch (tempResult) {
			case 1:
				System.out.println("Bu sayi asal degil.");
				break;
			case 2:
				System.out.println("Bu sayi asaldir.");
				break;
			default:
				System.out.println("Something going wrong...");
				break;
			}
		} else {
			System.out.println("Something going wrong...");
		}
		sc.close();
	}

}
