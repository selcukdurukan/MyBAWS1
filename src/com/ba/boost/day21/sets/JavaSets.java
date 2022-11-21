package com.ba.boost.day21.sets;

import java.util.HashSet;
import java.util.Iterator;

public class JavaSets {

	public static void main(String[] args) {
		
		
		
		HashSet<String> sets = new HashSet<>();
		sets.add("Berna");
		sets.add("Eralp");
		sets.add("Can");
		sets.add(null);
		
		for (String i : sets) {
			System.out.println(i);
		}
		
		sets.remove("Berna");
		System.out.println(sets);
		
		System.out.println(sets.size());;
		
		System.out.println(sets.contains("Berna"));;
		
		Iterator<String> iters = sets.iterator();
		while (iters.hasNext()) {
			System.out.println(iters.next());	
		}
		

	}

}
