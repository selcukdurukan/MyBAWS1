package com.ba.boost.week02.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write number to calculate fibonacci series: ");
		int input = sc.nextInt();
		System.out.println();
		List<Integer> arList = new ArrayList<>();
		sc.close();

		if (input == 2) {
			arList.add(0);
			arList.add(1);
			for (int j = 0; j < arList.size(); j++) {
				System.out.print(arList.get(j) + " ");
			}

		} else if (input == 1) {
			arList.add(0);
			for (int c = 0; c < arList.size(); c++) {
				System.out.print(arList.get(c) + " ");
			}

		} else if (input >= 3 ); {
			arList.add(0);
			arList.add(1);
			int i = 0;
			for (; i < input; i++) {
				int a = arList.get(i+1) + arList.get(i) ;
				arList.add(i+2, a);
			}
			arList.remove(i+1);
			for (int l = 0; l < arList.size(); l++) {
				System.out.print(arList.get(l) + " ");
			}

		}

	}

}
