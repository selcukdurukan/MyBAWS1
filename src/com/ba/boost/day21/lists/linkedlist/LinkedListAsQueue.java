package com.ba.boost.day21.lists.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		
		//First-in-first-out
		Queue<String> languages = new LinkedList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		
		System.out.println(languages);
		
		//Access the first element.
		System.out.println(languages.peek());
		System.out.println(languages);
		
		//access and remove the first element.
		languages.poll();
		System.out.println(languages);
		
		//add element at the end.
		languages.offer(".Net");
		System.out.println(languages);
		

	}

}
