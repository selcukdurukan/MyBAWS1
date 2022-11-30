package com.ba.boost.day26.zoo;

import java.util.Scanner;

public class ZooTest {

	public static void main(String[] args) {
		Messages.init("de"); //Bu olmadan da çalışır cunku easy inilazation.
		Scanner sc = new Scanner(System.in);
		System.out.println(Messages.getString("ZooTest.INPUT")); //$NON-NLS-1$
		String animalName = sc.nextLine();
		Animal animal = Animal.getAnimalByName(animalName);
		System.out.println(Messages.getString("ZooTest.OUTPUT") + animal.getName() + " " + animal.getSound() ); //$NON-NLS-1$
		sc.close();
		
		
		

	}

}
