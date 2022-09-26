package com.ba.boost.week02.day09;

import java.util.Scanner;

public class Factorial {
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int number = 0;
		int factorial;
			
		while (true) {
			System.out.print("Lutfen 10'ten kucuk ve 99'dan farkli bir sayi giriniz: ");
			number = sc.nextInt();
			if (number == 99) {
				break;
			}
			if (number < 1 && number > 10) {
				System.err.println("Hatali sayi girdiniz. ");
				continue;
			}
			
	
			}
			factorial = 1;
			for (int i = 1; i <= number; i++) {
			factorial *=  i;
			System.out.println(number + "\'in faktoriyeli " + factorial + "dir.");
		}
		

		
		
		
	}

}
