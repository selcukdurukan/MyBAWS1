package com.ba.boost.week02.day09;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Hangi islemi yapmak istersiniz?\n\t1)Toplama icin 1'e basin. \n\t2)Carpma icin 2'ye basin.");
		int sw = sc.nextInt();

		if (sw == 1 || sw == 2 || sw == 3 || sw == 4) {
			System.out.print("Kac sayiya islem yapmak istiyorsunuz? ");
			int yourNumbers = sc.nextInt();
			ArrayList<Double> numbers = new ArrayList<>();

			for (int i = 0; i < yourNumbers; i++) {
				int a = 1 + i;
				System.out.print(a + ". sayiyi giriniz:");
				double inputNumber = sc.nextDouble();
				numbers.add(inputNumber);
			}
			
//			for (int i = 0; i < numbers.size(); i++) {
//				System.out.print(" " + numbers.get(i));
//			}
			
			switch (sw) {
			case 1:
				double result = 0;
				for (int i = 0; i < numbers.size(); i++) {
					result += numbers.get(i);
				}
				System.out.println("Toplama islemi sonucun: " + result);
				break;
			case 2:
				double result1 = 1;
				for (int i = 0; i < numbers.size(); i++) {
					result1 *= numbers.get(i);
				}
				System.out.println("Carpma islemi sonucun: " + result1);
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
