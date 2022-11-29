package com.ba.boost.day25;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExp2 {

	public static void main(String[] args) {
		
		LocalDateTime d1 = LocalDateTime.parse("2007-12-03T10:15:30");
		LocalDateTime d2 = LocalDateTime.parse("2007-12-01T10:15:30");
		
		DateTimeFormatter f =  DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
		
		System.out.println(d1.format(f));
		System.out.println(d2.format(f));
		
		//d2'den d1'e kac gün var?
		System.out.println(d2.until(d1, ChronoUnit.DAYS));
		
		//with Duration
		System.out.println(Duration.between(d1, d2));  //if you use LocalDate class, you should use period
		

	}

}
