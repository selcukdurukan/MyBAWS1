package com.ba.boost.day21.sets;

import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		
		LinkedHashSet<String> days = new LinkedHashSet<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add(null);
		
		for (String i : days) {
			System.out.println(i);
		}
		

	}

}
