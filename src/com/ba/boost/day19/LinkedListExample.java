package com.ba.boost.day19;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
//		LinkedList l = new LinkedList<>();   	 	//Old type linkedlist, you should use with generic to know which type you organize.
//		l.add(1);  								 	//int
//		l.add("Ali");								//String 
//		l.add(new Registiration(1500000, "Jack", "Engineer", 2021));
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Elma");
		list.add("Elma");
		list.add("Elma");
		list.add("Elma");
		list.add("1");
		
		System.out.println(list);
		list.remove();
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {   	//array.length
			System.out.println(list.get(i));		//array[i]
		}
		
		for (String a : list) {
			System.out.println(a);
		}
	}

}
