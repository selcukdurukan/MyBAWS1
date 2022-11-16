package com.ba.boost.day19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RegistirationBook1 {

	public static void main(String[] args) {
		
		Registiration r1 = new Registiration(612578, "Ecesu Arslan", "MEC", 2020);
		Registiration r2 = new Registiration(512679, "Berkay Yalcin", "MEC", 2019);
		Registiration r3 = new Registiration(712578, "Diyap Buyukasik", "INF", 2019);
		Registiration r4 = new Registiration(212580, "Oguzhan Derebasi", "INF", 1990);
		Registiration r5 = new Registiration(578568, "Omer Faruk Gungor", "MEC", 2020);
		
		ArrayList<Registiration> regs1 = new ArrayList<>(); //Collections arrays
		regs1.add(r1);
		regs1.add(r2);
		regs1.add(r3);
		regs1.add(r4);
		regs1.add(r5);		
		
		for (Registiration registiration : regs1) {
			System.out.println(registiration);
		}
		
		LinkedList<Registiration> regs2 = new LinkedList<>(); // Collections linked list...
		regs2.add(r1);
		regs2.add(r2);
		regs2.add(r3);
		regs2.add(r4);
		regs2.add(r5);
		
		for (Registiration registiration : regs2) {
			System.out.println(registiration);
		}
		
		

	}

}
