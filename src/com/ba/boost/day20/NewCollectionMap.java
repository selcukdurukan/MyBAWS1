package com.ba.boost.day20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class NewCollectionMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> maps1 = new HashMap<>();
		maps1.put(1, "Ali");
		maps1.put(2, "Ali");
		
		System.out.println(maps1);
		
		TreeMap<Integer, String> maps2 = new TreeMap<>();
		maps2.put(3, "Ali");
		maps2.put(2, "Can");
		maps2.put(1, "Yasemin");
		
		System.out.println(maps2);
		
		
		LinkedHashMap<Integer, String> maps3 = new LinkedHashMap<>();
		maps3.put(3, "Ali");
		maps3.put(2, "Can");
		maps3.put(1, "Yasemin");
		
		System.out.println(maps3);
		
		

	}

}
