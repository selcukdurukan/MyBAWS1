package com.ba.boost.day12;

import java.util.Scanner;

public class HMATM {

	public static void main(String[] args) {
		
	 final String USER_NAME = "user";
	 final String PASSWORD = "123";
	  double money = 1500;
	  int i = 0;
	  do {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Please write your user name: ");
		  String inputUserName = sc.next();
		  
		  System.out.print("Please write your password: ");
		  String inputPassword =sc.next();
		  
		  if (inputUserName.equalsIgnoreCase(USER_NAME) && inputPassword.equals(PASSWORD)) {
			  while (true) {
				  System.out.println();
				  System.out.println("Hello from xxx bank... \n\t1)Deposit money \n\t2)Whitdraw Money \n\t3)Look at your account view \n\t4)Exit");
				  
				  if (sc.hasNextInt()) {
					  int input = sc.nextInt();
					  if (input>0 && input<5) {
							switch (input) {
							case 1:
								System.out.println("Your money is: " +money);
								System.out.println("Write deposit amount: ");
								double deposit = sc.nextDouble();
								if (deposit<=0) {
									System.out.println("You cannot deposit: " +deposit);
									System.out.println();
									break;
								} 
								money = money + deposit;
								System.out.println("Your money now: " +money + " You have added: " +deposit);
								break;
							case 2:
								System.out.println("Your money is: " +money);
								System.out.println("Write whitdraw amount: ");
								double whitdraw = sc.nextDouble();
								if (money<whitdraw) {
									System.out.println("You cannot deposit: " +whitdraw);
									System.out.println();
									break;
								} 
								money = money - whitdraw;
								System.out.println("Your money now: " +money + " You have withdrawn: " +whitdraw);
								break;
							case 3:
								System.out.println("Your bank account amount is: " +money);
								break;
							case 4:
								System.exit(0);
								break;
							default:
								System.out.println("Something going wrong...");
								break;
							}
						
					} else {
						System.out.println("Please push 1-2-3 or 4.");
					}
				} else {
					System.out.println("Please push 1-2-3 or 4.");
				}
			
			}
			  
		  } else {
			i++;
			System.err.println("You have 3 attempt and now you used " +i +". attempt");
			if (i==3) {
				System.err.println("Your cars is blocked. Please contact with 444-44-44");
			}
		}
		  
	} while (i<3);
	  System.out.println("Bye..");
	} 
		

}
