package com.ba.boost.day14.statictest;

public class StaticTest {

	public static void main(String[] args) {
		
		
		
		System.out.println(StaticData.add(10, 15));  // Because static
		
		StaticData obj = new StaticData();   // We should create instance because multiply is not a static.
		System.out.println(obj.mutiply(5, 2));

	}

}
