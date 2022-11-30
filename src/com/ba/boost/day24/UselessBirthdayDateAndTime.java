package com.ba.boost.day24;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UselessBirthdayDateAndTime {

	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while (true){
			System.out.print("Please write birthday, like this dd.MM.yyy: ");
			input = sc.nextLine();
			
			if (input.isEmpty()) {
				break;
			}
			
			LocalDate birthDay = LocalDate.parse(input, f);
			displayUselessInfo(birthDay);
			
		} 
		
		System.out.println("bye....");

	}

	private static void displayUselessInfo(LocalDate birthDay) {
		
		System.out.println("Day:  " + birthDay.getDayOfWeek());
		long age = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
		System.out.println("U r " + age + " years old.");
		
		//First solution
		System.out.println("There are " + LocalDate.now().until(birthDay.plusYears(birthDay.until(LocalDate.now().plusYears(1), ChronoUnit.YEARS)),ChronoUnit.DAYS) + " days for your next birthday party!!!");
	
		LocalDate nextBirthDay = birthDay.plusYears(age+1);
		
		System.out.println("After birthday date: " + nextBirthDay);
		
		//Second Solution
		System.out.println("There are " + LocalDate.now().until(nextBirthDay, ChronoUnit.DAYS) + " days for your next birthday party!!!");
		
		MonthDay halfBirthDay = MonthDay.from(birthDay.plusMonths(6));
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM");
		
		System.out.println("Your half birthday date: " + halfBirthDay.format(f));
		
		System.out.println("You have lived " + birthDay.until(LocalDate.now(),ChronoUnit.DAYS) + " days.");
		
		
	}

}
