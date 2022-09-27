package com.ba.boost.day10;

import java.util.Scanner;

public class ObebOkek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write a first number: ");
		int input = sc.nextInt();

		System.out.print("Please write a second number: ");
		int input1 = sc.nextInt();
		sc.close();
		System.out.println();
		
		if (input < input1) {
			int a = input;
			int d = input1;
			while (true) {
				int b = input1 % a;
				int c = input % a;
				if (b == 0 && c == 0) {
					System.out.print("\tOBEB: ");
					System.out.println(a);
					break;
				}
				a--;
			}
			while (true) {
				int e = d % input1;
				int f = d % input;
				if (e == 0 && f == 0) {
					System.out.print("\tOKEK: ");
					System.out.println(d);
					break;
				}
				d++;
			}
		} else {
			int a = input1;
			int d = input;
			while (true) {
				int b = input1 % a;
				int c = input % a;
				if (b == 0 && c == 0) {
					System.out.print("\tOBEB: ");
					System.out.println(a);
					break;
				}
				a--;
			}
			while (true) {
				int e = d % input1;
				int f = d % input;
				if (e == 0 && f == 0) {
					System.out.print("\tOKEK: ");
					System.out.print(d);
					break;
				}
				d++;
			}
		}
	}
}
