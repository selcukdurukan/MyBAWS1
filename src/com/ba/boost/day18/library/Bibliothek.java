package com.ba.boost.day18.library;

import java.time.LocalDate;

import com.ba.boost.day18.library.model.Magazine;
import com.ba.boost.day18.library.model.Period;


public class Bibliothek {

	public static void main(String[] args) {
		
		System.out.println("Library");
		
		Magazine m1 = new Magazine("GirGir", LocalDate.of(1978, 12, 12), 5, 15.75, "Oguz Aral", "GIRGIR", "556576", 45);
		m1.rent(1, Period.DAILY, 10);
		
		System.out.println("Bye...");

	}

}
