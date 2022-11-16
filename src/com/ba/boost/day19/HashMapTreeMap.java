package com.ba.boost.day19;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTreeMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> regs1 = new HashMap<>();  
		regs1.put(1, "Ali");
		regs1.put(2, "Cenk");
		regs1.put(1, "Selda");
		regs1.put(3, "Cenk");
		
		System.out.println(regs1);
		
		
		TreeMap<Integer, String> regs2 = new TreeMap<>();
		regs2.put(1, "Ali");
		regs2.put(2, "Cenk");
		regs2.put(1, "Selda");
		regs2.put(3, "Cenk");
		
		System.out.println(regs2);
		
		

	}

}
