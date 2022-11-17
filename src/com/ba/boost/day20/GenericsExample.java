package com.ba.boost.day20;

import java.util.LinkedList;

public class GenericsExample {

	public static void main(String[] args) {

		beforeJava5();
		afterJava5();
	}

	private static void afterJava5() {
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(15);
		integers.add(100000);
		
		for (Integer i : integers) {
			System.out.println(i);
		}
		
		LinkedList<ChildAge> aClassList = new LinkedList<>();
		aClassList.add(new ChildAge("Ali", 5));
		aClassList.add(new ChildAge("Hakan", 6));
		
		
	}

	private static void beforeJava5() {
		LinkedList linkL = new LinkedList();  //LinkedList<Object> linkL = new LinkedList<>(); ---> same thing.
		
		linkL.add("Merhaba");
		linkL.add(1);
		linkL.add(false);
		linkL.add(1.5);

		for (Object object : linkL) {
			System.out.println(object);

			if (object instanceof Integer) {
				int a = (int) object;
				a = a + 1;
			}
		}

	}
}
