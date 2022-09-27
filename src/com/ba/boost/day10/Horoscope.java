package com.ba.boost.day10;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write your birth month: ");
		String month = sc.next();

		System.out.print("Please write your birth day: ");
		int day = sc.nextInt();
		sc.close();
		
		if (month.equalsIgnoreCase("january")) {
			if (day <= 21 && day > 0) {
				System.out.println("Oglak");
			} else if (day >= 22 && day <= 31) {
				System.out.println("Kova");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("february")) {
			if (day <= 19 && day > 0) {
				System.out.println("Kova");
			} else if (day >= 20 && day <= 29) {
				System.out.println("Balik");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("march")) {
			if (day <= 20 && day > 0) {
				System.out.println("Balik");
			} else if (day >= 21 && day <= 31) {
				System.out.println("Koc");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("April")) {
			if (day <= 20 && day > 0) {
				System.out.println("Koc");
			} else if (day >= 21 && day <= 30) {
				System.out.println("Boga");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("may")) {
			if (day <= 21 && day > 0) {
				System.out.println("Boga");
			} else if (day >= 22 && day <= 31) {
				System.out.println("Ikızler");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("june")) {
			if (day <= 22 && day > 0) {
				System.out.println("Ikızler");
			} else if (day >= 23 && day <= 30) {
				System.out.println("Yengec");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("july")) {
			if (day <= 22 && day > 0) {
				System.out.println("Yengec");
			} else if (day >= 23 && day <= 31) {
				System.out.println("Aslan");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("August")) {
			if (day <= 22 && day > 0) {
				System.out.println("Aslan");
			} else if (day >= 23 && day <= 31) {
				System.out.println("Basak");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("Semptember")) {
			if (day <= 22 && day > 0) {
				System.out.println("Basak");
			} else if (day >= 23 && day <= 30) {
				System.out.println("Terazi");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("october")) {
			if (day <= 22 && day > 0) {
				System.out.println("Terazi");
			} else if (day >= 23 && day <= 31) {
				System.out.println("Akrep");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("Novomber")) {
			if (day <= 21 && day > 0) {
				System.out.println("Akrep");
			} else if (day >= 22 && day <= 30) {
				System.out.println("Yay");
			} else {
				System.out.println("Please write day corretly");
			}
		} else if (month.equalsIgnoreCase("December")) {
			if (day <= 21 && day > 0) {
				System.out.println("Yay");
			} else if (day >= 22 && day <= 31) {
				System.out.println("Oglak");
			} else {
				System.out.println("Please write day corretly");
			}
		} else {
			System.out.println("Please write month corretly!!");
		}

	}

}
