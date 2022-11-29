package com.ba.boost.day25;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		ZonedDateTime zonedTime = ZonedDateTime.now();
		System.out.println(zonedTime);
		
//		for (String z : ZoneId.getAvailableZoneIds()) {
//			System.out.println(z);
//		}
		
		//Baska zone'dan zamana bakma
		ZonedDateTime sanMarino = ZonedDateTime.now(ZoneId.of("Europe/San_Marino"));
		System.out.println(sanMarino);
	

	}

}
