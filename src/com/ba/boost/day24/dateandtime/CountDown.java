package com.ba.boost.day24.dateandtime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CountDown {

	public static void main(String[] args) {

		LocalDateTime target = LocalDateTime.now();
		target = target.plusMinutes(1);
		

		LocalDateTime actual = LocalDateTime.now();
		
		do {
			long gap = actual.until(target, ChronoUnit.SECONDS);
			System.out.print(gap);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			actual = LocalDateTime.now();
			System.out.print("\b\b\b\b");
		} while (actual.isBefore(target));

	}

}
