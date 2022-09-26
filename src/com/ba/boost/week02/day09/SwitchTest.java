package com.ba.boost.week02.day09;

import java.util.Scanner;

public class SwitchTest {
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Please enter student's grade to look him/her level: ");
		double grade = sc.nextDouble();
		
		if (grade>=90 && grade<=100) {
			System.out.println("IF: A");
		}else if (grade>=80 && grade<90) {
			System.out.println("IF: B");
		}else if (grade>=70 && grade<80) {
			System.out.println("IF: C");
		}else if (grade>=60 && grade<70) {
			System.out.println("IF: D");
		}else if (grade>=0 && grade<60) {
			System.out.println("IF: F");
		}else {
			System.err.println("IF: Please write grade between 0 and 100.");
		}
		
		int gra = (int) (grade/10);
			
		/*
		 * Before JAVA 13 using switch 
		 */
		
		switch (gra) {
		case 10:
		case 9:
			System.out.println("Classic Switch: A");
			break;
		case 8:
			System.out.println("Classic Switch: B");
			break;
		case 7:
			System.out.println("Classic Switch: C");
			break;
		case 6:
			System.out.println("Classic Switch: D");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Classic Switch: F");
			break;
		default:
		System.err.println("Classic Switch: Please write grade between 0 and 100.");
		}
		
		/*
		 * After JAVA 14 using switch
		 */
		String msg = switch (gra) {
		case 10,9: {
			
			yield "New switch: A";
		}
		case 8: {
			
			yield "New switch: B";
		}
		case 7: {
			
			yield "New switch: C";
		}
		case 6: {
			
			yield "New switch: D";
		}
		case 5,4,3,2,1,0: {
			
			yield "New switch: F";
		}
		default:
			yield "New switch: Please write grade between 0 and 100.";
		};
		System.out.println(msg );
	}
}