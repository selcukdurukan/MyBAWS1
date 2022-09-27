package com.ba.boost.atclass.libary;

import java.time.LocalDate;
import java.util.Arrays;

public class Video extends Product implements Rentable {

	private Resolution resolution;
	private String[] actors;
	
	public Video(String name, LocalDate productionDate, int availableAmount, double basePrice, Resolution resolution,
			String[] actors) {
		super(name, productionDate, availableAmount, basePrice);
		this.resolution = resolution;
		this.actors = actors;
	}


	public Resolution getResolution() {
		return resolution;
	}

	public String[] getActors() {
		return actors;
	}

	@Override
	public String toString() {
		return "Video [resolution=" + resolution + ", actors=" + Arrays.toString(actors) + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public int getAvaibleAmountInfo() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getNameInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateAmountInfo(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	
}
