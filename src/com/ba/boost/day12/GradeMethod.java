package com.ba.boost.day12;

public class GradeMethod {

	public static void main(String[] args) {
		
		String a="";
		System.out.println(gradeMethod(150));

	}

	private static String gradeMethod(double a) {
		String rank;
		if (a>=200.5) {
			rank = "A";
		} else if (a>=122.4 && a < 200.5){
			rank = "B";
		}else {
			rank = "C";
		}
		return "Your rank is: " + rank ;
		
	}

}
