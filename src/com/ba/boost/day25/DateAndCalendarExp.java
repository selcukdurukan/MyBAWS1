package com.ba.boost.day25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndCalendarExp {
	
	/*
	 * OLD type date and time with assistant tranier, cagri.
	 */

	public static void main(String[] args) {
		
		//1 ocak 1970 den itibaren milisecond olarak sayıyor.
		long date1 = System.currentTimeMillis();
		System.out.println(date1);
		
		//currenttime'ı date'e çeviriyor.
		Date date2 = new Date(date1);
		System.out.println(date2);
		
		//today
		Date today = new Date();
		System.out.println(today);
		
		//27.02.2017
		Date twentySevenFeb2017Date = new Date(117, 02, 28);  //old type, so it won't be used in the future.
		System.out.println(twentySevenFeb2017Date);
		
		Calendar twentySevenFeb2017Calendar =new GregorianCalendar(2017, 2, 27);
		System.out.println(twentySevenFeb2017Calendar.getTime());
		
		DateFormat ddMMyyySDF = new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(ddMMyyySDF.format(twentySevenFeb2017Date));

	}

}
