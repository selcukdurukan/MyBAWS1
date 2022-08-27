package com.ba.boost.week02.day8;

public class CharTest {

	public static void main(String[] args) {

		/*
		 * All of pages variables are primitive types and storage in stack memory.
		 */

		char c = 65; // 0-65.535 only 16 byte.
		System.out.println(c + "\b" + " Hello World");
		System.out.println(c + "\t" + " Hello World");
		System.out.println(c + "\t\t" + "Hello World");
		System.out.println(c + "\n" + "Hello World");
		System.out.println(c + "\f" + " Hello World");
		System.out.println(c + "\r" + "Hello World");
		System.out.println(c + "\"" + " Hello World");
		System.out.println(c + "\'" + " Hello World");
		System.out.println(c + "\\" + " Hello World");
		

		boolean notCorrect = false; // false or true
		System.out.println(notCorrect);
		
		
		byte a =  127;  // byte can be only between -128 and 127. It covers only 8 bytes (Integer)
		System.out.println(a);
		
		
		int b = 2000000000; // int can be only between -2.147.483.648 and 2.147.483.647. It covers only 32 bytes. (Integer)
		System.out.println(b);
		
		
		long d = 13_410_000_000_000L; // long can be only between -(2^63) and (2^63)-1. It covers only 64 bytes. There is one character which is l or L before semicolon. (Integer)
		System.out.println(d);
		
		
		double e = 1.7898712; // It covers only 64 bytes. (Double)
		System.out.println(e);
		
		
		float f = 1.647f; // It covers only 32 bytes. (Double) There is one character which is f or F before semicolon.	
		System.out.println(f);

		
		}

}
