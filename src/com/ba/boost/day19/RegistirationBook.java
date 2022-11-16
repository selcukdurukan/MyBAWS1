package com.ba.boost.day19;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class RegistirationBook {

	public static void main(String[] args) {
		Registiration r1 = new Registiration(612578, "Ecesu Arslan", "MEC", 2020);
		Registiration r2 = new Registiration(512679, "Berkay Yalcin", "MEC", 2019);
		Registiration r3 = new Registiration(712578, "Diyap Buyukasik", "INF", 2019);
		Registiration r4 = new Registiration(212580, "Oguzhan Derebasi", "INF", 1990);
		Registiration r5 = new Registiration(578568, "Omer Faruk Gungor", "MEC", 2020);
		
		Registiration[] regs1 = new Registiration[5];  // with array...
		regs1[0]=r1;
		regs1[1]=r2;
		regs1[2]=r3;
		regs1[3]=r4;
		regs1[4]=r5;

		
//		for (Registiration s : regs1) { //Each for...
//			System.out.println(s);
//		}
		
//		System.out.println(Arrays.toString(regs1));
		
		LinkedList<Registiration> regs2 = new LinkedList<>(); //with LinkedList...
		regs2.add(r1);
		regs2.add(r2);
		regs2.add(r3);
		regs2.add(r4);
		regs2.add(r5);
		
//		System.out.println(regs2);
		
		Queue<Registiration> regs3 = new LinkedList<Registiration>(); // with queue...
		regs3.add(r1);
		regs3.add(r2);
		regs3.add(r3);
		regs3.add(r4);
		regs3.add(r5);
		
//		System.out.println(regs3);
//		regs3.remove();
//		System.out.println(regs3);
//		
		
		
		Stack<Registiration> regs4 = new Stack<>();  // with stack....
		regs4.push(r1);
		regs4.push(r2);
		regs4.push(r3);
		regs4.push(r4);
		regs4.push(r5);
		
//		System.out.println(regs4);
//		regs4.pop();
//		regs4.peek();
//		System.out.println(regs4);
		
		TreeMap<Long, Registiration> regs5 = new TreeMap<>();  // with map...
		regs5.put(r1.registirationNumber, r1);
		regs5.put(r2.registirationNumber, r2);
		regs5.put(r3.registirationNumber, r3);
		regs5.put(r4.registirationNumber, r4);
		regs5.put(r5.registirationNumber, r5);
		
		System.out.println(regs5.get((long)712578));;
		
//		System.out.println(regs5);
		




	}

}
