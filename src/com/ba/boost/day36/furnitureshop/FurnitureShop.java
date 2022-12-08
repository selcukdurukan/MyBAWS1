package com.ba.boost.day36.furnitureshop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FurnitureShop {

	/**
	 * Properties dosyalarının file path'i genelde programa arguman olarak verilir,
	 * bu dosyalarada configuration gibi ayarlar olur (development için başka, test
	 * için başka), file path'i değiştirerek aynı programı runlayabiliriz.
	 */
	
	List<Furniture> furnitures;
	
	
	public static void main(String[] args) {

		System.out.println("Hosgeldiniz...");
		if (args.length == 1) {
			FurnitureShopProperties.getInstance().setFileName(args[0]);
		} else {
			System.err.println("Arguman eksik.");
		}

		System.out.println(Arrays.toString(FurnitureShopProperties.getInstance().getFurnitureTypes()));
		System.out.println(Arrays.toString(FurnitureShopProperties.getInstance().getFurnitureStyles()));

		FurnitureShop shop = new FurnitureShop();
		shop.loadFurnitures();

		System.out.println("Hosggittniz...");
	}
	
	public List<Furniture> getFurnitures() {
		if (this.furnitures==null) {
			this.furnitures = new ArrayList<>();
		}
		return this.furnitures;
	}

	private void loadFurnitures() {
		try (BufferedReader br = new BufferedReader(
				new FileReader(FurnitureShopProperties.getInstance().getDataFile()))) {

			String line = br.readLine(); // first line contains header data and is ignored.
			while ((line = br.readLine()) != null) {
				this.getFurnitures().add(null);
			}
		} catch (FileNotFoundException ex) {
			System.err.println(FurnitureShopProperties.getInstance().getDataFile() + " --> " + ex.getMessage());
			System.exit(100);
		} catch (IOException ex) {
			System.err.println(FurnitureShopProperties.getInstance().getDataFile() + " --> " + ex.getMessage());
			System.exit(100);
		}

	}





}
