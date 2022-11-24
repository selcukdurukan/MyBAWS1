package com.ba.boost.day22.HWstreamapiperson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("Merola", "Wrout", 'F',32);
		Person p2 = new Person("Sydney", "Cullington", 'F',74);
		Person p3 = new Person("Melosa", "Courage", 'F',14);
		Person p4 = new Person("Sherwin", "Ogley", 'M',14);
		Person p5 = new Person("Dukei", "Malpass", 'M',30);
		Person p6 = new Person("Jarett", "Fearick", 'M',77);
		Person p7 = new Person("Willie", "Childerhouse", 'M',31);
		Person p8 = new Person("Berky", "Tollmache", 'M',73);
		Person p9 = new Person("Nanete", "Blunsden", 'F',81);
		
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Whittaker", "Godleman", 'M',32));
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.add(p7);
		persons.add(p8);
		persons.add(p9);
		
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		
//		System.out.println();
//		Map<String,Integer> personMap = person.stream().filter(c -> c.getAge()<50).collect(Collectors.toMap(b -> b.getName(), a -> a.getAge()));
//		personMap.forEach((name,age) -> System.out.println(name+" - "+ age));
//		
//		System.out.println();
//		List<Person> personList = person.stream().filter(a -> a.getAge()<35).collect(Collectors.toList());
//		personList.stream().forEach(a -> a.speak());
//		
//		System.out.println();
//		Set<Person> personSet =  person.stream().collect(Collectors.toSet());
		
		
		System.out.println();
		Map<String, Integer> personsMap = persons.stream().filter(s -> s.getAge()<50).collect(Collectors.toMap(b -> b.getName(), a -> a.getAge()));
		personsMap.forEach((t, u) -> System.out.println(t + " - " + u));
		
		System.out.println();
		List<Person> personsList = persons.stream().filter(s -> s.getAge()<35).collect(Collectors.toList());
		personsList.stream().forEach(s -> s.speak());
		
		System.out.println();
		Stream<Object> personsSet = persons.stream().filter(s -> s.getGender() == 'M').map(s -> new Person(s.getName(), s.getLastName(), s.getGender(), s.getAge()+15));
		personsSet.forEach(s -> System.out.println(s));
	}

}
