package com.ba.boost.day20.lists;

import java.util.ArrayList;
import java.util.LinkedList;


public class JavaList {

	public static void main(String[] args) {
		
		//For arrayslist searching and accessibility is better than linkedlist. (Accessing data)
		ArrayList<String> lists1 = new ArrayList<>();
		
		//For linkledlist Removing and adding are better than arraylist. (Manipulation)
		LinkedList<String> lists2 = new LinkedList<>();
		
		
		lists1.add("Cagri");
		lists1.add("Babur");
		
		lists2.addAll(lists1);
		
	
		System.out.println(lists2);
		
		System.out.println(lists2.get(0));
		
		lists2.set(0, "New person");
		System.out.println(lists2);
		
		lists2.remove(0);
		System.out.println(lists2);
		
		System.out.println(lists2.size());
		
		System.out.println(lists2.contains("Babur"));

	}

}
