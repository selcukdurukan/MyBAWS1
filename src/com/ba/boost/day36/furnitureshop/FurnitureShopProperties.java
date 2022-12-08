package com.ba.boost.day36.furnitureshop;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.StringTokenizer;

public class FurnitureShopProperties {

	/*
	 * Properties dosyasına erişmek için singleton desing pattern kullanıyoruz.
	 * Bunun amacı fileName'e tek bir yerden erişip, o alanı hep dosyanın bulundugu
	 * adrese ayırmak.
	 */

	private static FurnitureShopProperties instance;

	private Properties properties;
	private String fileName;

	private FurnitureShopProperties() {
		super();
	}

	// lazy ınizilation again.
	public static FurnitureShopProperties getInstance() {
		if (FurnitureShopProperties.instance == null) {
			FurnitureShopProperties.instance = new FurnitureShopProperties();
		}
		return instance;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public String[] getFurnitureStyles() {
		String[] furnitureStyles;
		String loadedStyles = this.getProperties().getProperty("styles");
		if (loadedStyles == null) {
			System.err.println("Deger okunamadi.");
			System.exit(101);
		}
		StringTokenizer tokenizer = new StringTokenizer(loadedStyles, ",");
		furnitureStyles = new String[tokenizer.countTokens()];

		for (int i = 0; i < furnitureStyles.length; i++) {    // bu for ile aşagıdaki while ile yapıldı.
			furnitureStyles[i] = (String) tokenizer.nextToken();
		}
		return furnitureStyles;
	}

	public String[] getFurnitureTypes() {
		String[] furnitureTypes;
		String loadedTypes = this.getProperties().getProperty("types");
		if (loadedTypes == null) {
			System.err.println("Deger okunamadi.");
			System.exit(202);
		}
		StringTokenizer tokenizer = new StringTokenizer(loadedTypes, ";");
		furnitureTypes = new String[tokenizer.countTokens()];

		int i = 0;
		while (tokenizer.hasMoreTokens()) {
			furnitureTypes[i] = (String) tokenizer.nextToken();
			i++;
		}
		return furnitureTypes;
	}

	// lazy ınizilation again.
	private Properties getProperties() {
		if (this.properties == null) {

			if (this.fileName == null) {
				System.err.println("Dosya tanimli degil.");
				System.exit(404);
			}
			try (InputStream is = new FileInputStream(this.fileName)) {
				this.properties = new Properties();
				this.properties.load(is);
			} catch (Exception e) {
				System.err.println("Dosya okunamadi.");
				System.exit(303);
			}
		}
		return this.properties;
	}

	public String getDataFile() {
		return this.getProperties().getProperty("dataFile");
	}

}
