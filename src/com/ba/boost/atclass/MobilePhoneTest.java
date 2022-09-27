package com.ba.boost.atclass;

public class MobilePhoneTest {

	public static void main(String[] args) {

		MobilePhone phone = new MobilePhone();
		phone.setMobileBrand("Apple");
		phone.setCameraMP(48);
		phone.setBateryCapacity(3200);
		phone.setScreenSize(6.7);
		
		MobilePhone.showFeatures();
		
	}

}
