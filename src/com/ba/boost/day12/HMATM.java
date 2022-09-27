package com.ba.boost.day12;

import java.util.Scanner;

public class HMATM {

	public static void main(String[] args) {
		
	  String userName = "user";
	  String password = "123";
	  double money = 1500;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Hello from xxx bank... \n\t1)Deposit money \n\t2)Whitdraw Money \n\t3)Look at your account view \n\t4)Exit");
	  int input = sc.nextInt();
	  
	  if (sc.hasNextInt()) {
		System.out.println("ok");
		switch (input) {
		case 1:
			System.out.println("Your money is: " +money);
			System.out.println("Write deposit amount: ");
			double deposit = sc.nextDouble();
			if (deposit<=0) {
				System.out.println("You cannot deposit: " +deposit);
			} 
			money = money + deposit;
			System.out.println("Your money now: " +money + "You have added: " +deposit);
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			System.exit(0);
			break;
		default:
			break;
		}
	} else {
		System.out.println("Please push 1, 2, 3 or 4.");
	}
		
	}

}
