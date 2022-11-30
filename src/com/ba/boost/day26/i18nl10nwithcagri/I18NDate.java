package com.ba.boost.day26.i18nl10nwithcagri;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18NDate {

	public static void main(String[] args) {
		
		I18NDate.printDate(Locale.CHINESE);
		I18NDate.printDate(Locale.US);
		I18NDate.printDate(Locale.CANADA);
		I18NDate.printDate(Locale.CHINESE);
		I18NDate.printDate(Locale.FRANCE);
		I18NDate.printDate(Locale.GERMANY);
		I18NDate.printDate(Locale.JAPAN);
	}
	
	private static void printDate(Locale locale) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String date =  f.format(currentDate);
		System.out.println("Date format: " + date + " " +locale);
		
	}

}
