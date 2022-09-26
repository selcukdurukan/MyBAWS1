package com.ba.boost.week02.day09;

import java.util.Iterator;

public class ForLoop {
	
	/**
	 * Only semicolon is important for for loop.
	 */

	public static void main(String[] args) {
		
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i+ ". time Hello World.");
//		}
		
		
		
//		int i = 1;
//		for (; i <= 10; i++) {
//			System.out.println(i+ ". time Hello World.");
//		}
		
//		int i = 1;
//		for (; i <= 10; ) {
//			System.out.println(i+ ". time Hello World.");
//			i++;
//		}
		
		
		int i = 1;
		for (; ; ) {
			System.out.println(i+ ". time Hello World.");
			i++;
			if (i >= 10) {
				break;
			}
		}
		

	}

}
