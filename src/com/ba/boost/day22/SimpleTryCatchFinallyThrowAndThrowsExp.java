package com.ba.boost.day22;

public class SimpleTryCatchFinallyThrowAndThrowsExp {

	static Integer aVariable;

	public static void main(String[] args) {

		methodA();
		System.out.println("Main method ended.");

	}

	private static void methodA() {
		try {
			methodB();
		} catch (ProcessingCannotBeContinuedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Method A ended.");
	}

	private static void methodB() throws ProcessingCannotBeContinuedException{
		
		methodC();
		System.out.println("Method B ended.");
	}
	private static void methodC() throws ProcessingCannotBeContinuedException{

		try {
			aVariable = 0;
			int result = 3 / aVariable;
			System.out.println("Bolme islemi tamamlandi.");
			System.out.println("Bolme isleminin sonucu:" + result); // EGER BÖLEN SIFIRSA AritmeticException
		} catch (ArithmeticException e) {
			System.err.println("Sifira bolme hatasi olustu.");
			throw new ProcessingCannotBeContinuedException();
		} catch (NullPointerException e) {
			System.err.println("Null reference hatasi olustu.");
		} finally { // Hata olsun veya olmasın her zaman çalışır. Ayrıca return ile method sonlansa
					// dahi çalışır.
			System.err.println("Nihayet hata isleminin sonuna vardik.");
		}
		System.out.println("Method C ended.");
	}

}
