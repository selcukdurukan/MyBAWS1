package com.ba.boost.week02.day09;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {

		boolean i = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please write a number to see stars in your computer screen:");
			int input = sc.nextInt();

			for (int k = 0; k < input;) {
				System.out.print("* ");
				for (int j = 0; j < k;) {
					System.out.print("* ");
					j++;
				}
				System.out.println();
				k++;
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you wanna continue? Please push \"E\"");
			String input2 = scan.nextLine();
			
			if (input2.equalsIgnoreCase("e")) {
				i = true;
			} else if (!input2.equalsIgnoreCase("e")) {
				i = false;
			}
		} while (i);
		System.out.println("Bye....");
	}

}
