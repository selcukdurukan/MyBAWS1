package com.ba.boost.day24.dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExp {

	public static void main(String[] args) {
		
		for (String z : ZoneId.getAvailableZoneIds()) {
			System.out.println(z);
		}
		
		System.out.println();
		ZoneId zoneTurkey = ZoneId.of("Turkey");
		System.out.println(zoneTurkey);
		
		ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Europe/Monaco"));
		System.out.println(time);
		
		ZonedDateTime t = ZonedDateTime.of(2022, 2, 27, 13, 34, 45, 32, zoneTurkey);
		System.out.println(t);
		System.out.println(t.getMonth());
		System.out.println(t.getMonthValue());
		System.out.println(t.getDayOfYear());
		System.out.println(t.getDayOfWeek());
		System.out.println(t.getZone());
		
		System.out.println();
		if (t.isAfter(time)) {
			System.out.println("After");
		} else {
			System.out.println("Before");
		}
		
	}

}
