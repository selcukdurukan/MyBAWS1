package com.ba.boost.week02.atclass.hospital;

import java.util.Scanner;

public class Test {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Adult or Child? A/C");
		String ac = scan.next();

		if (ac.equalsIgnoreCase("a")) {
			System.out.println("\nThis person is a adult.");
			System.out.println("Adult's name: ");
			String ac1 = scan.nextLine();
			scan.next();
			System.out.println("Adult's age: ");
			int ac3 = scan.nextInt();
			scan.nextLine();
			System.out.println("Is this adult person healthy or unhealty?: H/U ");
			String ac2 = scan.nextLine();
			if (ac2.equalsIgnoreCase("h")) {
				boolean ac21 = true;
				Adult a1 = new Adult(ac1, ac21, ac3);
				System.out.println(a1);
				System.out.println("This adult person has been checked up.");
			} else if (ac2.equalsIgnoreCase("u")) {
				boolean ac21 = false;
				Adult a1 = new Adult(ac1, ac21, ac3);
				System.out.println(a1);
				System.out.println("This adult person has been examined.");
			} else {
				System.out.println("You have written wrong letter.");

			}

		} else if (ac.equalsIgnoreCase("c")) {
			System.out.println("\nThis person is a child.");
			System.out.println("Child's name: ");
			String ac1 = scan.nextLine();
			scan.next();
			System.out.println("Child's age: ");
			int ac3 = scan.nextInt();
			scan.nextLine();
			System.out.println("Is this child person healthy or unhealty?: H/U ");
			String ac2 = scan.nextLine();
			System.out.println("Does this child person want her/his teeth checks up?: Y/N ");
			String ac4 = scan.nextLine();
			if (ac4.equalsIgnoreCase("y")) {
				boolean ac41 = true;
				if (ac2.equalsIgnoreCase("h")) {
					boolean ac21 = true;
					Child a1 = new Child(ac2, ac21, ac3, ac41);
					System.out.println(a1);
					System.out.println("This child has been checked up.");
					System.out.println("This child has been checked teeth up");
				} else if (ac2.equalsIgnoreCase("u")) {
					boolean ac21 = false;
					Child a1 = new Child(ac2, ac21, ac3, ac41);
					System.out.println(a1);
					System.out.println("This child has been examined.");
					System.out.println("This child has been checked teeth up");
				} else {
					System.out.println("You have written wrong letter.");
				}
			} else if (ac4.equalsIgnoreCase("n")) {
				boolean ac41 = false;
				if (ac2.equalsIgnoreCase("h")) {
					boolean ac21 = true;
					Child a1 = new Child(ac2, ac21, ac3, ac41);
					System.out.println(a1);
					System.out.println("This child has been checked up.");
					System.out.println("This child hasn't been checked teeth up");
				} else if (ac2.equalsIgnoreCase("u")) {
					boolean ac21 = false;
					Child a1 = new Child(ac2, ac21, ac3, ac41);
					System.out.println(a1);
					System.out.println("This child has been examined.");
					System.out.println("This child hasn't been checked teeth up");
				} else {
					System.out.println("You have written wrong letter.");
				}
			} else {
				System.out.println("You have written wrong letter.");
			}
		} else {
			System.out.println("You have written wrong letter.");
		}

	}
}
