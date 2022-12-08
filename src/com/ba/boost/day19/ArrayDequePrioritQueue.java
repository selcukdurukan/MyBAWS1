package com.ba.boost.day19;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDequePrioritQueue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> regs1 = new ArrayDeque<>();  //First in first out / collection
		regs1.add(15);
		regs1.add(15);
		regs1.add(14);
		System.out.println(regs1);
		
		PriorityQueue<Integer> regs2 = new PriorityQueue<>();  // This queue sorted min and max and first-in-first-out. /collection
		regs2.add(15);
		regs2.add(15);
		regs2.add(14);
		
		
		
//		regs2.poll();
//		regs1.poll();
		
		System.out.println(regs2);
		System.out.println(regs1);

	}

}
