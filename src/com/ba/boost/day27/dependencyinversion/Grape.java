package com.ba.boost.day27.dependencyinversion;

public class Grape extends Fruit{

	@Override
	boolean isSeedy() {
		return true;
	}

	@Override
	boolean isSuitableForWaterExtraction() {
		return true;
	}
	
	

}