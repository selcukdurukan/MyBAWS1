package com.ba.boost.atclass.desingpattern.factory;

public class SeaLogistic implements Logistic{

	@Override
	public void deliver(String good) {
		System.out.println("Denizden mal tasinir.");
		
	}

	@Override
	public void accept(String good) {
		System.out.println("Denizden mal kabul ederiz.");
		
	}
	
	@Override
	public String message() {
		
		return "Deniz tasimaciligi." ;
	}

	@Override
	public String toString() {
		return this.message();
	}
}
