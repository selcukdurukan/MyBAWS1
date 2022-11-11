package com.ba.boost.day18.library.model;

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

	public Video(String name, LocalDate productionDate, int availableAmount, double basePrice) {
		super(name, productionDate, availableAmount, basePrice);
	}

	public Resolution getResolution() {
		return resolution;
	}

	public String[] getActors() {
		return actors;
	}
	
	@Override
	public int getAvailableAmountInfo() {
		return this.getAvailableAmount();
	}

	@Override
	public String getNameInfo() {
		return this.getName();
	}

	@Override
	public void updateAmountInfo(int amount) {
		this.setAvailableAmount(amount);
	}

	@Override
	public String toString() {
		return "Video [resolution=" + resolution + ", actors=" + Arrays.toString(actors) + ", toString()="
				+ super.toString() + "]";
	}



}
