package com.ba.boost.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamExp {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(3, 5, 7, 9, 11, 15);
		
		//Listenin tüm ögelerinin karesini alır.
//		ints.stream().map(s -> s*s).forEach(s -> System.out.println(s)); //Collectionlardaki map değil. bir değeri başka bir değer ile eşleştirme.
//		
//		
//		for (Integer i : ints) {
//			int square = i * i;
//			System.out.println(square);
//		}
//		
//		for (int i = 0; i < ints.size(); i++) {
//			int square = ints.get(i) * ints.get(i);
//			System.out.println(square);
//			
//		}
		
		//Listenin 9 dan büyük ögelerinin karelerini al.
		
//		for (Integer i : ints) {
//			if (i > 9) {
//				int square = i* i;
//				System.out.println(square);
//			} else {
//				System.out.println(i);
//			}
//		}
		
//		ints.stream().filter(i -> i>9).map(i ->i*i).forEach(s -> System.out.println(s));
		
		
		//Listenin 9 dan büyük karelerini al 120 den büyükleri ekrana yaz.
//		ints.stream()
//		.filter(i -> i>9)
//		.map(i -> i*i)
//		.filter(i -> i>120)
//		.forEach(s -> System.out.println(s));
		
		
		ints.stream().reduce((x,y) -> x+y).stream().forEach(s -> System.out.println(s));
		
		
		List<String> list1 = Arrays.asList("GBir", "Ggun", "Gokula", "Ggiderken");
		List<String> list2 = Arrays.asList("herseye", "dikkat", "ederken");
		List<String> list3 = new ArrayList<>();
		
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
		
	System.out.println(list1.stream().anyMatch(s -> s.contains("e")));	//Or
	System.out.println(list1.stream().allMatch(s -> s.contains("G")));	//and
	
	list1.stream().
		
		

	}

}
