package com.ba.boost.day24.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExp {

	public static void main(String[] args) {

		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		System.out.println();
		printDate(time, "dd.MMM.yyyy - HH:mm:ss");

	}

	private static void printDate(LocalDateTime time, String pattern) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
		System.out.println(pattern +"\t\t\t" +time.format(f));
	}

}
