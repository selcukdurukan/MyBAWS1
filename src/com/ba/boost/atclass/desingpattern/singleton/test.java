package com.ba.boost.atclass.desingpattern.singleton;

public class test {

	public static void main(String[] args) {

		SingletonClass instance = SingletonClass.getInstance(); // 3. adım sayesinde instance'a erişebiliyoruz.
		
		instance.setName("Tekton");
		System.out.println(SingletonClass.getInstance().getName());;

	}

}
