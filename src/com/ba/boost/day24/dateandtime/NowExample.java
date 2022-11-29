package com.ba.boost.day24.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NowExample {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		System.out.println("localTime: " + localTime);
		System.out.println("localDate: " + localDate);
		System.out.println("localDateTime: " + localDateTime);
		System.out.println("zonedDateTime: " + zonedDateTime);

		// Parse
		LocalDate d = LocalDate.parse("2000-05-19"); // hep aynı formatta kullan yyyy-dd-gg
		System.out.println(d);

		LocalDateTime t = LocalDateTime.parse("2000-05-19T15:45"); // hep aynı formatta kullan yyyy-dd-ggTss:ss
		System.out.println(t);
		
		System.out.println();
		// Formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
		d = LocalDate.parse("22.10.2022", formatter);
		System.out.println(d.format(formatter));

		int year = 2022;
		int month = 10;
		int day = 20;
		System.out.println(LocalDate.of(year, month, day).format(formatter));

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.uuuu - HH:mm:ss");
		System.out.println(LocalDateTime.of(year, month, day, 15, 45, 33).format(formatter2));

		// After
		String msg = (d.toString() + " tarihi " + LocalDate.now() + " tarihinden "+ (d.isAfter(LocalDate.now()) ? "sonradir. " : "oncedir."));
		System.out.println(msg);

		//ChronoUnit
		System.out.println(d.until(LocalDate.now(), ChronoUnit.WEEKS));
		

	}

}
