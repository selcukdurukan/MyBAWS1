package com.ba.boost.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p ;
		Person p1 = new Person("Merola", "Wrout", 'F',32);
		Person p2 = new Person("Sydney", "Cullington", 'F',74);
		Person p3 = new Person("Melosa", "Courage", 'F',14);
		Person p4 = new Person("Sherwin", "Ogley", 'M',14);
		Person p5 = new Person("Dukei", "Malpass", 'M',30);
		Person p6 = new Person("Jarett", "Fearick", 'M',77);
		Person p7 = new Person("Willie", "Childerhouse", 'M',31);
		Person p8 = new Person("Berky", "Tollmache", 'M',73);
		Person p9 = new Person("Nanete", "Blunsden", 'F',81);
		
		
		List<Person> person = new ArrayList<>();
		person.add(new Person("Whittaker", "Godleman", 'M',32));
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		person.add(p6);
		person.add(p7);
		person.add(p8);
		person.add(p9);
		
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i));
		}
		
		System.out.println();
		Map<String,Integer> personMap = person.stream().filter(c -> c.getAge()<50).collect(Collectors.toMap(b -> b.getName(), a -> a.getAge()));
		personMap.forEach((name,age) -> System.out.println(name+" - "+ age));
		
		System.out.println();
		List<Person> personList = person.stream().filter(a -> a.getAge()<35).collect(Collectors.toList());
		personList.stream().forEach(a -> a.speak());
		
		System.out.println();
		Set<Person> personSet =  person.stream().collect(Collectors.toSet());
		
	}

}
