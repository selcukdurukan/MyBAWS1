package com.ba.boost.day35.singleton;

public class SingletonClass {

	private static SingletonClass instance; // ilk adım: Bir singleton pattern oluştumak için instance adında bir
											// private static değişken tanımlamak.

	/*
	 * İkinci adım: Singleton olarak kullanılacak sınıfın default constructor'ını
	 * private plarak tanımlamak. Bu şekilde Singleton olarak kullanılacak sınıfın
	 * herhangi bir örnek oluşturmak kendi sınıfı içinde mümkün.
	 * 
	 */

	/*
	 * Dördüncü adım: Tek bir örneğine ihtiyac duydugumuz bilgileri içeren sınıfın
	 * değişkenleri tanımlıyoruz.
	 */
	
	private String name;

	private SingletonClass() {
		super();
	}

	/*
	 * Ücüncü adım: bir public static getInstance() yöntemi sağlamak. Bu yöntem lazy
	 * initialization kullanılarak yeni bir instance üretir ve istenilen yere teslim
	 * eder.
	 * 
	 */

	public static SingletonClass getInstance() {
		if (SingletonClass.instance == null) {
			SingletonClass.instance = new SingletonClass();   //NullPointException yememek için
		}
		return SingletonClass.instance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
