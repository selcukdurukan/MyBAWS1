package com.ba.boost.day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExceptionExp {

	public static void main(String[] args) {
		
		processArray();
		
	}

	private static void processArray() {
		
		List<String> names = new ArrayList<>();
		names.add("Cagri");
		names.add("Babur");
		
		Iterator<String> iter = names.iterator();
		
		try {
			while (iter.hasNext()) {
//				iter.next();
				iter.remove();	
			}
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
			System.out.println("LLLL");
			
		}
		System.out.println(names);
		
	}

}
