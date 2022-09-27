package com.ba.boost.day08;

public class OperatorPrecedenceTest {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		System.out.println("This program does this type process " + "(c= a++ * b)=" + a++ * b + "  // [a:" + a + "  b:"+ b + "]");
		System.out.println("This program does this type process " + "(c= ++a * b)=" + ++a * b + "  // [a:" + a + "  b:"+ b + "]");
		System.out.println("This program does this type process " + "(c= --a * b)=" + --a * b + "  // [a:" + a + "  b:"+ b + "]");
		System.out.println("This program does this type process " + "(c= a-- * b)=" + a-- * b + "  // [a:" + a + "  b:"+ b + "]");
		
	}

}
