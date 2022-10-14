package com.ba.boost.atclass.reflection;

public class Test {

	public static void main(String[] args) {
		
		ReflectedClass ref = new ReflectedClass("Babur", "Somer", 1964, false);
		System.out.println(ref.actualAge());
		System.out.println(ref);
	}

}
