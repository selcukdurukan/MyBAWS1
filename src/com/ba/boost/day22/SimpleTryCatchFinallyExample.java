package com.ba.boost.day22;

public class SimpleTryCatchFinallyExample {

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
			// Return ile dönemek için.
//			if (1 == 2 / 2) {
//				return;
//			}
			System.out.println(3 / 1); // EGER BÖLEN SIFIRSA AritmeticException
			System.out.println("Bolme islemi tamamlandi.");
			aVariable.intValue(); // NullPointerException
		} catch (ArithmeticException e) {
			System.err.println("Sifira bolme hatasi olustu.");
		} catch (NullPointerException e) {
			System.err.println("Null reference hatasi olustu.");
		} catch (Exception e) {
			System.err.println("Hata olustu.");
		} finally { // Hata olsun veya olmasın her zaman çalışır. Ayrıca return ile method sonlansa
					// dahi çalışır.
			System.err.println("Nihayet hata isleminin sonuna vardik.");
		}
		System.out.println("Method C ended.");
	}

}
