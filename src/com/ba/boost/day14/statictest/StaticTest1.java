package com.ba.boost.day14.statictest;

public class StaticTest1 {

	public static void main(String[] args) {

		System.out.println(StaticData1.max);
		
		
		StaticData1 obj = new StaticData1();
		System.out.println(obj.min);
	}

}
