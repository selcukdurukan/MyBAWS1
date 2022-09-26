package com.ba.boost.week02.day08;

import java.util.Scanner;

public class HMGradeCalculation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ilk vize notunu giriniz: ");
		double firstMidterm = scan.nextDouble();
		
		System.out.print("Ikinci vize notunu giriniz: ");
		double secondMidterm = scan.nextDouble();
		
		System.out.print("Final sinavi notunu giriniz: ");
		double finalExam = scan.nextDouble();
		
		scan.close();
		
		if (firstMidterm >= 0 && firstMidterm <=100 && secondMidterm >= 0 && secondMidterm <=100 && finalExam >= 0 && finalExam <=100) {
			
			double result = (((firstMidterm + secondMidterm) / 2) * 0.40)+ (finalExam * 0.6) ;
			
			int grade = (int) (result / 10);
			
			switch (grade) {
			case 10:
			case 9:
			case 8:	
				System.out.println("Ogrencinin notu AA.");
				break;
			case 7:
				System.out.println("Ogrencinin notu BB.");
				break;
			case 6:
				System.out.println("Ogrencinin notu CC.");
				break;
			case 5:
				System.out.println("Ogrencinin notu DD");
				break;
			case 4:
			case 3:	
			case 2:
			case 1:
			case 0:
				System.out.println("Ogrencinin notu FF");
				break;
			default:
				System.out.println("Something had been going wrong..");
				break;
			}
			
		} else {
			System.out.println("Lutfen 0-100 arasinda bir sayi giriniz.");
		}
	}

}
