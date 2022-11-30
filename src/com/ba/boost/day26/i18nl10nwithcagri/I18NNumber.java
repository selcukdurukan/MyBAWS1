package com.ba.boost.day26.i18nl10nwithcagri;

import java.text.NumberFormat;
import java.util.Locale;

public class I18NNumber {

	public static void main(String[] args) {
		
		I18NNumber.printNumber(Locale.CANADA);
		I18NNumber.printNumber(Locale.FRANCE);
		I18NNumber.printNumber(Locale.ENGLISH);
		I18NNumber.printNumber(Locale.GERMANY);

	}

	private static void printNumber(Locale locale) {
		
		double number = 1050000000000.1234;
		NumberFormat f = NumberFormat.getNumberInstance(locale);
		String formatNumber =  f.format(number);
		System.out.println("Format Number: " + formatNumber + " " +locale);
		
	}

}
