package com.ba.boost.day27.liskovsubstitution;

public class Sportsmen {
	
	private String name;
	private boolean healty;
	
	public Sportsmen(String name, boolean healty) {
		super();
		this.name = name;
		this.healty = healty;
	}

	public boolean isHealty() {
		return healty;
	}

	public void setHealty(boolean healty) {
		this.healty = healty;
	}

	public String getName() {
		return name;
	}
	
	

}
