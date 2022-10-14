package com.ba.boost.atclass.desingpattern.singleton;

public class SingletonClass {
	
	private static SingletonClass instance;  // ilk adım: When you use singleton pattern, you should name instance to class' instance with private static.

	
	
	/*
	 * İkinci adım: Singleton olarak kullanılacak sınıfın default constructor'ını private plarak tanımlamak.
	 * Bu şekilde Singleton olarak kullanılacak sınıfın herhangi bir örnek oluşturmak kendi sınıfı içinde mümkün.
	 * 
	 */

	/*
	 * Dördüncü adım: Tek bir örneğine ihtiyac duydugumuz bilgileri içeren sınıfın değişkenleri tanımlıyoruz.
	 */
	
	private String name;
	private boolean correct;

	
	public SingletonClass() {
		super();
	}

	/*
	 * Ücüncü adım: bir public static getInstance() yöntemi sağlamak. Bu yöntem lazy initialization kullanarak yeni bir
	 * instance üretir ve istenilen yere teslim eder.
	 * 
	 */
	
	public static SingletonClass getInstance() {
		if (SingletonClass.instance == null) {
			SingletonClass.instance = new SingletonClass();
		}
		return SingletonClass.instance;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
}


