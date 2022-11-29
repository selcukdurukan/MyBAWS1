package com.ba.boost.day25;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExp2 {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2015-11-03");
		LocalDate d2 = LocalDate.parse("2015-12-15");
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		
		System.out.println(d1.format(f));
		System.out.println(d2.format(f));
		
		//1. Solution
		System.out.println(d1.until(d2, ChronoUnit.DAYS));
		
		//2. Solution
		System.out.println(Period.between(d1, d2));
		
		//3. Solution
		long solution = ChronoUnit.DAYS.between(d1, d2);
		System.out.println(solution);
		
		//The best solution
		Period p = Period.between(d1, d2);
		long p2 = ChronoUnit.DAYS.between(d1, d2);
		System.out.println("Years: " +  p.getYears() + ", Months: " +p.getMonths() + ", Days: " + p.getDays() + "(Total Days: " + p2 + ")" );

	}

}
