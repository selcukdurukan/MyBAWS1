package com.ba.boost.day20.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSomeOtherMethods {

	public static void main(String[] args) {
		
		ArrayList<String> lists1 = new ArrayList<>();
		
		lists1.add("Cagri");
		lists1.add("Babur");
		lists1.add("Muhammed");
		lists1.add("Mustafa");
		
		
		System.out.println(lists1);
		
		//Reversing List
		Collections.reverse(lists1);
		System.out.println(lists1);
		
		//Sort List
		Collections.sort(lists1);
		System.out.println(lists1);
		
		//Sort List ascending
		Collections.sort(lists1);
		System.out.println(lists1);
		
		//Sort List descending
		Collections.sort(lists1, Collections.reverseOrder());
		System.out.println(lists1);
		
		

	}

}
