package com.ba.boost.day26.i18nl10nwithcagri;

import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class I18NTime {

	public static void main(String[] args) {
		
		I18NTime.printTime(Locale.CHINESE);
		I18NTime.printTime(Locale.US);
		I18NTime.printTime(Locale.CANADA);
		I18NTime.printTime(Locale.CHINESE);
		I18NTime.printTime(Locale.FRANCE);
		I18NTime.printTime(Locale.GERMANY);
		I18NTime.printTime(Locale.JAPAN);

	}

	private static void printTime(Locale locale) {
		
		LocalTime time = LocalTime.now();
		DateFormat f = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		Date currentTime = new Date();
		String date = f.format(currentTime);
		System.out.println("Time formatter: " + date + " " + locale);
	}

}
