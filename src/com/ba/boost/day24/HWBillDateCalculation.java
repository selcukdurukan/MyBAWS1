package com.ba.boost.day24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HWBillDateCalculation {

	public static void main(String[] args) {

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		Scanner sc = new Scanner(System.in);
	

		while (true) {
			System.out.print("Please write date to calculate payment day, format should be like this dd.MM.yyyy: ");
			String input = sc.nextLine();
			if (input.isEmpty()) {
				break;
			}
			int day = 15;
			LocalDate inputDate = LocalDate.parse(input, f);
			System.out.println(inputDate.format(f));
			if (inputDate.getDayOfMonth() < 15) {
				int month = inputDate.getMonthValue();
				int year = inputDate.getYear();
				LocalDate paymentDate = LocalDate.of(year, month, day);
				System.out.println("New payment date is " + paymentDate.format(f) + ".");
			} else {
				LocalDate newDate = inputDate.plusMonths(1);
				int month = newDate.getMonthValue();
				int year = newDate.getYear();
				LocalDate paymentDate = LocalDate.of(year, month, day);
				System.out.println("New payment date is " + paymentDate.format(f) + ".");
			}
		}
		
		System.out.println("bye...");

	}

}
