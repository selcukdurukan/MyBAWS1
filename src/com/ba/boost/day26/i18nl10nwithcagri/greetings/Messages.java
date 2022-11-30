package com.ba.boost.day26.i18nl10nwithcagri.greetings;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	
	private static Locale locale; 

	private static ResourceBundle RESOURCE_BUNDLE;

	public static void init(String language) {
		Messages.locale = new Locale(language);
		Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Messages.locale);
	}
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
