package com.ba.boost.day13;

public class Animal {
	
	private static int counter;
	private static int catCounter;  // Sorting static after non-static. public protected default private....
	private String name;
	private String species;
	
	
	public Animal() {
		super();
		Animal.counter++;
	}
	
	public static int getNumberOfAnimals() {
		
		return Animal.counter;
	}
	public static int getNumberOfCats() {
		
		return Animal.catCounter;
	}
	public static int getNumberOfDogs() {
		
		return Animal.counter - Animal.catCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
		if (species.equalsIgnoreCase("kedi")) {
			Animal.catCounter++;
		}
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + "]";
	}

	
	
	
	
}
