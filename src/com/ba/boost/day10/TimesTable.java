package com.ba.boost.day10;

public class TimesTable {

	public static void main(String[] args) {
		
		for (int j = 1; j <= 10; j++) {
			int result1 = j;
			for (int i = 1; i <= 10; i++) {
				int result2 = result1*i;
				System.out.print(j + " * " + i + " = " + result2 + "\t");
			}
			System.out.println();
		}


	}

}
