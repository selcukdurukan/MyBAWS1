package com.ba.boost.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HMAnimalList {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<>();
		animals.add("Dog"); // 1 //0
		animals.add("Cock"); // 2 //1
		animals.add("Bull"); // 3 //2
		animals.add("Cat"); // 4 //3
		animals.add("Monkey"); // 5 //4
		animals.add("Lion"); // 6 //5
		animals.add("Eagle"); // 7 //6
		animals.add("Crocodile"); // 8 //7
		animals.add("Mouse"); // 9 //8
		animals.add("Pig"); // 10 //9

		for (int i = 0; i < animals.size(); i++) {
			System.out.println((i + 1) + ". Animal: " + animals.get(i));
		}
		
//		System.out.println(animals.get(2));
//		
//		animals.remove(4);
//		System.out.println(animals);
//		
//		animals.set(5, "Platypus");
//		System.out.println(animals);
//		
//		for (String i : animals) {
//			System.out.println(i);
//		}
//		
//		System.out.println(animals.size());
//		
//		System.out.println(animals.isEmpty());
//		
//		System.out.println(animals.indexOf("Pig"));

//		animals.set(1, "Giraffe");
//		System.out.println(animals);

//		if (animals.contains("Bull") == true) {
//			System.out.println("Yes, dog is in list and its index is: " + animals.indexOf("Bull"));
//		}

//		animals.remove("Dog");
//		System.out.println(animals);

//		ArrayList<String> animals1 = new ArrayList<>();
//		animals1.addAll(animals.subList(2, 6));
//		System.out.println(animals1);

//		Collections.reverse(animals);
//		System.out.println(animals);
		
		Collections.sort(animals);
		System.out.println(animals);
		
//		Collections.sort(animals, Collections.reverseOrder());
//		System.out.println(animals);
		
//		animals.removeAll(animals);
//		System.out.println(animals);
		

	}

}
