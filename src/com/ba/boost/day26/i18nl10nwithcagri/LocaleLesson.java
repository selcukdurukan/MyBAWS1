package com.ba.boost.day26.i18nl10nwithcagri;

import java.util.Locale;

public class LocaleLesson {

	public static void main(String[] args) {
		
		Locale locale = new Locale("tr", "TR");
		
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getLanguage());

	}

}
