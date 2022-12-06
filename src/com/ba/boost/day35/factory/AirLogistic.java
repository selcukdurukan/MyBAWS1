package com.ba.boost.day35.factory;

public class AirLogistic implements Logistic{

	@Override
	public void deliver(String good) {
		System.out.println("Havadan mal tasinir.");
		
	}

	@Override
	public void accept(String good) {
		System.out.println("Havadan mal kabul ederiz.");
		
	}
	
	@Override
	public String message() {
		
		return "Hava tasimaciligi." ;
	}

	@Override
	public String toString() {
		return this.message();
	}
}
