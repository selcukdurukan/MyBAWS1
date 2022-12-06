package com.ba.boost.day35.singleton;

public class SingletonTest {

	public static void main(String[] args) {

		// İkinci adim ile bunu yapamam.
//		SingletonClass single = new SingletonClass(); 

		SingletonClass instance = SingletonClass.getInstance(); // 3. adım sayesinde instance'a erişebiliyoruz.

		instance.setName("Tekton");
		System.out.println(SingletonClass.getInstance().getName());

		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(instance2.getName()); // Tek instance olacagı için hep aynı name.

	}

}
