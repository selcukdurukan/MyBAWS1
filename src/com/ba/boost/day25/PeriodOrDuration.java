package com.ba.boost.day25;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodOrDuration {

	public static void main(String[] args) {
		
		
		//Period -Duration in day week month year.
		Period period = Period.of(1, 2, 3);
		System.out.println(period);
		
		//Period kullanarak zamana ekleme yapabilirsin.
		System.out.println(LocalDate.now().plus(period));
		
		//Duration - days hours minutes seconds
		Duration duration = Duration.ofDays(5);
		System.out.println(LocalDateTime.now().plus(duration));

	}

}
