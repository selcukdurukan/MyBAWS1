package com.ba.boost.day34.threadexample;

public class Sprinter1 implements Runnable {

	Race race;

	public Sprinter1(Race race) {
		super();
		this.race = race;
	}

	@Override
	public void run() {

		this.race.race();

	}

}
