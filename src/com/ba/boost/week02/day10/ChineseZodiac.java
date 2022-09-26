package com.ba.boost.week02.day10;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		String b;
		boolean a =false;
		do {		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please write your birth year to see your Chinese Zodiac: ");
		
		if (sc.hasNextInt()) {
			int input = sc.nextInt();
//			sc.close();
			
			{	switch (input%12) {
			case 0:
				System.out.println("Monkey");
				break;
			case 1:
				System.out.println("Cock");
				break;
			case 2:
				System.out.println("Dog");
				break;
			case 3:
				System.out.println("Pig");
				break;	
			case 4:
				System.out.println("Mouse");
				break;
			case 5:
				System.out.println("Ox");
				break;
			case 6:
				System.out.println("Tiger");
				break;
			case 7:
				System.out.println("Rabbit");
				break;	
			case 8:
				System.out.println("Dragon");
				break;
			case 9:
				System.out.println("Snake");
				break;
			case 10:
				System.out.println("Horse");
				break;
			case 11:
				System.out.println("Sheep");
				break;		
			default:
				break;
			}
			}
		} else if (!sc.hasNextInt()){
			System.out.println("Please write your birth year!!");
		} else {
			System.out.println("Something going wrong...");
		}
//		Scanner scan = new Scanner(System.in);
		System.out.print("Do you wanna try again? 1-Y or 2-N. \n");
		b = sc.next();
		
//		if (sc.hasNextInt()) {
//			int str = sc.nextInt();
//			if (str == 1) {
//				a = true;
//			}else if (str == 2){
//				a = false;
//			}
//		} else {
//			System.out.println("You have should written 1 or 2. (1-Y, 2-N).");
//		}
		
		} while (b.equalsIgnoreCase("Y"));
		
//		System.out.println("Bye");
	}

}
