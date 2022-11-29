package com.ba.boost.day25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		//Minus days/weeks/months/years
		currentDateTime = currentDateTime.minusMonths(5);
		System.out.println(currentDateTime);
		
		LocalDateTime t = LocalDateTime.parse("2000-05-19T15:45");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
		t = t.minusHours(5);
		System.out.println(t.format(f));

	}

}
