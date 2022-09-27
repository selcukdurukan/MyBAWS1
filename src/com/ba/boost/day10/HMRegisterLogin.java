package com.ba.boost.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HMRegisterLogin {

	public static void main(String[] args) {
		String inputName;
		String inputPassword;
		int i = 1;
		Map<String, String> userMap = new HashMap<>();
		
		
		while (i <= 3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Hello...... \n\t 1) Register \n\t 2) Login \n\t 3) Exit");
			int inputMenu = sc.nextInt();
			
			switch (inputMenu) {
			case 1:
				System.out.print("Please write nickname to create new account: ");
				inputName = sc.next();
				System.out.print("Please write password to create new account: ");
				inputPassword = sc.next();
				userMap.put(inputName, inputPassword);
				System.out.println("Your account has been created.");
				System.out.println();
				break;
			case 2:
				System.out.print("Please write nickname to connect your account: ");
				String inputConName = sc.next();
				if (userMap.containsKey(inputConName)) {
					System.out.print("Please write password to connect your account: ");
					String inputConPassword = sc.next();
					if (userMap.containsValue(inputConPassword)) {
						System.out.println("Successful connection...");
						return;
					} else {
						System.out.println("Wrong password!!!");
						int a = 3-i;	
						System.err.println(i +" . unsuccessful login. There are " + a + " login attempt.");
						i++;
					}
				}else {
					System.out.println("Wrong nickname!!!");
					int a = 3-i;	
					System.err.println(i +" . unsuccessful login. There are " + a + " login attempt.");
					i++;
				}
				break;
			case 3:
				System.out.println("Bye...");
				System.exit(0);
			default:
				System.out.println("Something going wrong...");
				break;
			}
			
		}

	}

}
