package com.ba.boost.week02.day09.review;

import java.util.Scanner;

public class Test2 {
static Scanner msg = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = 0;
		while (a == 0 ) {
			System.out.print("Please write true number, integer, to connect internet (0-100) : ");
			int b = msg.nextInt();
			if (b==100) {
				System.out.println("True number.");
				break;
			} else {
				System.out.println("Wrong number.");
				continue;
			}
		}
		msg.close();
		System.out.println("bye...");

	}

}
