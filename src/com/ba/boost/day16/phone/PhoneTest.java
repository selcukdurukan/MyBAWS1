package com.ba.boost.day16.phone;

public class PhoneTest {

	public static void main(String[] args) {
	
		Phone p = new Phone();
		p.setBrand("Apple");
		p.setCameraMP(13.2);
		p.setScrenSize(6.1);
		
		p.showFeatures();
		p.takePhote();
		p.takePhote();
		p.showFeatures();
		
		Phone p1 = new Phone("Samsung", 46, 6.7);
		p1.showFeatures();

	}

}
