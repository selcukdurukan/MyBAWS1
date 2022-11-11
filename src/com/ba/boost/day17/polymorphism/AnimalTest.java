package com.ba.boost.day17.polymorphism;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal pig = new Pig();
		Animal dog = new Dog();
		
		pig.animalSound();
		dog.animalSound();
	}

}
