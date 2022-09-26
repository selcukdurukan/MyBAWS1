package com.ba.boost.week02.day10;

import java.util.Scanner;

public class ScannerHasNextInttoRestirct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please write number: ");
		
		if (sc.hasNextInt()) {
			int input = sc.nextInt();
			System.out.println(input);
		} else {
			System.out.println("Please write number!!");
		}
		sc.close();
	}

}
