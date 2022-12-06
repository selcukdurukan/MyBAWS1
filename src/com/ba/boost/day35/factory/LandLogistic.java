package com.ba.boost.day35.factory;

public class LandLogistic implements Logistic {

	@Override
	public void deliver(String good) {
		System.out.println("Karadan mal tasinir.");
		
	}

	@Override
	public void accept(String good) {
		System.out.println("Karadan mal kabul ederiz.");
		
	}

	@Override
	public String message() {
		
		return "Kara tasimaciligi." ;
	}

	@Override
	public String toString() {
		return this.message();
	}
	
	

}
