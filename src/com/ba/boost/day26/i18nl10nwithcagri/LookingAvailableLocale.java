package com.ba.boost.day26.i18nl10nwithcagri;

import java.util.Locale;

public class LookingAvailableLocale {

	public static void main(String[] args) {
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for (Locale l : locales) {
			System.out.println(l);
		}

	}

}
