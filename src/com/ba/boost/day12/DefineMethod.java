package com.ba.boost.day12;

public class DefineMethod {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		int a =methodName() + methodName() + methodName();
		System.out.println(a);
		System.out.println(methodName());
		System.out.println(myName());
		
		System.out.println(sum(5,10));
		
		String b = hello("jack");
		System.out.println(b);
	}

	private static String hello(String name) {
		return "Hello "+name+".";		
	}

	private static int sum(int a, int b) {
		int result = a+b;
		return result;
	
	}

	private static String myName() {
		return "My name is Selcuk.";
		
	}

	private static int methodName() {
		System.out.println("Inside method.");
		return 3;		
	}

}
