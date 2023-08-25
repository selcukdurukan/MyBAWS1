package com.ba.boost.day64and65.newdeneme7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryStream {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("Niğde");
		cities.add("Adana");
		cities.add("Çorum");
		cities.add("İstanbul");
		cities.add("Ankara");
		System.out.println(cities.toString());
		
		List<String> cities2 = new ArrayList<>();
		cities2.add("Niğde");
//		cities2.add("Adana");
		System.out.println(cities2.toString());
		
		
		System.out.println(cities.stream().filter(x -> cities2.contains(x)).collect(Collectors.toList()));
	}

}
