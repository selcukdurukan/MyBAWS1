package com.ba.boost.day22;

public class SimpleTryCatchExample {
	
	static Integer aVariable;

	public static void main(String[] args) {
		
		methodA();
		System.out.println("Main method ended.");

	}

	private static void methodA() {
		methodB();
		System.out.println("Method A ended.");
	}

	private static void methodB() {
		methodC();
		System.out.println("Method B ended.");
	}

	private static void methodC() {
		try {
			System.out.println(3 / 1);    
			System.out.println("Bolme islemi tamamlandi.");
			aVariable.intValue();
		} catch (ArithmeticException e) {
			System.err.println("Sifira bolme hatasi olustu.");
		} catch (NullPointerException e) {
			System.err.println("Null reference hatasi olustu.");
		} catch (Exception e) {
			System.err.println("Hata olustu.");
		}
		System.out.println("Method C ended.");		
	}

}
