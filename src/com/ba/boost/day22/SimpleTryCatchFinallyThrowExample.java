package com.ba.boost.day22;

public class SimpleTryCatchFinallyThrowExample {

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
			aVariable = 1;
			int result = 3 / aVariable;
			System.out.println("Bolme islemi tamamlandi.");
			System.out.println("Bolme isleminin sonucu:" +  result); // EGER BÖLEN SIFIRSA AritmeticException
			if (result == 3) {
				throw new ResultMustNotBe3Exception("Bolme islemninin sonucu 3 olmamaliydi.");
			}
		} catch (ArithmeticException e) {
			System.err.println("Sifira bolme hatasi olustu.");
		} catch (NullPointerException e) {
			System.err.println("Null reference hatasi olustu.");
		} catch (Exception e) {
			System.err.println("Hata olustu. " + e.getMessage() + e.getClass());
		} finally { // Hata olsun veya olmasın her zaman çalışır. Ayrıca return ile method sonlansa
					// dahi çalışır.
			System.err.println("Nihayet hata isleminin sonuna vardik.");
		}
		System.out.println("Method C ended.");
	}

}
