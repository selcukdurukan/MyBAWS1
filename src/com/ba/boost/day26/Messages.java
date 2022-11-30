package com.ba.boost.day26;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/*
 * BU SAYFA HER ZAMAN EXTERNALİZE STRİNG DEDİGİNDE KENDİ KENDİNE OLUSUR, LUTFEN BU SEKİLDE DUZENLE.
 */

public class Messages {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; // com.ba.boost.day26.messagesXXX.properties

	private static Locale locale; // XXX eğer bir locale tanımlı ise ona bağlı olarak tr_TR veya de_AT gibi bir değer alacak.
									// aksi taktider sadece com.ba.boost.day26.messages.properties şeklinde
									// olacak(messages_en varsa o yoksa messages)

	private static ResourceBundle RESOURCE_BUNDLE;

	public static void init(String language, String country) {
		Messages.locale = new Locale(language, country);
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
