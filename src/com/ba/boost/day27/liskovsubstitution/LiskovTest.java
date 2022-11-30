package com.ba.boost.day27.liskovsubstitution;

public class LiskovTest {

	public static void main(String[] args) {
		
		Runner r1 = new Runner("Kosucu 1", true, 100);
		Powerlifter p1 = new Powerlifter("Halterci 1", true, 120);
		
		Sportsmen r2 = new Runner("Kosucu 2", true, 20000);   //Liskov's substitution principle
		Sportsmen p2 = new Powerlifter("Halterci 2", true, 100);
		
		r2 = p1;  // Parent = Child
		
		

	}

}
