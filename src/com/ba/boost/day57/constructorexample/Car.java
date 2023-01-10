package com.ba.boost.day57.constructorexample;

public class Car {
	
	private double price;
	private Coachbuilder coachbuilder;
	
	
	public Car(double price, Coachbuilder coachbuilder) {
		super();
		this.price = price;
		this.coachbuilder = coachbuilder;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Coachbuilder getCoachbuilder() {
		return coachbuilder;
	}


	public void setCoachbuilder(Coachbuilder coachbuilder) {
		this.coachbuilder = coachbuilder;
	}


	@Override
	public String toString() {
		return "Car [price=" + price + ", coachbuilder=" + coachbuilder + "]";
	}
	
	
	
	
}
