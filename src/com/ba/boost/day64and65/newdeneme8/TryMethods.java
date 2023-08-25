package com.ba.boost.day64and65.newdeneme8;


public class TryMethods {

	public static void main(String[] args) {
		
		System.out.println(TryMethods.sayHello());
		TryMethods m = new TryMethods();
		System.out.println(m.myName());
		
		for (String string : args) {
			
		}
	}
	
	public static String sayHello() {
		return "Hello";
	}
	
	public String myName() {
		return sayHello() + "Selçuk";
	}

}
