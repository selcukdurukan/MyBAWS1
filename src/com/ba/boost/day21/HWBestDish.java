package com.ba.boost.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HWBestDish {

	public static void main(String[] args) {
		
		Map<Integer, String> citiesWithNumberPlates =  new HashMap<>();
		citiesWithNumberPlates.put(01, "Adana");
		citiesWithNumberPlates.put(51, "Nigde");
		citiesWithNumberPlates.put(35, "Izmir");
		citiesWithNumberPlates.put(38, "Kayseri");
		citiesWithNumberPlates.put(46, "Maras");
		
		
		Map<String, String> citiesDishes = new HashMap<>();
		citiesDishes.put("Adana", "Kebab");
		citiesDishes.put("Nigde", "Nigde Tava");
		citiesDishes.put("Izmir", "Izmir Koftesi");
		citiesDishes.put("Kayseri", "Manti");
		citiesDishes.put("Maras", "Dondurma");
		
		System.out.print("Please write city lisence plate to look its best dish: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		System.out.print(citiesWithNumberPlates.get(input) + " - ");
		System.out.println(citiesDishes.get(citiesWithNumberPlates.get(input)));
		

	}

}
