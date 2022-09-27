package com.ba.boost.day13;

public class LifeofVarible {
	private String str; // nesne değişkeni: ancak LifeofVarible sınıfından new ile bir nesne üretilirse
						// bu özniteliğe erişebilir.
	
	private static String anotherString; // sınıf değişkeni: Sınıf içindeki tüm static ve non-static method ve yerlerden
											// erişilebilir.

	public static void main(String[] args) {

//		str = "Hello" ==> hata! önce nesne üretmek gerekli.

		LifeofVarible.anotherString = "Hello";

		bMethod();

	}

	private static void bMethod() {
		anotherString = "hELLO";
		
	}

	private void aMethod() {
		str = "Hello";
		this.str = "Yeniden hello";
		anotherString = "Hello";
		LifeofVarible.anotherString = "Yine hello"; // sınıf değikenleri this'in kullanıldığı şekilde sınıf adı ile
													// kullanılabilir.
		this.anotherString = ""; // ==> Böyle kullanmak hata değil ama önerilmez.
	}

}
