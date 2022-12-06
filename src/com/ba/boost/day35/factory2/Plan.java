package com.ba.boost.day35.factory2;

public abstract class Plan {
	
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}

}
