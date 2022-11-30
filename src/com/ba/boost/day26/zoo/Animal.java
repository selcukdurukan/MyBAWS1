package com.ba.boost.day26.zoo;

public enum Animal {
	
	CAT(Messages.getString("Animal.CAT"), "miyavv"), DOG(Messages.getString("Animal.DOG"), "hav hav"), 
	COW(Messages.getString("Animal.COW"), "mooo"), TIGER(Messages.getString("Animal.TIGER"), "vraaow"), 
	BIRD(Messages.getString("Animal.BIRD"), "cik cik"), NOT_FOUND(Messages.getString("Animal.NOT_FOUND"), "------------"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
	
	private String name;
	private String sound;
	
	private Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}
	
	public static Animal getAnimalByName(String name) {
		Animal retVal = NOT_FOUND;
		
		if (name.equalsIgnoreCase(CAT.getName())) {
			retVal=CAT;
		} else if (name.equalsIgnoreCase(DOG.getName())) {
			retVal=DOG;
		} else if (name.equalsIgnoreCase(COW.getName())) {
			retVal=COW;
		} else if (name.equalsIgnoreCase(TIGER.getName())) {
			retVal=TIGER;
		} else if (name.equalsIgnoreCase(BIRD.getName())) {
			retVal=BIRD;
		}
			 
		return retVal;
		
	}
	

	
	
	
}
