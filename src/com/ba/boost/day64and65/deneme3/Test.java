package com.ba.boost.day64and65.deneme3;

public class Test {

	public static void main(String[] args) {

		IHello human = new Human();
		System.out.println(human.sayHello());
		

		IHello cat = new Cat();
		System.out.println(cat.sayHello());
		
		System.out.println(cat.CONST_INT);
		
		System.out.println(IHello.eat());
		
		System.out.println(human.drink());
		
		System.out.println();
		
		IHello.eat();

	}

}
