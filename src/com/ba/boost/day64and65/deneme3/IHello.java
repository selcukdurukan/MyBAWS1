package com.ba.boost.day64and65.deneme3;

public interface IHello {
	
	int CONST_INT = 10;
	
	String sayHello();
	
	static String eat() {
		return "Eating";
		
	}
	
	private String privateMethod() {
		return "Secret";
		
	}
	
	default String drink() {
		return "Water";
	}

}
