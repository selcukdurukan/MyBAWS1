package com.ba.boost.day25;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndLocalDateExp {
	/*
	 * New type date and time with cagri teacher afte Java 8
	 */

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate twentySevenMarch2017LocalDate = LocalDate.of(2017, 03, 27);
		System.out.println(twentySevenMarch2017LocalDate);
		
		twentySevenMarch2017LocalDate = twentySevenMarch2017LocalDate.withYear(2023).withMonth(03).withDayOfMonth(25);
		System.out.println(twentySevenMarch2017LocalDate);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(twentySevenMarch2017LocalDate.format(f));
		
		//plus days/weeks/months/years
		twentySevenMarch2017LocalDate = twentySevenMarch2017LocalDate.plusDays(1);
		System.out.println(twentySevenMarch2017LocalDate.format(f));
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(currentTime.format(t));
	}

}
