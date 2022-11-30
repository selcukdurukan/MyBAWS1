package com.ba.boost.day26.i18nl10nwithcagri;

import java.text.NumberFormat;
import java.util.Locale;

public class I18NCurrency {

	public static void main(String[] args) {
		
		I18NCurrency.printCurrency(Locale.CHINESE);
		I18NCurrency.printCurrency(Locale.US);
		I18NCurrency.printCurrency(Locale.CANADA);
		I18NCurrency.printCurrency(Locale.CHINESE);
		I18NCurrency.printCurrency(Locale.FRANCE);
		I18NCurrency.printCurrency(Locale.GERMANY);
		I18NCurrency.printCurrency(Locale.JAPAN);
	}
	
	private static void printCurrency(Locale locale) {
		
		double number = 1050000000000.1234;
		NumberFormat f = NumberFormat.getCurrencyInstance(locale);
		String currency =  f.format(number);
		System.out.println("Currency format: " + currency + " " +locale);
		
	}

}
