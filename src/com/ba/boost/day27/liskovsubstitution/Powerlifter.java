package com.ba.boost.day27.liskovsubstitution;

public class Powerlifter extends Sportsmen{
	
	private int maxWeight;

	public Powerlifter(String name, boolean healty, int maxWeight) {
		super(name, healty);
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	

}
