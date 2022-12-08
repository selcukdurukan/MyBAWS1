package com.ba.boost.day37.interviewtask;

public class Hero extends GameCharacter {

	private static Hero instance;

	private Hero() {
		super.setCharName("Hero");
		super.setHp(1000);
		super.setAttack(10);
	}

	public static Hero getInstance() {
		if (instance == null) {
			instance = new Hero();
		}
		return instance;
	}

}
