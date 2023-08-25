package com.ba.boost.day64and65.newdeneme3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Cagri", false);
		Person p2 = new Person("Ayse", true);
		Person p3 = new Person("Beyza", null);
		Optional<Person> p4 = null;
		
		
		List<Person> personLists = new ArrayList<>();
		
		personLists.add(p1);
		personLists.add(p2);
		personLists.add(p3);
		
		System.out.println(personLists.toString());
		
		List<Person> lists = new ArrayList<>();
		
//		lists.add((Person) personLists.stream().filter(x-> x.isActive()).collect(Collectors.toList()));
		
		System.out.println(personLists
				.stream()
				.filter(x-> x.getIsActive() != null)
				.filter(x-> x.getIsActive())
				.collect(Collectors.toList()));
		
		String xxx = "aliasldasd";
		System.out.println(xxx.split("l")[1]);
		
		if (p4.isPresent()) {
			System.out.println("Hi");
		} else {
			System.out.println("Not hi");
		}
		
		
	}
	
	static Optional<String> createOptionalLists() {
		return null;
	
	}

}
