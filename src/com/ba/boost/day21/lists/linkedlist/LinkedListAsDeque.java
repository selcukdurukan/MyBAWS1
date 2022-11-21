package com.ba.boost.day21.lists.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDeque {

	public static void main(String[] args) {
		
		//Hem LIFO hem FIFO olarak kullanılabilir.
		Deque<String> animals = new LinkedList<>();
		animals.add("Dog"); 	// 1 //0
		animals.add("Cock");	 // 2 //1
		animals.add("Bull");	 // 3 //2
		animals.add("Cat"); 	// 4 //3
		animals.add("Monkey");	 // 5 //4
		animals.add("Lion");	 // 6 //5
		animals.add("Eagle");	 // 7 //6
		animals.add("Crocodile");	 // 8 //7
		animals.add("Mouse");	 // 9 //8
		animals.add("Pig");		// 10 //9
		
		System.out.println(animals);
		
		//Adding at first
		animals.addFirst("Human");
		System.out.println(animals);
		
		//Adding at last
		animals.addLast("Zebra");
		System.out.println(animals);
		
		//access and remove the first element.
		animals.pop();
		System.out.println(animals);
		
		animals.removeFirst();
		System.out.println(animals);
		
		animals.removeLast();
		System.out.println(animals);

	}

}
