package com.ba.boost.day27.liskovsubstitution;

public class Runner extends Sportsmen{
	
	private int distance;

	public Runner(String name, boolean healty, int distance) {
		super(name, healty);
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	

}
