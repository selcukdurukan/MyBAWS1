package com.ba.boost.day27.dependencyinversion;

public abstract class Fruit {
	
	private String name;
	
	abstract boolean isSeedy();
	abstract boolean isSuitableForWaterExtraction();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
