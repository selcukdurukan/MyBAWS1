package com.ba.boost.day27.dependencyinversion;

import java.util.ArrayList;
import java.util.List;

public class FruitPlateTest {
	
	/*
	 * Tabağa yeni bir tür meyva eklesen tabakta bir değişiklik olmayacak. 
	 * Dependency Inversion Principle Tabağa eklenebilecekleri ya abstract sınıflar ya da intefaceler üzerinden tanımlıyoruz.
	 */
	
	private static List<Fruit> plate = new ArrayList<>();  //Soyut bir classa baglı bagımlıklıklar

	public static void main(String[] args) {
		
		FruitPlateTest.plate.add(new Grape());
		FruitPlateTest.plate.add(new Sultaniye());
		FruitPlateTest.plate.add(new Watermelon());

	}

}
