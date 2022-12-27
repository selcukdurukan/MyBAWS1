package com.ba.boost.day52.oop;

public class OopTest {

	public static void main(String[] args) {

		Mother mother = new Mother();
		mother.firstName = "Ayse";
		mother.lastName = "Durukan";
		mother.writeConsole(mother.firstName, mother.lastName );

		Father father = new Father();
		father.firstName = "Mehmet";
		father.lastName = "Durukan";
		mother.writeConsole(father.firstName, father.lastName);

		Child child = new Child();
		child.firstName = "Selcuk";
		child.lastName = "Durukan";
		mother.writeConsole(child.firstName, child.lastName);
		
		GoodChild goodChild = new GoodChild();
		goodChild.firstName = "Can";
		goodChild.lastName = "Durukan";
		goodChild.behavior = "Good";
		goodChild.writeBehaviorWithName(goodChild.firstName, goodChild.lastName, goodChild.behavior);


	}

}
