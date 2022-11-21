package com.ba.boost.day21.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers =  new HashMap<>();
		numbers.put("One", 1);
		numbers.put("two", 2);
		numbers.put("Nine", 9);
		
		System.out.println(numbers);
		
		System.out.println(numbers.keySet());
		
		System.out.println(numbers.values());
		
		System.out.println(numbers.entrySet());	
		
		numbers.remove("Nine");
		System.out.println(numbers);
		
		System.out.println(numbers.get("One"));
		
		
		
		Set<Entry<String, Integer>> numbers2 = numbers.entrySet();
		System.out.println(numbers2);
		
		
	}

}
