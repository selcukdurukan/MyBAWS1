package com.ba.boost.day26.zoo;

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
			return Messages.getResourceBundle().getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	private static ResourceBundle getResourceBundle() {   //EASY INIYIALIZATION BECAUSE RESOURCE_BUNDLE is null
		if (Messages.RESOURCE_BUNDLE == null) {
			Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
		}
		return Messages.RESOURCE_BUNDLE;
	}
}
