package com.ba.boost.week02.day08;

import java.util.Scanner;

public class HMBodyMassIndex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen cinsiyetinizi giriniz(k veya e): ");
		String gender = scan.nextLine();
		

		if (!(gender.equalsIgnoreCase("k") || gender.equalsIgnoreCase("e"))) {
			System.out.println("Yanlis harfe bastiniz lutfen k veya e'ye basiniz.");
		} else {
			System.out.println("Lutfen kilonuzu girin(kg): ");
			double weight = scan.nextDouble();

			System.out.println("Lutfen boyunuzu girin(cm): ");
			double height = scan.nextDouble();
			
			scan.close();

			double result = (weight * 10000) / (Math.pow(height, 2));

			if (gender.equalsIgnoreCase("k")) {
				if (result < 19) {
					System.out.println("Zayifsiniz.");
				} else if (result >= 19 && result < 25) {
					System.out.println("Normalsiniz.");
				} else if (result >= 25 && result < 30) {
					System.out.println("Şişmansiniz");
				} else if (result >= 30) {
					System.out.println("Obezsiniz.");
				} else {
					System.out.println("Something going wrong...");
				}

			} else if (gender.equalsIgnoreCase("e")) {
				if (result < 20) {
					System.out.println("Zayifsiniz.");
				} else if (result >= 20 && result < 26) {
					System.out.println("Normalsiniz.");
				} else if (result >= 26 && result < 30) {
					System.out.println("Şişmansınız");
				} else if (result >= 30) {
					System.out.println("Obezsiniz.");
				} else {
					System.out.println("Something going wrong...");
				}

			} else {
				System.out.println("Something going wrong.");
			}
		}

	}

}
