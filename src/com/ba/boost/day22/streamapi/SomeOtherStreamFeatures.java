package com.ba.boost.day22.streamapi;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;

public class SomeOtherStreamFeatures {

	public static void main(String[] args) {
		
		List<Integer> lists = new ArrayList<>();
		
		lists.add(25);
		lists.add(12);
		lists.add(3);
		lists.add(89);
		lists.add(25);
		lists.add(44);
		lists.add(100);
		lists.add(7);
		lists.add(63);
		
		//foreach
		lists.stream().forEach(s -> System.out.print(s + ", "));
		
		System.out.println();
		//filter
		lists.stream().filter(s -> s > 60).forEach(s -> System.out.print(s + ". "));
		
		System.out.println();
		//ditinct
		lists.stream().distinct().forEach(s -> System.out.print(s + "; "));
		
		System.out.println();
		//sorted
		lists.stream().sorted().forEach(s -> System.out.print(s + ": "));
		
		System.out.println();
		//reverse sorted
		lists.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + "\\ "));
		
		System.out.println();
		//Limit
		lists.stream().limit(5).forEach(s -> System.out.print(s + "/ "));
		
		System.out.println();
		//Skip
		lists.stream().skip(3).limit(2).forEach(s -> System.out.print(s + "* "));
		
		System.out.println();
		//Count
		System.out.println(lists.stream().filter(s -> s<40).distinct().count());
		

		//anyMatch
		System.out.println(lists.stream().anyMatch(n -> n<5));
		System.out.print(lists.stream().anyMatch(n -> n>100));
		
		System.out.println();
		//allMatch
		System.out.println(lists.stream().allMatch(s -> s < 5));
		System.out.println(lists.stream().allMatch(s -> s > 0 && s<101 ));
		
		System.out.println();
		//noneMatch
		System.out.println(lists.stream().noneMatch(s -> s < 2));
		System.out.println(lists.stream().noneMatch(s -> s > 2));
		
		System.out.println();
		//Map
		lists.stream().map(s -> s * 2).forEach(s -> System.out.println(s));
		
		

	}

}
