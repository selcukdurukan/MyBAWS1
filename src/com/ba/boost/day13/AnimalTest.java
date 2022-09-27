package com.ba.boost.day13;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal cat1 = new Animal();
		cat1.setName("Sarman");
		cat1.setSpecies("Kedi");
		
		Animal cat2 = new Animal();
		cat2.setName("Pisipisi");
		cat2.setSpecies("Kedi");
		
		Animal dog1 = new Animal();
		dog1.setName("Bobby");
		dog1.setSpecies("Kopek");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(dog1);
		
		System.out.println();

		System.out.println("Evdeki tum hayvanlarin sayisi: " +Animal.getNumberOfAnimals() );
		System.out.println("Evdeki tum kopeklerin sayisi: " +Animal.getNumberOfDogs() );
		System.out.println("Evdeki tum kedilerin sayisi: " +Animal.getNumberOfCats() );
		

	}

}
