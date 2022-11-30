package com.ba.boost.day27.tender.i18n;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$

	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("en"));

	private Messages() {
		super();
		/*
		 * Do Nothing --> Bu şekilde Messages sınıfından bir önrek oluşturulması
		 * engellenmiş oluyor. Sadece static olarak kullanılabilir, çunku
		 * constructor'ımız private.
		 */
	}

	public static void init(String language) {
		if (language.equalsIgnoreCase("Turkce") || language.equalsIgnoreCase("Turkish")
				|| language.equalsIgnoreCase("Turkisch")) { // Eger 50 dil olursa ne yapacaksın? bu yuzden enumlarla
															// çalışmak daha avantajlı.
			Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("tr"));
		} else if (language.equalsIgnoreCase("Almanca")) {
			Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("de"));
		} else {
			Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("en"));
		}
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
