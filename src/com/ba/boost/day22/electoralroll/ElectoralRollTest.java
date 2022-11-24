package com.ba.boost.day22.electoralroll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ElectoralRollTest {
	
	public static void main(String[] args) {
		
		Map<Long, Person> rolls = new HashMap<>();
		
		List<Person> lists = new ArrayList<>();
		
		Person p1 = new Person("Hilal", 2020, 123_123_123_23L, "Ankara");
		rolls.put(p1.getIdNo(), p1);
		lists.add(p1);
		
		Person p2 = new Person("Alperen", 1998, 123_123_123_24L, "Ankara");
		rolls.put(p2.getIdNo(), p2);
		lists.add(p2);
		
		Person p3 = new Person("Ezgi", 1950, 123_123_123_25L, "Kocaeli");
		rolls.put(p3.getIdNo(), p3);
		lists.add(p3);
	
		Collections.sort(lists); //Comparable interface person class'a uygulanmazsa çalışmaz.
		Collections.reverse(lists);
		lists.stream().forEach(s -> {
			System.out.println(s);
			try {
				s.giveAVote("Secimim...");
			} catch (CannotVoteException e) {
				System.err.println(s.getName() + " - " + e.getMessage());
			}
		} );
		
		System.out.println();
		
		Set<Entry<Long, Person>> entries = rolls.entrySet();
		for (Entry<Long, Person> i : entries) {
			System.out.println(i.getValue());
		}
		
		System.out.println();
		//Listede sadece hilali bulmak için.
		lists.stream().filter(s -> s.getName() == "Hilal").forEach(s -> System.out.println(s));

	}

}
