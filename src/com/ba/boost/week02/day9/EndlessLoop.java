package com.ba.boost.week02.day9;

import java.util.Scanner;

public class EndlessLoop {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int input = 0;
		int i = 0;

		
		while (i <= 10) {
			System.out.print("Please enter a number expect of 99: ");
			input = sc.nextInt();
			
			if (input == 99) {
				System.out.println("Keske baska bir sayi girseydiniz. ");
				break;
			}
			System.out.println("Girdiginiz sayi"+ " "+input);
		}
		System.out.println("Bye..");
		sc.close();

	}

}
