package com.ba.boost.week02.day12;

public class DodekaHobia {

	public static void main(String[] args) {
		
		randomNumber20_1Without12();
		randomNumberA_1WithoutC(3,2);
	   
	}

	private static void randomNumberA_1WithoutC(int a, int c) {
		
		 int a1 = (int) (Math.random()*a +1);
//		    System.out.println(a);
		    
		    while (a1 == c) {
		    	a1 = (int) (Math.random()*a +1);
		    	if (a1 != c) break;
			}
		     System.out.println(a1);
	}

	private static void randomNumber20_1Without12() {
		
		 int a = (int) (Math.random()*20 +1);
//		    System.out.println(a);
		    
		    while (a == 12) {
		    	a = (int) (Math.random()*20 +1);
		    	if (a != 12) break;
			}
		     System.out.println(a);
	}

}
